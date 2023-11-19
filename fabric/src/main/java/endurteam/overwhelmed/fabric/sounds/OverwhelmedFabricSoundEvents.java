package endurteam.overwhelmed.fabric.sounds;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static endurteam.overwhelmed.sounds.OverwhelmedSoundEvents.*;

public class OverwhelmedFabricSoundEvents {
    public static void registerSoundEvents() {
        snailHurt = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt")));
        snailDeath = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death")));
        butterflyHurt = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt")));
        butterflyDeath = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death")));
        blowgunShoot = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "item.blowgun.shoot"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "item.blowgun.shoot")));
    }
}
