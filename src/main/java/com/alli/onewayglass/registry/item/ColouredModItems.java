package com.alli.onewayglass.registry.item;

import com.alli.onewayglass.OneWayGlass;
import com.alli.onewayglass.registry.block.ColouredModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColouredModItems {
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

    public static void registerItems() {
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
    }
}
