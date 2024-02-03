package endurteam.overwhelmed.fabric.world.entity;

import endurteam.overwhelmed.world.entity.animal.Butterfly;
import endurteam.overwhelmed.world.entity.animal.Hornet;
import endurteam.overwhelmed.world.entity.animal.Moth;
import endurteam.overwhelmed.world.entity.animal.Snail;
import endurteam.overwhelmed.world.entity.projectile.PaperBullet;
import endurteam.overwhelmed.world.entity.projectile.Pebble;
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
        FLAT_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "flat_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("flat_snail"));
        GARDEN_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "garden_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("garden_snail"));
        GARY_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "gary_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("gary_snail"));
        GLASS_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "glass_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("glass_snail"));
        LIMESTONE_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "limestone_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("limestone_snail"));
        LIVERWORT_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "liverwort_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("liverwort_snail"));
        ROMAN_SNAIL = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "roman_snail"),
                        EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("roman_snail"));

        CABBAGE_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cabbage_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cabbage_butterfly"));
        CHERRY_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "cherry_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cherry_butterfly"));
        LIVERWORT_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "liverwort_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("fur_butterfly"));
        MONARCH_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "monarch_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("monarch_butterfly"));
        MORPHO_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "morpho_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("morpho_butterfly"));
        SLEEPY_BUTTERFLY = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "sleepy_butterfly"),
                        EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("sleepy_butterfly"));
        MOTH = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "moth"),
                    EntityType.Builder.of(Moth::new, MobCategory.CREATURE)
                            .sized(0.6f, 0.4f)
                            .clientTrackingRange(8)
                            .build("moth"));
        HORNET = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "hornet"),
                EntityType.Builder.of(Hornet::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(12)
                        .build("hornet"));

        PAPER_BULLET = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "paper_bullet"),
                        EntityType.Builder.<PaperBullet>of(PaperBullet::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("paper_bullet")
        );
        PEBBLE = Registry.register(BuiltInRegistries.ENTITY_TYPE,
                new ResourceLocation(MOD_ID, "pebble"),
                        EntityType.Builder.<Pebble>of(Pebble::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("pebble")
        );

        FabricDefaultAttributeRegistry.register(FLAT_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(GARDEN_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(GARY_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(GLASS_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(LIMESTONE_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(LIVERWORT_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(ROMAN_SNAIL, Snail.createAttributes());
        FabricDefaultAttributeRegistry.register(CABBAGE_BUTTERFLY, Butterfly.createAttributes());
        FabricDefaultAttributeRegistry.register(CHERRY_BUTTERFLY, Butterfly.createAttributes());
        FabricDefaultAttributeRegistry.register(LIVERWORT_BUTTERFLY, Butterfly.createAttributes());
        FabricDefaultAttributeRegistry.register(MONARCH_BUTTERFLY, Butterfly.createAttributes());
        FabricDefaultAttributeRegistry.register(MORPHO_BUTTERFLY, Butterfly.createAttributes());
        FabricDefaultAttributeRegistry.register(SLEEPY_BUTTERFLY, Butterfly.createAttributes());
    }
}
