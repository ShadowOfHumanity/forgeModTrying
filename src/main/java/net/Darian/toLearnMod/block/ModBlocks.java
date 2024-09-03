package net.Darian.toLearnMod.block;

import net.Darian.toLearnMod.ToLearnMod;
import net.Darian.toLearnMod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ToLearnMod.MOD_ID);

    // creating a block //
    public static final RegistryObject<Block> Sapphire_Block = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).sound(SoundType.AMETHYST)));

    // creating a block //
    public static final RegistryObject<Block> Raw_Sapphire_Block = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).strength(5.0F, 6.0F).sound(SoundType.AMETHYST)));



    private static <T extends Block> RegistryObject<T> registerBlock( String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //registering block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) { // T is a block
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
