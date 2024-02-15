package net.anthonious.darkinmod.item;

import net.anthonious.darkinmod.DarkinMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DARKIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DarkinMod.MOD_ID, "darkin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.darkin"))
                    .icon(() -> new ItemStack(ModItems.DARKIN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DARKIN_INGOT);
                        entries.add(ModItems.DARKIN_SCYTHE);
                        entries.add(ModItems.KAYN_HELMET);


                    }).build());
}
