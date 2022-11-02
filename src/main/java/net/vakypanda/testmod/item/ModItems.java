package net.vakypanda.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vakypanda.testmod.TestMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("magnesium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> CARBON = ITEMS.register("carbon",
            () -> new Item(new Item.Properties().tab((ModCreativeModeTab.TEST_TAB))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
