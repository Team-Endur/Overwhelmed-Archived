package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.world.entity.animal.SnailEntity;

import static overwhelmed.overwhelmed.Overwhelmed.MOD_ID;

public class EntityRegistry {
    public static RegistrySupplier<EntityType<SnailEntity>> gardenSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> garySnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> limestoneSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> romanSnailEntityType;

    public static final TagKey<Biome> SPAWNS_GARDEN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_garden_snails"));
    public static final TagKey<Biome> SPAWNS_LIMESTONE_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_limestone_snails"));
    public static final TagKey<Biome> SPAWNS_ROMAN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_roman_snails"));

    public static void registerEntities() {
        gardenSnailEntityType = Overwhelmed.entityTypes.register(new ResourceLocation(MOD_ID, "garden_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("garden_snail"));
        garySnailEntityType = Overwhelmed.entityTypes.register(new ResourceLocation(MOD_ID, "gary_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("gary_snail"));
        limestoneSnailEntityType = Overwhelmed.entityTypes.register(new ResourceLocation(MOD_ID, "limestone_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("limestone_snail"));
        romanSnailEntityType = Overwhelmed.entityTypes.register(new ResourceLocation(MOD_ID, "roman_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("roman_snail"));

        EntityAttributeRegistry.register(gardenSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(garySnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(limestoneSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(romanSnailEntityType, SnailEntity::createAttributes);
    }
}
