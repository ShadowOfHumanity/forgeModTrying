package net.Darian.toLearnMod.item;

import net.Darian.toLearnMod.ToLearnMod;
import net.Darian.toLearnMod.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToLearnMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ModTab = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.WIND_CHARGE.asItem())) // the new item stack code is the icon of the creative tab
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FireSword.get());
                        output.accept(ModItems.PoisonSword.get());

                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Raw_Sapphire.get());
                        output.accept(ModItems.Pinecone.get());
                        output.accept(ModItems.Strawberry.get());

                        output.accept(ModItems.Metal_Detector.get());
                        output.accept(ModBlocks.Sound_Block.get());

                        output.accept(ModBlocks.Sapphire_Block.get());
                        output.accept(ModBlocks.Raw_Sapphire_Block.get());

                        output.accept(ModBlocks.Raw_Sapphire_Ore.get());
                        output.accept(ModBlocks.Deepslate_Sapphire_Ore.get());
                        output.accept(ModBlocks.Nether_Sapphire_Ore.get());
                        output.accept(ModBlocks.End_Sapphire_Ore.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ModSwords = CREATIVE_MODE_TABS.register("sword_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FireSword.get())) // the new item stack code is the icon of the creative tab
                    .title(Component.translatable("creativetab.sword_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FireSword.get());
                        output.accept(ModItems.PoisonSword.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ModMisc = CREATIVE_MODE_TABS.register("misc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Metal_Detector.get())) // the new item stack code is the icon of the creative tab
                    .title(Component.translatable("creativetab.misc_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Metal_Detector.get());
                        output.accept(ModBlocks.Sound_Block.get());
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> ModIngredients = CREATIVE_MODE_TABS.register("ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Sapphire.get()))
                    .title(Component.translatable("creativetab.ingredients_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Raw_Sapphire.get());
                        output.accept(ModItems.Pinecone.get());

                        output.accept(ModBlocks.Sapphire_Block.get());
                        output.accept(ModBlocks.Raw_Sapphire_Block.get());

                        output.accept(ModBlocks.Raw_Sapphire_Ore.get());
                        output.accept(ModBlocks.Deepslate_Sapphire_Ore.get());
                        output.accept(ModBlocks.Nether_Sapphire_Ore.get());
                        output.accept(ModBlocks.End_Sapphire_Ore.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ModFood = CREATIVE_MODE_TABS.register("food_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Strawberry.get())) // the new item stack code is the icon of the creative tab
                    .title(Component.translatable("creativetab.food_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Strawberry.get());
                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
