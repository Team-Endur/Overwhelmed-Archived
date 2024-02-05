/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023-2024 Endurteam<br>
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

package endurteam.overwhelmed.world.level.levelgen.placement;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedPlacedFeatures {

    public static final ResourceKey<PlacedFeature> FLOWER_OLD_GROWTH_PINE_TAIGA = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "flower_old_growth_pine_taiga"));

    public static final ResourceKey<PlacedFeature> FLOWER_OLD_GROWTH_SPRUCE_TAIGA = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "flower_old_growth_spruce_taiga"));

    public static final ResourceKey<PlacedFeature> FLOWER_TAIGA = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "flower_taiga"));

    public static final ResourceKey<PlacedFeature> GENERATE_GOLD_BEAD = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_gold_bead"));

    public static final ResourceKey<PlacedFeature> GENERATE_ICE_CUBE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_ice_cube"));

    public static final ResourceKey<PlacedFeature> GENERATE_PAINE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_paine"));

    public static final ResourceKey<PlacedFeature> GENERATE_PEBBLE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_pebble"));

    public static final ResourceKey<PlacedFeature> GENERATE_WIDOW = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_widow"));

    public static final ResourceKey<PlacedFeature> ORE_CHARCOAL = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "ore_charcoal"));

    public static final ResourceKey<PlacedFeature> ORE_SOIL = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "ore_soil"));

    public static final ResourceKey<PlacedFeature> ORE_BLACK_GRANITE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "ore_black_granite"));

    public static final ResourceKey<PlacedFeature> PATCH_BELL_SUNFLOWER = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "patch_bell_sunflower"));

    public static final ResourceKey<PlacedFeature> PATCH_LAVATERA = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "patch_lavatera"));

    public static final ResourceKey<PlacedFeature> PATCH_SNOWDROP = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "patch_snowdrop"));

}
