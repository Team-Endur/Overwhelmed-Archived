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

package endurteam.overwhelmed.world.item;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.food.OverwhelmedFoods;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.world.level.block.Block;

import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.overwhelmedTab;

public class OverwhelmedItems {
    public static RegistrySupplier<Item> snailShellItem;
    public static RegistrySupplier<Item> gooBallItem;
    public static RegistrySupplier<Item> gooSoupItem;
    public static RegistrySupplier<Item> paperBulletItem;
    public static RegistrySupplier<Item> blowgunItem;
    public static RegistrySupplier<MultiSpawnEggItem> snailSpawnEggItem;
    public static RegistrySupplier<MultiSpawnEggItem> butterflySpawnEggItem;
    public static RegistrySupplier<BlockItem> soilBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickStairsBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickSlabBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickWallBlockItem;
    public static RegistrySupplier<BlockItem> chiseledSnailShellBricksBlockItem;
    public static RegistrySupplier<BlockItem> gooBlockBlockItem;
    public static RegistrySupplier<DoubleHighBlockItem> widowBlockItem;
    public static RegistrySupplier<PebbleBlockItem> pebbleBlockItem;
    public static RegistrySupplier<BlockItem> iceCubeBlockItem;
    public static RegistrySupplier<BlockItem> goldBeadBlockItem;

    public static void registerItems() {
        snailShellItem = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        gooBallItem = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        gooSoupItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_soup"), () ->
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.GOO_SOUP)
                        .arch$tab(overwhelmedTab)));
        paperBulletItem = registerGenericItem("paper_bullet", 64, Rarity.COMMON);
        blowgunItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "blowgun"), () ->
                new BlowgunItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .durability(20)
                        .arch$tab(overwhelmedTab)));

        snailSpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                "snail_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                            switch (random.nextIntBetweenInclusive(1, 5)) {
                                case 1 -> {
                                    return OverwhelmedEntityTypes.gardenSnailEntityType.get();
                                }
                                case 2 -> {
                                    return OverwhelmedEntityTypes.limestoneSnailEntityType.get();
                                }
                                case 3 -> {
                                    return OverwhelmedEntityTypes.romanSnailEntityType.get();
                                }
                                case 4 -> {
                                    return OverwhelmedEntityTypes.glassSnailEntityType.get();
                                }
                                case 5 -> {
                                    return OverwhelmedEntityTypes.liverwortSnailEntityType.get();
                                }
                            }
                            throw new IncompatibleClassChangeError();
                        }
                )
        );
        butterflySpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                        "butterfly_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.sleepyButterflyEntityType.get();
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.cabbageButterflyEntityType.get();
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.morphoButterflyEntityType.get();
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.cherryButterflyEntityType.get();
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.monarchButterflyEntityType.get();
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.furButterflyEntityType.get();
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
        soilBlockItem = registerGenericBlockItem("soil", OverwhelmedBlocks.soilBlock);
        snailShellBrickBlockItem = registerGenericBlockItem("snail_shell_bricks",
                OverwhelmedBlocks.snailShellBrickBlock);
        snailShellBrickStairsBlockItem = registerGenericBlockItem(
                "snail_shell_brick_stairs",
                OverwhelmedBlocks.snailShellBrickStairBlock);
        snailShellBrickSlabBlockItem = registerGenericBlockItem(
                "snail_shell_brick_slab",
                OverwhelmedBlocks.snailShellBrickSlabBlock);
        snailShellBrickWallBlockItem = registerGenericBlockItem(
                "snail_shell_brick_wall",
                OverwhelmedBlocks.snailShellBrickWallBlock);
        chiseledSnailShellBricksBlockItem = registerGenericBlockItem(
                "chiseled_snail_shell_bricks",
                OverwhelmedBlocks.chiseledSnailShellBrickBlock);
        gooBlockBlockItem = registerGenericBlockItem("goo_block",
                OverwhelmedBlocks.gooBlock);
        widowBlockItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "widow"),
                () -> new DoubleHighBlockItem(OverwhelmedBlocks.widowBlock.get(),
                new Item.Properties().arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
        pebbleBlockItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                () -> new PebbleBlockItem(OverwhelmedBlocks.pebbleBlock.get(),
                new Item.Properties().arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
        iceCubeBlockItem  = registerGenericBlockItem("ice_cube",
                OverwhelmedBlocks.iceCubeBlock);
        goldBeadBlockItem = registerGenericBlockItem("gold_bead",
                OverwhelmedBlocks.goldBeadBlock);

        Overwhelmed.ITEMS.register();
    }
    private static RegistrySupplier<Item> registerGenericItem(String name, int stackSize, Rarity rarity) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Item(new Item.Properties()
                        .stacksTo(stackSize)
                        .rarity(rarity)
                        .arch$tab(overwhelmedTab)));
    }

    private static RegistrySupplier<BlockItem> registerGenericBlockItem(String name,
                                                                        RegistrySupplier<? extends Block>
                                                                                blockSupplier) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new BlockItem(blockSupplier.get(), new Item.Properties()
                        .arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
    }
}
