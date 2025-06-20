package net.bdawg.starter3mod.item;


import net.bdawg.starter3mod.Starter3Mod;
import net.bdawg.starter3mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Starter3Mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POWERARMOR_TAB = CREATIVE_MODE_TABS.register("powerarmor_tab",
           // line below setting icon by getting icon of item
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMONDNETHERITEALLOY.get()))
                    .title(Component.translatable("creativetab.powerarmor_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DIAMONDNETHERITEALLOY.get());
                        output.accept(ModItems.BLACKDIAMOND.get());

                        output.accept(ModBlocks.DIAMONDNETHERITEALLOY_BLOCK.get());
                        output.accept(ModBlocks.BLACKDIAMOND_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
