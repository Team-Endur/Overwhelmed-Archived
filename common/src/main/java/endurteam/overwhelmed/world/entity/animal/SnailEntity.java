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

package endurteam.overwhelmed.world.entity.animal;

import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.item.OverwhelmedItems;
import endurteam.overwhelmed.sounds.OverwhelmedSoundEvents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SnailEntity extends Animal {
    public AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private final Level level;

    public SnailEntity(EntityType<? extends SnailEntity> entityType, Level level) {
        super(entityType, level);
        this.level = level;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 6.0F, 0.02F, true));
        this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return OverwhelmedSoundEvents.snailHurt;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return OverwhelmedSoundEvents.snailDeath;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.1)
                .add(Attributes.MAX_HEALTH, 4)
                .add(Attributes.ARMOR, 0.2)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.4)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    @Override
    public int getExperienceReward() {
        return 1;
    }

    @Override
    public @NotNull InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        // Check if the player is holding a slime ball
        if (itemStack.getItem() == Items.SLIME_BALL) {
            // Decrease the stack size of the slime ball
            if (!player.isCreative()) {
                itemStack.shrink(1);
            }

            // Drop a goo ball
            if (!level.isClientSide) {
                level.addFreshEntity(new ItemEntity(level, getX(), getY(), getZ(),
                        new ItemStack(OverwhelmedItems.GOO_BALL)));
            }

            return InteractionResult.SUCCESS;
        }

        return super.mobInteract(player, hand);
    }

    public void setCustomName(@Nullable Component arg) {
        super.setCustomName(arg);
        if (!this.getType().equals(OverwhelmedEntityTypes.GARY_SNAIL) && arg != null
                && arg.getString().equals("Gary")) {
            CompoundTag tag = new CompoundTag();
            SnailEntity newEntity = new SnailEntity(OverwhelmedEntityTypes.GARY_SNAIL, this.level());
            this.save(tag);
            newEntity.load(tag);
            this.remove(RemovalReason.DISCARDED);
            this.level().addFreshEntity(newEntity);
        }
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        EntityType<?> type = this.getType();
        if (OverwhelmedEntityTypes.FLAT_SNAIL.equals(type)) {
            return 0.2f;
        } else if (OverwhelmedEntityTypes.GARDEN_SNAIL.equals(type)) {
            return 0.2f;
        } else if (OverwhelmedEntityTypes.GARY_SNAIL.equals(type)) {
            return 0.32f;
        } else if (OverwhelmedEntityTypes.GLASS_SNAIL.equals(type)) {
            return 0.2f;
        } else if (OverwhelmedEntityTypes.LIMESTONE_SNAIL.equals(type)) {
            return 0.15f;
        } else if (OverwhelmedEntityTypes.LIVERWORT_SNAIL.equals(type)) {
            return 0.2f;
        } else if (OverwhelmedEntityTypes.ROMAN_SNAIL.equals(type)) {
            return 0.2f;
        }
        throw new IncompatibleClassChangeError();
    }

    private void setupAnimationStates() {
        if(idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick + 6F, 1f);
        } else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }
}
