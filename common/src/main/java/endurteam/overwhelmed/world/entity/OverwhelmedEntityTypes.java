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

package endurteam.overwhelmed.world.entity;

import endurteam.overwhelmed.world.entity.animal.*;
import endurteam.overwhelmed.world.entity.projectile.PaperBullet;
import endurteam.overwhelmed.world.entity.projectile.Pebble;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedEntityTypes {
    public static EntityType<Snail> FLAT_SNAIL;
    public static EntityType<Snail> GARDEN_SNAIL;
    public static EntityType<Snail> GARY_SNAIL;
    public static EntityType<Snail> GLASS_SNAIL;
    public static EntityType<Snail> LIMESTONE_SNAIL;
    public static EntityType<Snail> LIVERWORT_SNAIL;
    public static EntityType<Snail> ROMAN_SNAIL;

    public static EntityType<Butterfly> CABBAGE_BUTTERFLY;
    public static EntityType<Butterfly> CHERRY_BUTTERFLY;
    public static EntityType<Butterfly> LIVERWORT_BUTTERFLY;
    public static EntityType<Butterfly> MONARCH_BUTTERFLY;
    public static EntityType<Butterfly> MORPHO_BUTTERFLY;
    public static EntityType<Butterfly> SLEEPY_BUTTERFLY;

    public static EntityType<Moth> MOTH;

    public static EntityType<Hornet> HORNET;
    public static EntityType<HornetLarva> HORNET_LARVA;

    public static EntityType<PaperBullet> PAPER_BULLET;
    public static EntityType<Pebble> PEBBLE;
}
