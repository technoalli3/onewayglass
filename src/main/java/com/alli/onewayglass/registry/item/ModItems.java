package com.alli.onewayglass.registry.item;

import com.alli.onewayglass.OneWayGlass;
import com.alli.onewayglass.registry.block.ColouredModBlocks;
import com.alli.onewayglass.registry.block.NaturalModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item GLASS_FRAME = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Block Items

    //Natural Materials





    public static void registerItems() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_frame"), GLASS_FRAME);
    }
}