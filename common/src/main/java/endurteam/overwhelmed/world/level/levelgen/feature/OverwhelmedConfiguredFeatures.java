package endurteam.overwhelmed.world.level.levelgen.feature;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SOIL =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "ore_soil"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GENERATE_WIDOW =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "generate_widow"));
    
}
