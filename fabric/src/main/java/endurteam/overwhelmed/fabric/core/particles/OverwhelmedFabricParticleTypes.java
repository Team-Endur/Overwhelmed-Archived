package endurteam.overwhelmed.fabric.core.particles;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes.*;

public class OverwhelmedFabricParticleTypes {

    public static void registerParticleTypes() {

        LIVERWORT_SPORE = Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                new ResourceLocation(Overwhelmed.MOD_ID, "liverwort_spore"),
                        new SimpleParticleType(false));

    }
}
