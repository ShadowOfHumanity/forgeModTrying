package net.Darian.toLearnMod.item;

import net.Darian.toLearnMod.ToLearnMod;
import net.Darian.toLearnMod.item.custom.FuelItem;
import net.Darian.toLearnMod.item.custom.MetalDetectorItem;
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

    public static final RegistryObject<Item> Metal_Detector = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(200))); // creates a new item and registers it with the deferred register

    // creates a new item and registers it AS A FOOD item
    // creates a new item and registers it AS A FOOD item
    // creates a new item and registers it AS A FOOD item
    public static final RegistryObject<Item> Strawberry = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY))); // creates a new item and registers it AS A FOOD item

    // -------- SMELTING ITEM --------
    // -------- SMELTING ITEM --------
    // -------- SMELTING ITEM --------
    public static final RegistryObject<Item> Pinecone = ITEMS.register("pinecone", // 10s until burns (burns two items)
            () -> new FuelItem(new Item.Properties(), 400)); // creates a new item and registers it AS A FUEL OR SMELTING item


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

