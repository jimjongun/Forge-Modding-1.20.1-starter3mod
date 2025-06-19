package net.bdawg.starter3mod.item;

import net.bdawg.starter3mod.Starter3Mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Starter3Mod.MOD_ID);

    public static final RegistryObject<Item> DIAMONDNETHERITEALLOY = ITEMS.register("diamondnetheritealloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKDIAMOND =ITEMS.register("blackdiamond",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
