package endurteam.overwhelmed.neoforge.world.entity;

import endurteam.overwhelmed.world.entity.animal.Butterfly;
import endurteam.overwhelmed.world.entity.animal.Snail;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import endurteam.overwhelmed.world.entity.projectile.PebbleEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;
import static endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes.*;

public class OverwhelmedNeoForgeEntityTypes {
    public static void registerEntities(RegisterEvent.RegisterHelper<EntityType<?>> helper) {
        helper.register(new ResourceLocation(MOD_ID, "flat_snail"),
                FLAT_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("flat_snail"));
        helper.register(new ResourceLocation(MOD_ID, "garden_snail"),
                GARDEN_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("garden_snail"));
        helper.register(new ResourceLocation(MOD_ID, "gary_snail"),
                GARY_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("gary_snail"));
        helper.register(new ResourceLocation(MOD_ID, "glass_snail"),
                GLASS_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("glass_snail"));
        helper.register(new ResourceLocation(MOD_ID, "limestone_snail"),
                LIMESTONE_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("limestone_snail"));
        helper.register(new ResourceLocation(MOD_ID, "liverwort_snail"),
                LIVERWORT_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("liverwort_snail"));
        helper.register(new ResourceLocation(MOD_ID, "roman_snail"),
                ROMAN_SNAIL = EntityType.Builder.of(Snail::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("roman_snail"));

        helper.register(new ResourceLocation(MOD_ID, "cabbage_butterfly"),
                CABBAGE_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cabbage_butterfly"));
        helper.register(new ResourceLocation(MOD_ID, "cherry_butterfly"),
                CHERRY_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cherry_butterfly"));
        helper.register(new ResourceLocation(MOD_ID, "liverwort_butterfly"),
                LIVERWORT_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("fur_butterfly"));
        helper.register(new ResourceLocation(MOD_ID, "monarch_butterfly"),
                MONARCH_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("monarch_butterfly"));
        helper.register(new ResourceLocation(MOD_ID, "morpho_butterfly"),
                MORPHO_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("morpho_butterfly"));
        helper.register(new ResourceLocation(MOD_ID, "sleepy_butterfly"),
                SLEEPY_BUTTERFLY = EntityType.Builder.of(Butterfly::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("sleepy_butterfly"));

        helper.register(new ResourceLocation(MOD_ID, "paper_bullet"),
                PAPER_BULLET = EntityType.Builder.<PaperBulletEntity>of(PaperBulletEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("paper_bullet")
        );
        helper.register(new ResourceLocation(MOD_ID, "pebble"),
                PEBBLE = EntityType.Builder.<PebbleEntity>of(PebbleEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("pebble")
        );


    }

    public static void entityAttributeCreationEvent(EntityAttributeCreationEvent event)
    {
        event.put(FLAT_SNAIL, Snail.createAttributes().build());
        event.put(GARDEN_SNAIL, Snail.createAttributes().build());
        event.put(GARY_SNAIL, Snail.createAttributes().build());
        event.put(GLASS_SNAIL, Snail.createAttributes().build());
        event.put(LIMESTONE_SNAIL, Snail.createAttributes().build());
        event.put(LIVERWORT_SNAIL, Snail.createAttributes().build());
        event.put(ROMAN_SNAIL, Snail.createAttributes().build());
        event.put(CABBAGE_BUTTERFLY, Butterfly.createAttributes().build());
        event.put(CHERRY_BUTTERFLY, Butterfly.createAttributes().build());
        event.put(LIVERWORT_BUTTERFLY, Butterfly.createAttributes().build());
        event.put(MONARCH_BUTTERFLY, Butterfly.createAttributes().build());
        event.put(MORPHO_BUTTERFLY, Butterfly.createAttributes().build());
        event.put(SLEEPY_BUTTERFLY, Butterfly.createAttributes().build());
    }
}
