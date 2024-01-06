package endurteam.overwhelmed.world.level.block.state.properties;

import endurteam.overwhelmed.world.level.block.MintCakeBlock;
import endurteam.overwhelmed.world.level.block.VanillaCakeBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class OverwhelmedBlockStateProperties {
    public static final IntegerProperty MINT_CAKE_BITES
            = IntegerProperty.create("mint_cake_bites", 0, MintCakeBlock.MAX_BITES - 1);
    public static final IntegerProperty VANILLA_CAKE_BITES =
            IntegerProperty.create("vanilla_cake_bites", 0, VanillaCakeBlock.MAX_BITES - 1);
}
