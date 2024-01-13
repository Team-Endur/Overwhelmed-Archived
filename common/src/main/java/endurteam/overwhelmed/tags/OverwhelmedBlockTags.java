package endurteam.overwhelmed.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedBlockTags {
    public static final TagKey<Block> CANDLE_VANILLA_CAKES = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "candle_vanilla_cakes"));
    public static final TagKey<Block> CANDLE_MINT_CAKES = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "candle_mint_cakes"));
    public static final TagKey<Block> GOLD_BEAD_REPLACEABLE = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "gold_bead_replaceable"));
    public static final TagKey<Block> ICE_CUBE_REPLACEABLE = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "ice_cube_replaceable"));
    public static final TagKey<Block> PAINE_REPLACEABLE = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "paine_replaceable"));
    public static final TagKey<Block> PEBBLE_REPLACEABLE = TagKey.create(Registries.BLOCK,
            new ResourceLocation(MOD_ID, "pebble_replaceable"));
}
