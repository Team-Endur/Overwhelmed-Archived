package overwhelmed.overwhelmed;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import overwhelmed.overwhelmed.registry.BlockRegistry;
import overwhelmed.overwhelmed.registry.CreativeTabRegistry;
import overwhelmed.overwhelmed.registry.EntityRegistry;
import overwhelmed.overwhelmed.registry.ItemRegistry;

import java.util.function.Supplier;


public class Overwhelmed {
	public static final String MOD_ID = "overwhelmed";

	public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
	public static Registrar<EntityType<?>> entityTypes;
	public static Registrar<Item> items;
	public static Registrar<Block> blocks;

	public static void init() {

		entityTypes = MANAGER.get().get(Registries.ENTITY_TYPE);
		items = MANAGER.get().get(Registries.ITEM);
		blocks = MANAGER.get().get(Registries.BLOCK);

		CreativeTabRegistry.registerCreativeTab();
		EntityRegistry.registerEntities();
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();

	}
}