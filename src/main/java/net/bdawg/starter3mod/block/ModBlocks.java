package net.bdawg.starter3mod.block;

import net.bdawg.starter3mod.Starter3Mod;
import net.bdawg.starter3mod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Starter3Mod.MOD_ID);

public static final RegistryObject<Block> DIAMONDNETHERITEALLOY_BLOCK = registerBlock("diamondnetheritealloy_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
public static final RegistryObject<Block> BLACKDIAMOND_BLOCK = registerBlock("blackdiamond_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS)));

// If I were to have an ore
//public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
//        () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),
//                UniformInt.of(3,6)));



private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
}

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
