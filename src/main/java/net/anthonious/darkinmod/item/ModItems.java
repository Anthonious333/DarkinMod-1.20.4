package net.anthonious.darkinmod.item;

import net.anthonious.darkinmod.DarkinMod;
import net.anthonious.darkinmod.item.darkin.DarkinScytheItem;
import net.anthonious.darkinmod.item.darkin.KaynArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DARKIN_INGOT = registerItem("darkin_ingot", new Item(new FabricItemSettings()));

    public static final Item DARKIN_SCYTHE = registerItem("darkin_scythe",
            new DarkinScytheItem(ModToolMaterial.DARKIN, 7, -2.5f, new FabricItemSettings()));

    public static final Item KAYN_HELMET = registerItem("kayn_helmet",
            new KaynArmorItem(ModArmorMaterials.DARKIN, ArmorItem.Type.HELMET, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DarkinMod.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DARKIN_INGOT);
        entries.add(DARKIN_SCYTHE);
        entries.add(KAYN_HELMET);
    }

    public static void registerModItems() {
        DarkinMod.LOGGER.info("Registering Mod Items for " + DarkinMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}