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

package endurteam.overwhelmed.world.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class OverwhelmedFoods {
    public static final FoodProperties COOKED_SNAIL =
            new FoodProperties.Builder().nutrition(6).saturationMod(0.8f).meat().build();
    public static final FoodProperties SNAIL =
            new FoodProperties.Builder().nutrition(2).saturationMod(0.3f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 0.6F)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 0.4F).meat().build();
    public static final FoodProperties GOO_SOUP =
            new FoodProperties.Builder().nutrition(4).saturationMod(5.0f).build();
}
