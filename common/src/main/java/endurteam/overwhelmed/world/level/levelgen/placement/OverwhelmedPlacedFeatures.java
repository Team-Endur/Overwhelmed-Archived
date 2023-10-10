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

package endurteam.overwhelmed.world.level.levelgen.placement;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedPlacedFeatures {
    
    public static final TagKey<Biome> GENERATES_SOIL = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_soil"));
    
    public static final TagKey<Biome> GENERATES_WIDOWS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_widows"));

    public static final TagKey<Biome> GENERATES_PEBBLES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_pebbles"));

    public static final TagKey<Biome> GENERATES_ICE_CUBES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_ice_cubes"));

    public static final TagKey<Biome> GENERATES_GOLD_BEADS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_gold_beads"));

    public static final ResourceKey<PlacedFeature> ORE_SOIL = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "ore_soil"));

    public static final ResourceKey<PlacedFeature> GENERATE_WIDOW = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_widow"));

    public static final ResourceKey<PlacedFeature> GENERATE_PEBBLE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_pebble"));

    public static final ResourceKey<PlacedFeature> GENERATE_ICE_CUBE = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_ice_cube"));

    public static final ResourceKey<PlacedFeature> GENERATE_GOLD_BEAD = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_gold_bead"));
}
