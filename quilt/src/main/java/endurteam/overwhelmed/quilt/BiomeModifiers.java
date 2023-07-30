package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import net.minecraft.world.entity.MobCategory;
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
    }
}
