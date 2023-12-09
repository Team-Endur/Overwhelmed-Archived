package endurteam.overwhelmed.fabric.sounds;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static endurteam.overwhelmed.sounds.OverwhelmedSoundEvents.*;

public class OverwhelmedFabricSoundEvents {
    public static void registerSoundEvents() {
        SNAIL_HURT = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt")));
        SNAIL_DEATH = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death")));
        BUTTERFLY_HURT = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt")));
        BUTTERFLY_DEATH = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death")));
        BLOWGUN_SHOOT = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.paper_bullet.shoot"),
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.paper_bullet.shoot")));
        PEBBLE_THROW = Registry.register(BuiltInRegistries.SOUND_EVENT,
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.pebble.throw"),
                SoundEvent.createVariableRangeEvent(
                        new ResourceLocation(Overwhelmed.MOD_ID, "entity.pebble.throw")));
    }
}
