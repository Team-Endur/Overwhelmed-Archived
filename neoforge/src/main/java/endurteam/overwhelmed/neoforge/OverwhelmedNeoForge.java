/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.neoforge;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.neoforge.client.OverwhelmedNeoForgeClient;
import endurteam.overwhelmed.neoforge.particles.OverwhelmedNeoForgeParticleTypes;
import endurteam.overwhelmed.neoforge.sounds.OverwhelmedNeoForgeSoundEvents;
import endurteam.overwhelmed.neoforge.world.entity.OverwhelmedNeoForgeEntityTypes;
import endurteam.overwhelmed.neoforge.world.item.OverwhelmedNeoForgeCreativeTabs;
import endurteam.overwhelmed.neoforge.world.item.OverwhelmedNeoForgeItems;
import endurteam.overwhelmed.neoforge.world.level.block.OverwhelmedNeoForgeBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedNeoForge {
    public OverwhelmedNeoForge(IEventBus bus) {
        bus.addListener(this::register);
        bus.addListener(this::registerCreativeTabs);
        bus.addListener(this::entityAttributeCreationEvent);
        if (FMLLoader.getDist() == Dist.CLIENT)
        {
            OverwhelmedNeoForgeClient.initClient(bus);
        }
    }

    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(BuiltInRegistries.PARTICLE_TYPE.key(),
                OverwhelmedNeoForgeParticleTypes::registerParticleTypes);
        event.register(BuiltInRegistries.SOUND_EVENT.key(),
                OverwhelmedNeoForgeSoundEvents::registerSoundEvents);
        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                OverwhelmedNeoForgeCreativeTabs::registerModCreativeTab);
        event.register(BuiltInRegistries.ENTITY_TYPE.key(),
                OverwhelmedNeoForgeEntityTypes::registerEntities);
        event.register(BuiltInRegistries.BLOCK.key(),
                OverwhelmedNeoForgeBlocks::registerBlocks);
        event.register(BuiltInRegistries.ITEM.key(),
                OverwhelmedNeoForgeItems::registerItems);
    }

    @SubscribeEvent
    public void registerCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        OverwhelmedNeoForgeCreativeTabs.registerCreativeTabs(event);
    }

    @SubscribeEvent
    public void entityAttributeCreationEvent(EntityAttributeCreationEvent event) {
        OverwhelmedNeoForgeEntityTypes.entityAttributeCreationEvent(event);
    }

}