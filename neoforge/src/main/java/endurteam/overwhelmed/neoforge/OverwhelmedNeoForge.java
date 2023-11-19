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

package endurteam.overwhelmed.forge;

import dev.architectury.platform.forge.EventBuses;
import endurteam.overwhelmed.forge.client.OverwhelmedForgeClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Overwhelmed.MOD_ID)
public class OverwhelmedForge {
    public OverwhelmedForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Overwhelmed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Overwhelmed.init();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () ->
                (() -> OverwhelmedForgeClient.initClient(FMLJavaModLoadingContext.get().getModEventBus())));
    }

}