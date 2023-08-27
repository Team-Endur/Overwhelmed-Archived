package endurteam.overwhelmed;

import dev.architectury.registry.registries.DeferredRegister;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import endurteam.overwhelmed.world.effect.OverwhelmedMobEffects;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
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