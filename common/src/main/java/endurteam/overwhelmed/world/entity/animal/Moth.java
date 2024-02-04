/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023-2024 Endurteam<br>
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

package endurteam.overwhelmed.world.entity.animal;

import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Moth extends PathfinderMob {
    public AnimationState flyAnimationState = new AnimationState();
    @Nullable
    private BlockPos targetPosition;

    public Moth(EntityType<? extends Moth> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {}

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource damageSource) {
        return OverwhelmedSoundEvents.MOTH_HURT;
    }

    @Override
    public SoundEvent getDeathSound() {
        return OverwhelmedSoundEvents.MOTH_DEATH;
    }

    @Override
    protected void doPush(Entity entity) {
    }

    @Override
    protected void pushEntities() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide())
        {
            this.flyAnimationState.startIfStopped(this.tickCount);
        }
    }

    @Override
    protected void customServerAiStep() {
        super.customServerAiStep();
        List<Player> players = this.level().getEntitiesOfClass(Player.class, this.getBoundingBox().inflate(2.0));
        for (Player player : players) {
            player.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 300, 1));
        }
    }

    @Override
    protected void checkFallDamage(double d, boolean bl, BlockState blockState, BlockPos blockPos) {
    }

    @Override
    public boolean isIgnoringBlockTriggers() {
        return true;
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return 0.1f;
    }

    @Override
    public int getExperienceReward() {
        return 2;
    }

    @Override
    public @NotNull MobType getMobType() {
        return MobType.ARTHROPOD;
    }
}