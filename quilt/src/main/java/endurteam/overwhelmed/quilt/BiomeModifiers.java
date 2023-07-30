package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.registry.EntityRegistry;
import net.minecraft.world.entity.MobCategory;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.gardenSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, EntityRegistry.limestoneSnailEntityType.get(),
                20, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.romanSnailEntityType.get(),
                80, 3, 8);
    }

    public static void butterflySpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.sleepyButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.cabbageButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.morphoButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.isIn(EntityRegistry.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.cherryButterflyEntityType.get(),
                80, 2, 4);
    }
}
