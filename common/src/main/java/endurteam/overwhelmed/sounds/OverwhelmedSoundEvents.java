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

package endurteam.overwhelmed.sounds;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class OverwhelmedSoundEvents {
    public static RegistrySupplier<SoundEvent> snailHurt;
    public static RegistrySupplier<SoundEvent> snailDeath;
    public static RegistrySupplier<SoundEvent> butterflyHurt;
    public static RegistrySupplier<SoundEvent> butterflyDeath;
    public static RegistrySupplier<SoundEvent> blowgunShoot;

    public static void registerSoundEvents() {
        snailHurt = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt")));
        snailDeath = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death")));
        butterflyHurt = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt")));
        butterflyDeath = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death")));
        blowgunShoot = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "item.blowgun.shoot"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "item.blowgun.shoot")));

        Overwhelmed.SOUND_EVENTS.register();
    }
}
