package overwhelmed.overwhelmed.fabric;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import overwhelmed.overwhelmed.Overwhelmed;

public class BiomeModifiers {
    public static void snailSpawning()
    {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(Overwhelmed.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, Overwhelmed.gardenSnailEntityType.get(),
                100, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(Overwhelmed.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, Overwhelmed.limestoneSnailEntityType.get(),
                100, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(Overwhelmed.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, Overwhelmed.romanSnailEntityType.get(),
                100, 2, 4);
    }
}
