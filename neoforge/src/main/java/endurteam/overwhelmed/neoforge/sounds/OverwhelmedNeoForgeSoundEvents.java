package endurteam.overwhelmed.neoforge.sounds;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import static endurteam.overwhelmed.sounds.OverwhelmedSoundEvents.*;

public class OverwhelmedNeoForgeSoundEvents {
    public static void registerSoundEvents(RegisterEvent.RegisterHelper<SoundEvent> helper) {
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt"),
                SNAIL_HURT = SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt")));
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death"),
                SNAIL_DEATH = SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death")));
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt"),
                BUTTERFLY_HURT = SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.hurt")));
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death"),
                BUTTERFLY_DEATH = SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.butterfly.death")));
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.paper_bullet.shoot"),
                BLOWGUN_SHOOT = SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.paper_bullet.shoot")));
        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "entity.pebble.throw"),
                PEBBLE_THROW = SoundEvent.createVariableRangeEvent(
                        new ResourceLocation(Overwhelmed.MOD_ID, "entity.pebble.throw")));
    }
}
