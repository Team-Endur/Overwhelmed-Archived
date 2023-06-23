package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import overwhelmed.overwhelmed.Overwhelmed;

public class CreativeTabRegistry {
    public static DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Overwhelmed.MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static RegistrySupplier<CreativeModeTab> MY_TAB = TABS.register(
            "overwhelmed_tab",
            () -> dev.architectury.registry.CreativeTabRegistry.create(
                    Component.translatable("category.overwhelmed"),
                    () -> new ItemStack(ItemRegistry.snailShellItem.get())
            )
    );

    public static void registerCreativeTab(){
        TABS.register();
    };
}
