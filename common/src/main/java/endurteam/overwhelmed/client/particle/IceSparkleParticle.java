package endurteam.overwhelmed.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Environment(value= EnvType.CLIENT)
public class IceSparkleParticle extends TextureSheetParticle {
    private final SpriteSet sprites;
    IceSparkleParticle(ClientLevel clientLevel, double d, double e, double f, double g, double h, double i,
                          SpriteSet spriteSet) {
        super(clientLevel, d, e, f, g, h, i);
        this.sprites = spriteSet;
        this.setSpriteFromAge(spriteSet);
    }

    @Override
    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void tick() {
        super.tick();
        this.setSpriteFromAge(this.sprites);
    }

    @Environment(value=EnvType.CLIENT)
    public static class Provider
            implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet spriteSet) {
            this.sprite = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType particleOptions, ClientLevel clientLevel, double d, double e,
                                       double f, double g, double h, double i) {
            return new IceSparkleParticle(clientLevel, d, e, f, g, h, i, this.sprite);
        }
    }
}
