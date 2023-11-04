/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

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
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_LIVERWORT_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.liverwortSnailEntityType.get(),
                80, 3, 6);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedEntityTypes.SPAWNS_FLAT_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.flatSnailEntityType.get(),
                40, 2, 4);
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

    public static void pebbleGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedPlacedFeatures.GENERATES_PEBBLES),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_PEBBLE);
    }

    public static void iceCubeGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedPlacedFeatures.GENERATES_ICE_CUBES),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_ICE_CUBE);
    }

    public static void goldBeadGeneration()
    {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedPlacedFeatures.GENERATES_GOLD_BEADS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_GOLD_BEAD);
    }
}
