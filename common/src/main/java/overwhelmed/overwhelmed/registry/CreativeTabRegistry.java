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

    public static final RegistrySupplier<CreativeModeTab> overwhelmedTab = Overwhelmed.CREATIVE_MODE_TABS.register(
            "overwhelmed_tab", () ->  dev.architectury.registry.CreativeTabRegistry.create(
                    Component.translatable("category.overwhelmed"),
                    () -> new ItemStack(ItemRegistry.snailShellItem.get())
            )
    );

    public static void registerCreativeTab(){
        Overwhelmed.CREATIVE_MODE_TABS.register();
    };
}