package com.alli.onewayglass;

import com.alli.onewayglass.registry.block.ColouredModBlocks;
import com.alli.onewayglass.registry.block.NaturalModBlocks;
import com.alli.onewayglass.registry.item.ColouredModItems;
import com.alli.onewayglass.registry.tool.GlassToolItem;
import com.alli.onewayglass.registry.item.ModItems;
import com.alli.onewayglass.registry.item.NaturalModItems;
import net.fabricmc.api.ModInitializer;

public class OneWayGlass implements ModInitializer {

    public static final String MOD_ID = "onewayglass";

    @Override
    public void onInitialize() {
        //Blocks
        ColouredModBlocks.registerBlocks();
        NaturalModBlocks.registerBlocks();
        //Items
        ModItems.registerItems();
        ColouredModItems.registerItems();
        NaturalModItems.registerItems();
        //Tool Items
        GlassToolItem.registerTools();
    }

}
