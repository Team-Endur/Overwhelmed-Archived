package endurteam.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import endurteam.overwhelmed.Overwhelmed;

public class CreativeTabRegistry {

    public static final RegistrySupplier<CreativeModeTab> overwhelmedTab = Overwhelmed.CREATIVE_MODE_TABS.register(
            "overwhelmed_tab", () ->  dev.architectury.registry.CreativeTabRegistry.create(
                    Component.translatable("category.overwhelmed"),
                    () -> new ItemStack(ItemRegistry.snailShellItem.get())
            )
    );

    public static void registerCreativeTab() {
        Overwhelmed.CREATIVE_MODE_TABS.register();
    }
}
