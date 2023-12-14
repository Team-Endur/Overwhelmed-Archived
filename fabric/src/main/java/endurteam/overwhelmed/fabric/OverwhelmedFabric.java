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

import endurteam.overwhelmed.fabric.core.particles.OverwhelmedFabricParticleTypes;
import endurteam.overwhelmed.fabric.sounds.OverwhelmedFabricSoundEvents;
import endurteam.overwhelmed.fabric.world.entity.OverwhelmedFabricEntityTypes;
import endurteam.overwhelmed.fabric.world.item.OverwhelmedFabricCreativeTabs;
import endurteam.overwhelmed.fabric.world.item.OverwhelmedFabricItems;
import endurteam.overwhelmed.fabric.world.level.block.OverwhelmedFabricBlocks;
import net.fabricmc.api.ModInitializer;

public class OverwhelmedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        OverwhelmedFabricParticleTypes.registerParticleTypes();
        OverwhelmedFabricSoundEvents.registerSoundEvents();
        OverwhelmedFabricCreativeTabs.registerCreativeTab();
        OverwhelmedFabricEntityTypes.registerEntities();
        OverwhelmedFabricBlocks.registerBlocks();
        OverwhelmedFabricItems.registerItems();
        BiomeModifiers.snailSpawning();
        BiomeModifiers.butterflySpawning();
        BiomeModifiers.dumbbellGeneration();
        BiomeModifiers.floffGeneration();
        BiomeModifiers.goldBeadGeneration();
        BiomeModifiers.iceCubeGeneration();
        BiomeModifiers.paineGeneration();
        BiomeModifiers.pebbleGeneration();
        BiomeModifiers.pinkSallowGeneration();
        BiomeModifiers.snowdropGeneration();
        BiomeModifiers.soilGeneration();
        BiomeModifiers.squirlGeneration();
        BiomeModifiers.whiteSallowGeneration();
        BiomeModifiers.widowGeneration();
    }
}