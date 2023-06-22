package overwhelmed.overwhelmed.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import overwhelmed.overwhelmed.Overwhelmed;
import overwhelmed.overwhelmed.registry.EntityRegistry;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.gardenSnailEntityType.get(),
                100, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, EntityRegistry.limestoneSnailEntityType.get(),
                100, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(EntityRegistry.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, EntityRegistry.romanSnailEntityType.get(),
                100, 2, 4);
    }
}
