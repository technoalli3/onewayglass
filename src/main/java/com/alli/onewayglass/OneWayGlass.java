package com.alli.onewayglass;

import com.alli.onewayglass.registry.block.ModBlocks;
import com.alli.onewayglass.registry.item.ModBlockItems;
import com.alli.onewayglass.registry.item.ModItems;
import com.alli.onewayglass.registry.tool.GlassToolItem;
import net.fabricmc.api.ModInitializer;

public class OneWayGlass implements ModInitializer {

    public static final String MOD_ID = "onewayglass"; //Mod id - matches in fabric.mod.json

    @Override
    public void onInitialize() {
        //Blocks
        //Items
        ModItems.registerItems();
        ModBlockItems.registerItems();// Calls registry for natural block items
        //Tool Items
        GlassToolItem.registerTools();// Calls registry for glass tools
        ModBlocks.registerBlocks();
        AddToGroup.addBlocksToGroups();
        AddToGroup.addItemsToGroup();
    }
}
