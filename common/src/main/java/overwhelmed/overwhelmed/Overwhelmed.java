package overwhelmed.overwhelmed;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.*;
import net.minecraft.world.level.biome.Biome;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;
import overwhelmed.overwhelmed.world.item.SnailSpawnEggItem;

import java.util.function.Supplier;

public class Overwhelmed
{
	public static final String MOD_ID = "overwhelmed";

	public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
	public static Registrar<EntityType<?>> entityTypes;
	public static Registrar<Item> items;
	public static RegistrySupplier<EntityType<SnailEntity>> gardenSnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> garySnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> limestoneSnailEntityType;
	public static RegistrySupplier<EntityType<SnailEntity>> romanSnailEntityType;
	public static RegistrySupplier<SnailSpawnEggItem> snailSpawnEggItem;
	public static RegistrySupplier<Item> snailShellItem;
	public static RegistrySupplier<Item> gooBallItem;
	public static RegistrySupplier<Item> goldBeadItem;
	public static RegistrySupplier<Item> iceCrystalShardItem;
	public static RegistrySupplier<Item> iceCubeItem;
	public static RegistrySupplier<Item> pebbleItem;
	public static final TagKey<Biome> SPAWNS_GARDEN_SNAILS = TagKey.create(Registries.BIOME,
			new ResourceLocation(MOD_ID, "spawns_garden_snails"));
	public static final TagKey<Biome> SPAWNS_LIMESTONE_SNAILS = TagKey.create(Registries.BIOME,
			new ResourceLocation(MOD_ID, "spawns_limestone_snails"));
	public static final TagKey<Biome> SPAWNS_ROMAN_SNAILS = TagKey.create(Registries.BIOME,
			new ResourceLocation(MOD_ID, "spawns_roman_snails"));
	public static DeferredRegister<CreativeModeTab> TABS =
			DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
	public static RegistrySupplier<CreativeModeTab> MY_TAB = TABS.register(
			"overwhelmed_tab",
			() -> CreativeTabRegistry.create(
					Component.translatable("category.overwhelmed"),
					() -> new ItemStack(Overwhelmed.snailShellItem.get())
			)
	);
	public static void init() {

		entityTypes = MANAGER.get().get(Registries.ENTITY_TYPE);
		items = MANAGER.get().get(Registries.ITEM);
		TABS.register();


		gardenSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "garden_snail"), () ->
				EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("garden_snail"));
		garySnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "gary_snail"), () ->
				EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("gary_snail"));
		limestoneSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "limestone_snail"), () ->
				EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("limestone_snail"));
		romanSnailEntityType = entityTypes.register(new ResourceLocation(MOD_ID, "roman_snail"), () ->
				EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
						.sized(0.6f, 0.4f)
						.clientTrackingRange(8)
						.build("roman_snail"));

		EntityAttributeRegistry.register(gardenSnailEntityType, SnailEntity::createAttributes);
		EntityAttributeRegistry.register(garySnailEntityType, SnailEntity::createAttributes);
		EntityAttributeRegistry.register(limestoneSnailEntityType, SnailEntity::createAttributes);
		EntityAttributeRegistry.register(romanSnailEntityType, SnailEntity::createAttributes);

		snailShellItem = items.register(new ResourceLocation(MOD_ID, "snail_shell"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.COMMON)
						.arch$tab(MY_TAB)));
		snailSpawnEggItem = items.register(new ResourceLocation(MOD_ID, "snail_spawn_egg"), () ->
				new SnailSpawnEggItem(new Item.Properties()
						.arch$tab(CreativeModeTabs.SPAWN_EGGS)
						.arch$tab(MY_TAB)));


		gooBallItem = items.register(new ResourceLocation(MOD_ID, "goo_ball"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.COMMON)
						.arch$tab(MY_TAB)));
		goldBeadItem = items.register(new ResourceLocation(MOD_ID, "gold_bead"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.UNCOMMON)
						.arch$tab(MY_TAB)));
		iceCrystalShardItem = items.register(new ResourceLocation(MOD_ID, "ice_crystal_shard"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.UNCOMMON)
						.arch$tab(CreativeModeTabs.INGREDIENTS)));
		iceCubeItem = items.register(new ResourceLocation(MOD_ID, "ice_cube"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.COMMON)
						.arch$tab(MY_TAB)));
		pebbleItem = items.register(new ResourceLocation(MOD_ID, "pebble"), () ->
				new Item(new Item.Properties()
						.stacksTo(64)
						.rarity(Rarity.COMMON)
						.arch$tab(MY_TAB)));

	}


}