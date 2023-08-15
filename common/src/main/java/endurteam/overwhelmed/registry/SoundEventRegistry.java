package endurteam.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class SoundEventRegistry {
    public static RegistrySupplier<SoundEvent> snailHurt;
    public static RegistrySupplier<SoundEvent> snailDeath;
    public static RegistrySupplier<SoundEvent> soilBreak;
    public static RegistrySupplier<SoundEvent> soilHit;
    public static RegistrySupplier<SoundEvent> soilPlace;
    public static RegistrySupplier<SoundEvent> soilStep;

    public static void registerSoundEvents() {
        snailHurt = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.hurt")));
        snailDeath = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "entity.snail.death")));
        soilBreak = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.break"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.break")));
        soilHit = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.hit"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.hit")));
        soilPlace = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.place"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.place")));
        soilStep = Overwhelmed.SOUND_EVENTS.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.step"), () ->
                        SoundEvent.createVariableRangeEvent(
                                new ResourceLocation(Overwhelmed.MOD_ID, "block.soil.step")));

        Overwhelmed.SOUND_EVENTS.register();
    }
}
