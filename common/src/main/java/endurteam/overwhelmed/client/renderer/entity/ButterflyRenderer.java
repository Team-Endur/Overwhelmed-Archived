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

package endurteam.overwhelmed.client.renderer.entity;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.client.model.entity.ButterflyModel;
import endurteam.overwhelmed.client.model.geom.OverwhelmedModelLayers;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class ButterflyRenderer extends MobRenderer<ButterflyEntity, ButterflyModel<ButterflyEntity>> {
    private static final ResourceLocation SLEEPY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_sleepy.png");
    private static final ResourceLocation CABBAGE_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_cabbage.png");
    private static final ResourceLocation MORPHO_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_morpho.png");
    private static final ResourceLocation CHERRY_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_cherry.png");
    private static final ResourceLocation MONARCH_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_monarch.png");
    private static final ResourceLocation LIVERWORT_TEXTURE =
            new ResourceLocation(Overwhelmed.MOD_ID, "textures/entity/butterfly/butterfly_liverwort.png");

    public ButterflyRenderer(EntityRendererProvider.Context context) {
        super(context, new ButterflyModel<>(context.bakeLayer(OverwhelmedModelLayers.BUTTERFLY_MODEL_LAYER)), 0.2f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(ButterflyEntity var1) {
        EntityType<?> type = var1.getType();
        if (OverwhelmedEntityTypes.sleepyButterflyEntityType.equals(type)) {
            return SLEEPY_TEXTURE;
        } else if (OverwhelmedEntityTypes.cabbageButterflyEntityType.equals(type)) {
            return CABBAGE_TEXTURE;
        } else if (OverwhelmedEntityTypes.morphoButterflyEntityType.equals(type)) {
            return MORPHO_TEXTURE;
        } else if (OverwhelmedEntityTypes.cherryButterflyEntityType.equals(type)) {
            return CHERRY_TEXTURE;
        } else if (OverwhelmedEntityTypes.monarchButterflyEntityType.equals(type)) {
            return MONARCH_TEXTURE;
        } else if (OverwhelmedEntityTypes.liverwortButterflyEntityType.equals(type)) {
            return LIVERWORT_TEXTURE;
        }
        throw new IncompatibleClassChangeError();
    }
}
