package com.alli.onewayglass;

import com.alli.onewayglass.registry.block.ColouredModBlocks;
import com.alli.onewayglass.registry.block.NaturalModBlocks;
import com.alli.onewayglass.registry.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class OneWayGlass implements ModInitializer {

    public static final String MOD_ID = "onewayglass";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ColouredModBlocks.registerBlocks();
        NaturalModBlocks.registerBlocks();
    }

}
