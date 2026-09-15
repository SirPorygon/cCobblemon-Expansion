package net.sirporygon.cobblemonexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sirporygon.cobblemonexpansion.CobblemonExpansion;

public class ModItems {

    public static final Item MINIOR_ORE = registerItem(
            "minior_ore",
            new Item(new Item.Settings())
    );
// cool naame//
    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(CobblemonExpansion.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        CobblemonExpansion.LOGGER.info(
                "Registering Mod Items for " + CobblemonExpansion.MOD_ID
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MINIOR_ORE);
        });
    }
}