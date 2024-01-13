package endurteam.overwhelmed.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedEntityTypeTags {
    public static final TagKey<EntityType<?>> SNAILS = TagKey.create(Registries.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "snails"));
    public static final TagKey<EntityType<?>> BUTTERFLIES = TagKey.create(Registries.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "butterflies"));
}
