package endurteam.overwhelmed.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import endurteam.overwhelmed.registry.EntityTypeRegistry;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, EntityTypeRegistry.gardenSnailEntityType.get(),
                80, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, EntityTypeRegistry.limestoneSnailEntityType.get(),
                20, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, EntityTypeRegistry.romanSnailEntityType.get(),
                80, 3, 8);
    }

    public static void butterflySpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, EntityTypeRegistry.sleepyButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, EntityTypeRegistry.cabbageButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, EntityTypeRegistry.morphoButterflyEntityType.get(),
                80, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityTypeRegistry.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, EntityTypeRegistry.cherryButterflyEntityType.get(),
                80, 2, 4);
    }
}
