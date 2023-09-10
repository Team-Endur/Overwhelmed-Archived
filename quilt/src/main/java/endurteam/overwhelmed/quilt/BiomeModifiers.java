package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.level.levelgen.placement.OverwhelmedPlacedFeatures;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.gardenSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.limestoneSnailEntityType.get(),
                20, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.romanSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_GLASS_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.glassSnailEntityType.get(),
                20, 1, 1);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_LIVERWORT_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.glassSnailEntityType.get(),
                80, 3, 6);
    }

    public static void butterflySpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.sleepyButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.cabbageButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.morphoButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.cherryButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_MONARCH_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.monarchButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(OverwhelmedEntityTypes.SPAWNS_FUR_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.furButterflyEntityType.get(),
                60, 1, 1);
    }

    public static void soilGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.isIn(OverwhelmedPlacedFeatures.GENERATES_SOIL),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION, OverwhelmedPlacedFeatures.ORE_SOIL);
    }

    public static void widowGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.isIn(OverwhelmedPlacedFeatures.GENERATES_WIDOWS),
                GenerationStep.Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_WIDOW);
    }

    public static void pebbleGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.isIn(OverwhelmedPlacedFeatures.GENERATES_PEBBLES),
                GenerationStep.Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_PEBBLE);
    }

    public static void iceCubeGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.isIn(OverwhelmedPlacedFeatures.GENERATES_ICE_CUBES),
                GenerationStep.Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_ICE_CUBE);
    }

    public static void goldBeadGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.isIn(OverwhelmedPlacedFeatures.GENERATES_GOLD_BEADS),
                GenerationStep.Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_GOLD_BEAD);
    }

}
