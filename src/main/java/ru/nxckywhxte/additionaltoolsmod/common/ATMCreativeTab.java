package ru.nxckywhxte.additionaltoolsmod.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ru.nxckywhxte.additionaltoolsmod.AdditionalToolsMod;
import ru.nxckywhxte.additionaltoolsmod.common.items.ATMItems;

public class ATMCreativeTab {
    public static final DeferredRegister<CreativeModeTab> ATM_CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalToolsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ATM_ORE_CREATIVE_MODE_TAB =
            ATM_CREATIVE_MODE_TABS.register("atm_ore_creative_mode_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ATMItems.RAW_SAPPHIRE.get()))
                    .title(Component.translatable("atm_ore_creative_mode_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ATMItems.RAW_SAPPHIRE.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> ATM_INGREDIENT_CREATIVE_MODE_TAB =
            ATM_CREATIVE_MODE_TABS.register("atm_ingredient_creative_mode_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ATMItems.SAPPHIRE.get()))
                    .title(Component.translatable("atm_ingredient_creative_mode_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ATMItems.SAPPHIRE.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        ATM_CREATIVE_MODE_TABS.register(eventBus);
    }
}
