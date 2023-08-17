package endurteam.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class SoundEventRegistry {
    public static RegistrySupplier<SoundEvent> snailHurt;
    public static RegistrySupplier<SoundEvent> snailDeath;
    public static RegistrySupplier<SoundEvent> butterflyHurt;
    public static RegistrySupplier<SoundEvent> butterflyDeath;
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

        Overwhelmed.SOUND_EVENTS.register();
    }
}
