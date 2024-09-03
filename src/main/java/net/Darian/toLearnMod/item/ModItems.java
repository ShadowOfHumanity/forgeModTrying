package net.Darian.toLearnMod.item;

import net.Darian.toLearnMod.ToLearnMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, ToLearnMod.MOD_ID); // loads all items in the mod and registers them with

    // normal items
    public static final RegistryObject<Item> FireSword = ITEMS.register("fire_sword",
            () -> new Item(new Item.Properties())); // creates a new item and registers it with the deferred register

    public static final RegistryObject<Item> PoisonSword = ITEMS.register("poison_sword",
            () -> new Item(new Item.Properties())); // creates a new item and registers it with the deferred register

    public static final RegistryObject<Item> Sapphire = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties())); // creates a new item and registers it with the deferred register

    public static final RegistryObject<Item> Raw_Sapphire = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties())); // creates a new item and registers it with the deferred register


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

