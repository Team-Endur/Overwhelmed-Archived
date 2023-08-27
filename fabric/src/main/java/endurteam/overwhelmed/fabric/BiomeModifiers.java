package endurteam.overwhelmed.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import endurteam.overwhelmed.world.level.levelgen.placement.OverwhelmedPlacedFeatures;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.gardenSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.limestoneSnailEntityType.get(),
                20, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.romanSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_GLASS_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.glassSnailEntityType.get(),
                20, 1, 1);
    }

    public static void butterflySpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.sleepyButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.cabbageButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.morphoButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.cherryButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_MONARCH_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.monarchButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_FUR_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.furButterflyEntityType.get(),
                60, 1, 1);
    }

    public static void soilGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedPlacedFeatures.GENERATES_SOIL),
                Decoration.TOP_LAYER_MODIFICATION, OverwhelmedPlacedFeatures.ORE_SOIL);
    }

    public static void widowGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedPlacedFeatures.GENERATES_WIDOWS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_WIDOW);
    }
}
