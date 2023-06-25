package overwhelmed.overwhelmed.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import overwhelmed.overwhelmed.Overwhelmed;

public class CreativeTabRegistry {
    /*
    public static RegistrySupplier<CreativeModeTab> overwhelmedTab;
     */
    public  static final DeferredRegister<CreativeModeTab> overwhelmedCreativeTabs =
            DeferredRegister.create(Overwhelmed.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> overwhelmedTab = overwhelmedCreativeTabs.register(
            "overwhelmed_tab", () ->  dev.architectury.registry.CreativeTabRegistry.create(
                    Component.translatable("category.overwhelmed"),
                    () -> new ItemStack(ItemRegistry.snailShellItem.get())
            )
    );

    public static void registerCreativeTab(){
        overwhelmedCreativeTabs.register();
        /*
        overwhelmedTab = Overwhelmed.creativeModeTabs.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "overwhelmed_tab"),
                () -> dev.architectury.registry.CreativeTabRegistry.create(
                        Component.translatable("category.overwhelmed"),
                        () -> new ItemStack(ItemRegistry.snailShellItem.get())
                )
        );
         */
    };
}
