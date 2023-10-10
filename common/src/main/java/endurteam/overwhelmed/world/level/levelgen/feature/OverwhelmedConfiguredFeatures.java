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

package endurteam.overwhelmed.world.level.levelgen.feature;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_SOIL =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "ore_soil"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GENERATE_WIDOW =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "generate_widow"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GENERATE_PEBBLE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "generate_pebble"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GENERATE_ICE_CUBE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "generate_ice_cube"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> GENERATE_GOLD_BEAD =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, "generate_gold_bead"));

}
