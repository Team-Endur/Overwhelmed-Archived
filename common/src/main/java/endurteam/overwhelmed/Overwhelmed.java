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

package endurteam.overwhelmed;

import dev.architectury.registry.registries.DeferredRegister;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import endurteam.overwhelmed.world.effect.OverwhelmedMobEffects;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

public class Overwhelmed {
	public static final String MOD_ID = "overwhelmed";

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
			= DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
			= DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
			DeferredRegister.create(MOD_ID, Registries.SOUND_EVENT);
	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES
			= DeferredRegister.create(MOD_ID, Registries.PARTICLE_TYPE);
	public static final DeferredRegister<MobEffect> MOB_EFFECTS
			= DeferredRegister.create(MOD_ID, Registries.MOB_EFFECT);

	public static void init() {
		OverwhelmedMobEffects.registerMobEffects();
		OverwhelmedParticleTypes.registerParticleTypes();
		OverwhelmedSoundEvents.registerSoundEvents();
		OverwhelmedCreativeTabs.registerCreativeTab();
		OverwhelmedEntityTypes.registerEntities();
		OverwhelmedBlocks.registerBlocks();
		OverwhelmedItems.registerItems();
	}
}