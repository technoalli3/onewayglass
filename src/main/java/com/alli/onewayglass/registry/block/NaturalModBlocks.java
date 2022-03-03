package com.alli.onewayglass.registry.block;

import com.alli.onewayglass.OneWayGlass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NaturalModBlocks {
    public static final DirectionalBlock OAK_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock SPRUCE_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock ACACIA_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock DARK_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock BIRCH_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock STONE_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock JUNGLE_PLANK_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock GRANITE_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock DIORITE_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock ANDESITE_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock DEEPSLATE_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "oak_plank_glass"), OAK_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "spruce_plank_glass"), SPRUCE_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "acacia_plank_glass"), ACACIA_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "dark_plank_glass"), DARK_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "birch_plank_glass"), BIRCH_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "stone_glass"), STONE_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "jungle_plank_glass"), JUNGLE_PLANK_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "granite_glass"), GRANITE_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "diorite_glass"), DIORITE_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "andesite_glass"), ANDESITE_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "deepslate_glass"), DEEPSLATE_GLASS);
    }
}
