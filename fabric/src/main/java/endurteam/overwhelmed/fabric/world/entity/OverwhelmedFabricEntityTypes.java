package endurteam.overwhelmed.fabric.world.entity;

import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import endurteam.overwhelmed.world.entity.animal.SnailEntity;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import endurteam.overwhelmed.world.entity.projectile.PebbleEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;
import static endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes.*;

public class OverwhelmedFabricEntityTypes {
    public static void registerEntities() {
        flatSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "flat_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("flat_snail"));
        gardenSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "garden_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("garden_snail"));
        garySnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "gary_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("gary_snail"));
        glassSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "glass_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("glass_snail"));
        limestoneSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "limestone_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("limestone_snail"));
        liverwortSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "liverwort_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("liverwort_snail"));
        romanSnailEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "roman_snail"),
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("roman_snail"));

        cabbageButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cabbage_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cabbage_butterfly"));
        cherryButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cherry_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cherry_butterfly"));
        liverwortButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "liverwort_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("fur_butterfly"));
        monarchButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "monarch_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("monarch_butterfly"));
        morphoButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "morpho_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("morpho_butterfly"));
        sleepyButterflyEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "sleepy_butterfly"),
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("sleepy_butterfly"));

        paperBulletEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "paper_bullet"),
                        EntityType.Builder.<PaperBulletEntity>of(PaperBulletEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("paper_bullet")
        );
        pebbleEntityType = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "pebble"),
                        EntityType.Builder.<PebbleEntity>of(PebbleEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("pebble")
        );

        FabricDefaultAttributeRegistry.register(flatSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(gardenSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(garySnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(glassSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(limestoneSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(liverwortSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(romanSnailEntityType, SnailEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(cabbageButterflyEntityType, ButterflyEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(cherryButterflyEntityType, ButterflyEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(liverwortButterflyEntityType, ButterflyEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(monarchButterflyEntityType, ButterflyEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(morphoButterflyEntityType, ButterflyEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(sleepyButterflyEntityType, ButterflyEntity.createAttributes());
    }
}
