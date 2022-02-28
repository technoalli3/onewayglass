package com.alli.onewayglass;

import com.alli.onewayglass.registry.block.ModBlocks;
import com.alli.onewayglass.registry.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class OneWayGlass implements ModInitializer {

    public static final String MOD_ID = "onewayglass";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }

}
