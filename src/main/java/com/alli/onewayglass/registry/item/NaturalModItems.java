package com.alli.onewayglass.registry.item;

import com.alli.onewayglass.OneWayGlass;
import com.alli.onewayglass.registry.block.NaturalModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NaturalModItems {
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
