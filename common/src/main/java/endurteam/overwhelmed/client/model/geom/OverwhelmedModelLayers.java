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

package endurteam.overwhelmed.client.model.geom;

import endurteam.overwhelmed.Overwhelmed;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class OverwhelmedModelLayers {
    public static final ModelLayerLocation BUTTERFLY_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "butterfly"), "main");
    public static final ModelLayerLocation SNAIL_FLAT_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_flat"), "main");
    public static final ModelLayerLocation SNAIL_GARDEN_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_garden"), "main");
    public static final ModelLayerLocation SNAIL_GARY_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_gary"), "main");
    public static final ModelLayerLocation SNAIL_GLASS_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_glass"), "main");
    public static final ModelLayerLocation SNAIL_LIMESTONE_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_limestone"), "main");
    public static final ModelLayerLocation SNAIL_LIVERWORT_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_liverwort"), "main");
    public static final ModelLayerLocation SNAIL_ROMAN_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "snail_roman"), "main");
    public static final ModelLayerLocation MOTH_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "moth"), "main");
    public static final ModelLayerLocation HORNET_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "hornet"), "main");
    public static final ModelLayerLocation PAPER_BULLET_MODEL_LAYER = new ModelLayerLocation(
            new ResourceLocation(Overwhelmed.MOD_ID, "paper_bullet"), "main");
}
