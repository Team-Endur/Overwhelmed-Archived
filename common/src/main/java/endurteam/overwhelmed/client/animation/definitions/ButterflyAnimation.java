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

package endurteam.overwhelmed.client.animation.definitions;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

@Environment(EnvType.CLIENT)
public class ButterflyAnimation {
    public static final AnimationDefinition BUTTERFLY_FLY = AnimationDefinition.Builder.withLength(0.8333f)
            .looping()
            .addAnimation("left_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.0833f, KeyframeAnimations.degreeVec(2.1992f, 19.2459f, 15.4177f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2083f, KeyframeAnimations.degreeVec(4.8724f, 29.3916f, 23.8566f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2917f, KeyframeAnimations.degreeVec(2.1992f, 19.2459f, 15.4177f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.4167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.5021f, -22.1287f, -18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.625f, KeyframeAnimations.degreeVec(5.0078f, -31.8444f, -28.0963f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.7083f, KeyframeAnimations.degreeVec(2.5021f, -22.1287f, -18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.8333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("right_wing", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                    new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.0833f, KeyframeAnimations.degreeVec(4.5021f, -22.1287f, -18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2083f, KeyframeAnimations.degreeVec(9.0078f, -31.8444f, -28.0963f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.2917f, KeyframeAnimations.degreeVec(4.5021f, -22.1287f, -18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.4167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5f, KeyframeAnimations.degreeVec(4.5021f, 22.1287f, 18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.625f, KeyframeAnimations.degreeVec(9.0078f, 31.8444f, 28.0963f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.7083f, KeyframeAnimations.degreeVec(4.5021f, 22.1287f, 18.8202f),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.8333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                            AnimationChannel.Interpolations.LINEAR)))
            .build();

    private ButterflyAnimation() {}
}
