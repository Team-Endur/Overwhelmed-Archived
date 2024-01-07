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

package endurteam.overwhelmed.quilt;

import endurteam.overwhelmed.fabriclike.OverwhelmedFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class OverwhelmedQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer container) {
        OverwhelmedFabricLike.onInitialize();
        BiomeModifiers.snailSpawning();
        BiomeModifiers.butterflySpawning();
        BiomeModifiers.soilGeneration();
        BiomeModifiers.widowGeneration();
        BiomeModifiers.pebbleGeneration();
        BiomeModifiers.iceCubeGeneration();
        BiomeModifiers.goldBeadGeneration();
    }
}
