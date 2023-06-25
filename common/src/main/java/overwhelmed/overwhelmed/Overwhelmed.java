package overwhelmed.overwhelmed;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import overwhelmed.overwhelmed.registry.BlockRegistry;
import overwhelmed.overwhelmed.registry.CreativeTabRegistry;
import overwhelmed.overwhelmed.registry.EntityRegistry;
import overwhelmed.overwhelmed.registry.ItemRegistry;


public class Overwhelmed {
	public static final String MOD_ID = "overwhelmed";

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
			= DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
			= DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

	public static void init() {
		CreativeTabRegistry.registerCreativeTab();
		EntityRegistry.registerEntities();
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
	}
}