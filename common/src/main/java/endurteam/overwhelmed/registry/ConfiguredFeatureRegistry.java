package endurteam.overwhelmed.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class ConfiguredFeatureRegistry {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SEDIMENT =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "ore_sediment"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> PATCH_WIDOW =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "patch_widow"));
    
}
