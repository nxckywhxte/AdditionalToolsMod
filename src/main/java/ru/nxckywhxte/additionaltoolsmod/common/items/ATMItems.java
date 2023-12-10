package ru.nxckywhxte.additionaltoolsmod.common.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.nxckywhxte.additionaltoolsmod.AdditionalToolsMod;

public class ATMItems {
    public static final DeferredRegister<Item> ATMItems =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalToolsMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE =
            ATMItems.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE =
            ATMItems.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ATMItems.register(eventBus);
    }
}
