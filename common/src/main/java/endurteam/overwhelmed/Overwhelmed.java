package endurteam.overwhelmed;

import dev.architectury.registry.registries.DeferredRegister;
import endurteam.overwhelmed.registry.*;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
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

	public static void init() {
		ParticleTypeRegistry.registerParticleTypes();
		SoundEventRegistry.registerSoundEvents();
		CreativeTabRegistry.registerCreativeTab();
		EntityTypeRegistry.registerEntities();
		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();
	}
}