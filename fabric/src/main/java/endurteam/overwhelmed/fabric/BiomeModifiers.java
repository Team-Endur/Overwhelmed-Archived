/**
 * Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 * Copyright (C) 2023-2024 Endurteam<br>
 * <br>
 * This program is free software: you can redistribute it and/or modify<br>
 * it under the terms of the GNU General Public License as published by<br>
 * the Free Software Foundation, either version 3 of the License, or<br>
 * any later version.<br>
 * <br>
 * This program is distributed in the hope that it will be useful,<br>
 * but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 * GNU General Public License for more details.<br>
 * <br>
 * You should have received a copy of the GNU General Public License with<br>
 * the Minecraft Linking Exception<br>
 * along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 * <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.fabric;

import endurteam.overwhelmed.tags.OverwhelmedBiomeTags;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.MobCategory;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import endurteam.overwhelmed.world.level.levelgen.placement.OverwhelmedPlacedFeatures;

public class BiomeModifiers {
    public static void snailSpawning() {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_FLAT_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.FLAT_SNAIL,
                5, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_GARDEN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.GARDEN_SNAIL,
                5, 3, 8);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_GLASS_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.GLASS_SNAIL,
                4, 1, 1);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_LIMESTONE_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.LIMESTONE_SNAIL,
                4, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_LIVERWORT_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.LIVERWORT_SNAIL,
                5, 3, 6);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_ROMAN_SNAILS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.ROMAN_SNAIL,
                5, 3, 8);
    }

    public static void butterflySpawning() {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_CABBAGE_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.CABBAGE_BUTTERFLY,
                4, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_CHERRY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.CHERRY_BUTTERFLY,
                4, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_LIVERWORT_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.LIVERWORT_BUTTERFLY,
                4, 3, 6);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_MONARCH_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.MONARCH_BUTTERFLY,
                4, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_MORPHO_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.MORPHO_BUTTERFLY,
                4, 2, 4);
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_SLEEPY_BUTTERFLIES),
                MobCategory.CREATURE, OverwhelmedEntityTypes.SLEEPY_BUTTERFLY,
                4, 2, 4);
    }

    public static void mothSpawning() {
        BiomeModifications.addSpawn(bsc -> bsc.hasTag(OverwhelmedBiomeTags.SPAWNS_MOTHS),
                MobCategory.CREATURE, OverwhelmedEntityTypes.MOTH,
                4, 2, 4);
    }

    public static void bellSunflowerGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_BELL_SUNFLOWERS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.PATCH_BELL_SUNFLOWER);
    }

    public static void blackGenerationGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_BLACK_GRANITE),
                Decoration.TOP_LAYER_MODIFICATION, OverwhelmedPlacedFeatures.ORE_BLACK_GRANITE);
    }

    public static void charcoalOreGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_CHARCOAL_ORE),
                Decoration.TOP_LAYER_MODIFICATION, OverwhelmedPlacedFeatures.ORE_CHARCOAL);
    }

    public static void flowerOldGrowthPineTaigaGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.FLOWERS_OLD_GROWTH_PINE_TAIGA),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.FLOWER_OLD_GROWTH_PINE_TAIGA);
    }

    public static void flowerOldGrowthSpruceTaigaGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.FLOWERS_OLD_GROWTH_SPRUCE_TAIGA),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.FLOWER_OLD_GROWTH_SPRUCE_TAIGA);
    }

    public static void flowerTaigaGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.FLOWERS_TAIGA),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.FLOWER_TAIGA);
    }

    public static void goldBeadGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_GOLD_BEADS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_GOLD_BEAD);
    }

    public static void iceCubeGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_ICE_CUBES),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_ICE_CUBE);
    }

    public static void lavateraGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_LAVATERAS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.PATCH_LAVATERA);
    }

    public static void paineGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_PAINES),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_PAINE);
    }

    public static void pebbleGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_PEBBLES),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_PEBBLE);
    }

    public static void snowdropGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_SNOWDROPS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.PATCH_SNOWDROP);
    }

    public static void soilGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_SOIL),
                Decoration.TOP_LAYER_MODIFICATION, OverwhelmedPlacedFeatures.ORE_SOIL);
    }

    public static void widowGeneration() {
        BiomeModifications.addFeature(bsc -> bsc.hasTag(OverwhelmedBiomeTags.GENERATES_WIDOWS),
                Decoration.VEGETAL_DECORATION, OverwhelmedPlacedFeatures.GENERATE_WIDOW);
    }

}
