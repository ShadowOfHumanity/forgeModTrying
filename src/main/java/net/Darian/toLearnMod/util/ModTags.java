package net.Darian.toLearnMod.util;

import net.Darian.toLearnMod.ToLearnMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables"); // DATA -- TO_LEARN_MOD
        private static TagKey<Block> tag(String name){
            return BlockTags.create(ResourceLocation.tryBuild(ToLearnMod.MOD_ID, name));
        }
    }



    public  static class Items {

        private static TagKey<Item> tag(String name){
            return ItemTags.create(ResourceLocation.tryBuild(ToLearnMod.MOD_ID, name));
        }

    }
}
