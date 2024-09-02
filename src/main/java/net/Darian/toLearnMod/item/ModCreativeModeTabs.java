package net.Darian.toLearnMod.item;

import net.Darian.toLearnMod.ToLearnMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToLearnMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ModSwords = CREATIVE_MODE_TABS.register("sword_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FireSword.get())) // the new item stack code is the icon of the creative tab
                    .title(Component.translatable("creativetab.sword_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FireSword.get());
                        output.accept(ModItems.PoisonSword.get());
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> ModIngredients = CREATIVE_MODE_TABS.register("ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Sapphire.get()))
                    .title(Component.translatable("creativetab.ingredients_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Sapphire.get());
                        output.accept(ModItems.Raw_Sapphire.get());
                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
