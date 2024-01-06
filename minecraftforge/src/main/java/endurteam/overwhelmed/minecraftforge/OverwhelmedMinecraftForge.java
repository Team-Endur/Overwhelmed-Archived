/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023-2024 Endurteam<br>
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

package endurteam.overwhelmed.minecraftforge;

import endurteam.overwhelmed.minecraftforge.client.OverwhelmedMinecraftForgeClient;
import endurteam.overwhelmed.minecraftforge.particles.OverwhelmedMinecraftForgeParticleTypes;
import endurteam.overwhelmed.minecraftforge.sounds.OverwhelmedMinecraftForgeSoundEvents;
import endurteam.overwhelmed.minecraftforge.world.entity.OverwhelmedMinecraftForgeEntityTypes;
import endurteam.overwhelmed.minecraftforge.world.item.OverwhelmedMinecraftForgeCreativeTabs;
import endurteam.overwhelmed.minecraftforge.world.item.OverwhelmedMinecraftForgeItems;
import endurteam.overwhelmed.minecraftforge.world.level.block.OverwhelmedMinecraftForgeBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedMinecraftForge {
    public OverwhelmedMinecraftForge() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::register);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerCreativeTabs);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::entityAttributeCreationEvent);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () ->
                (() -> OverwhelmedMinecraftForgeClient.initClient(FMLJavaModLoadingContext.get().getModEventBus())));
    }

    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.PARTICLE_TYPES.getRegistryKey(),
                OverwhelmedMinecraftForgeParticleTypes::registerParticleTypes);
        event.register(ForgeRegistries.SOUND_EVENTS.getRegistryKey(),
                OverwhelmedMinecraftForgeSoundEvents::registerSoundEvents);
        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                OverwhelmedMinecraftForgeCreativeTabs::registerModCreativeTab);
        event.register(ForgeRegistries.ENTITY_TYPES.getRegistryKey(),
                OverwhelmedMinecraftForgeEntityTypes::registerEntities);
        event.register(ForgeRegistries.BLOCKS.getRegistryKey(),
                OverwhelmedMinecraftForgeBlocks::registerBlocks);
        event.register(ForgeRegistries.ITEMS.getRegistryKey(),
                OverwhelmedMinecraftForgeItems::registerItems);
    }

    @SubscribeEvent
    public void registerCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        OverwhelmedMinecraftForgeCreativeTabs.registerCreativeTabs(event);
    }

    @SubscribeEvent
    public void entityAttributeCreationEvent(EntityAttributeCreationEvent event) {
        OverwhelmedMinecraftForgeEntityTypes.entityAttributeCreationEvent(event);
    }

}