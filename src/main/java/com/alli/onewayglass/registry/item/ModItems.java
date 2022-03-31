package com.alli.onewayglass.registry.item;

import com.alli.onewayglass.OneWayGlass;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static com.alli.onewayglass.registry.tool.GlassToolItem.*;
import static net.minecraft.item.Items.BUCKET;

public class ModItems {

    //Items
    public static final Item GLASS_FRAME = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Prepped molds
    public static final Item PREPPED_AXE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item PREPPED_PICKAXE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item PREPPED_HOE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item PREPPED_SWORD_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item PREPPED_SHOVEL_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    //Finished molds
    public static final Item FINISHED_AXE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(GLASS_AXE));
    public static final Item FINISHED_PICKAXE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(GLASS_PICKAXE));
    public static final Item FINISHED_HOE_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(GLASS_HOE));
    public static final Item FINISHED_SWORD_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(GLASS_SWORD));
    public static final Item FINISHED_SHOVEL_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(GLASS_SHOVEL));
    //Buckets
    public static final Item SAND_BUCKET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item POWDERED_GLASS_BUCKET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item MOLTEN_GLASS_BUCKET = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).recipeRemainder(BUCKET));
    //powdered glass
    public static final Item POWDERED_GLASS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));


    public static void registerItems() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_frame"), GLASS_FRAME);
        //Prepped molds
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "prepped_axe_mold"), PREPPED_AXE_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "prepped_pickaxe_mold"), PREPPED_PICKAXE_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "prepped_shovel_mold"), PREPPED_SHOVEL_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "prepped_sword_mold"), PREPPED_SWORD_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "prepped_hoe_mold"), PREPPED_HOE_MOLD);
        //Finished molds
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "finished_axe_mold"), FINISHED_AXE_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "finished_pickaxe_mold"), FINISHED_PICKAXE_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "finished_shovel_mold"), FINISHED_SHOVEL_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "finished_sword_mold"), FINISHED_SWORD_MOLD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "finished_hoe_mold"), FINISHED_HOE_MOLD);
        //Buckets
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "sand_bucket"), SAND_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "powdered_glass_bucket"), POWDERED_GLASS_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "molten_glass_bucket"), MOLTEN_GLASS_BUCKET);
        //powdered glass
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "powdered_glass"), POWDERED_GLASS);

    }
}