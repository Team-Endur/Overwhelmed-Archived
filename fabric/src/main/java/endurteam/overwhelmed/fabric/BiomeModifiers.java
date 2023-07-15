package endurteam.overwhelmed.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import endurteam.overwhelmed.registry.EntityRegistry;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.gardenSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, EntityRegistry.limestoneSnailEntityType.get(),
                20, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.romanSnailEntityType.get(),
                80, 3, 8);
    }

    public static void butterflySpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.sleepyButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.cabbageButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.morphoButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, EntityRegistry.cherryButterflyEntityType.get(),
                80, 2, 4);
    }
}
