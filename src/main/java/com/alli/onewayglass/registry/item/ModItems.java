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
    public static final BlockItem BLACK_SECURITY_GLASS = new BlockItem(ColouredModBlocks.BLACK_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem WHITE_SECURITY_GLASS = new BlockItem(ColouredModBlocks.WHITE_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem RED_SECURITY_GLASS = new BlockItem(ColouredModBlocks.RED_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem ORANGE_SECURITY_GLASS = new BlockItem(ColouredModBlocks.ORANGE_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem YELLOW_SECURITY_GLASS = new BlockItem(ColouredModBlocks.YELLOW_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem GREEN_SECURITY_GLASS = new BlockItem(ColouredModBlocks.GREEN_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BLUE_SECURITY_GLASS = new BlockItem(ColouredModBlocks.BLUE_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PURPLE_SECURITY_GLASS = new BlockItem(ColouredModBlocks.PURPLE_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem MAGENTA_SECURITY_GLASS = new BlockItem(ColouredModBlocks.MAGENTA_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem LIGHT_BLUE_SECURITY_GLASS = new BlockItem(ColouredModBlocks.LIGHT_BLUE_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem LIME_SECURITY_GLASS = new BlockItem(ColouredModBlocks.LIME_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem PINK_SECURITY_GLASS = new BlockItem(ColouredModBlocks.PINK_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem GRAY_SECURITY_GLASS = new BlockItem(ColouredModBlocks.GRAY_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem LIGHT_GRAY_SECURITY_GLASS = new BlockItem(ColouredModBlocks.LIGHT_GRAY_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem CYAN_SECURITY_GLASS = new BlockItem(ColouredModBlocks.CYAN_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BROWN_SECURITY_GLASS = new BlockItem(ColouredModBlocks.BROWN_SECURITY_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));

    //Natural Materials
    public static final BlockItem OAK_PLANK_GLASS = new BlockItem(NaturalModBlocks.OAK_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SPRUCE_PLANK_GLASS = new BlockItem(NaturalModBlocks.SPRUCE_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem ACACIA_PLANK_GLASS = new BlockItem(NaturalModBlocks.ACACIA_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DARK_PLANK_GLASS = new BlockItem(NaturalModBlocks.DARK_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem BIRCH_PLANK_GLASS = new BlockItem(NaturalModBlocks.BIRCH_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem JUNGLE_PLANK_GLASS = new BlockItem(NaturalModBlocks.JUNGLE_PLANK_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem STONE_GLASS = new BlockItem(NaturalModBlocks.STONE_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem GRANITE_GLASS = new BlockItem(NaturalModBlocks.GRANITE_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DIORITE_GLASS = new BlockItem(NaturalModBlocks.DIORITE_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem ANDESITE_GLASS = new BlockItem(NaturalModBlocks.ANDESITE_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem DEEPSLATE_GLASS = new BlockItem(NaturalModBlocks.DEEPSLATE_GLASS, new Item.Settings().group(ItemGroup.DECORATIONS));




    public static void registerItems() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_frame"), GLASS_FRAME);
        /*********************************/

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "black_security_glass"), BLACK_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "white_security_glass"), WHITE_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "red_security_glass"), RED_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "orange_security_glass"), ORANGE_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "yellow_security_glass"), YELLOW_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "green_security_glass"), GREEN_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "blue_security_glass"), BLUE_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "purple_security_glass"), PURPLE_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "magenta_security_glass"), MAGENTA_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "light_blue_security_glass"), LIGHT_BLUE_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "lime_security_glass"), LIME_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "pink_security_glass"), PINK_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "gray_security_glass"), GRAY_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "light_gray_security_glass"), LIGHT_GRAY_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "cyan_security_glass"), CYAN_SECURITY_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "brown_security_glass"), BROWN_SECURITY_GLASS);

        //Natural Materials
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "oak_plank_glass"), OAK_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "spruce_plank_glass"), SPRUCE_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "acacia_plank_glass"), ACACIA_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "dark_plank_glass"), DARK_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "birch_plank_glass"), BIRCH_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "jungle_plank_glass"), JUNGLE_PLANK_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "stone_glass"), STONE_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "granite_glass"), GRANITE_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "diorite_glass"), DIORITE_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "andesite_glass"), ANDESITE_GLASS);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "deepslate_glass"), DEEPSLATE_GLASS);
    }
}