package com.alli.onewayglass.registry.block;

import com.alli.onewayglass.OneWayGlass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColouredModBlocks {
    //Colour blocks
    public static final DirectionalBlock BLACK_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock WHITE_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock RED_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock ORANGE_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock YELLOW_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock GREEN_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock BLUE_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock PURPLE_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock MAGENTA_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock LIGHT_BLUE_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock LIME_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock PINK_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock GRAY_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock LIGHT_GRAY_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock CYAN_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));
    public static final DirectionalBlock BROWN_SECURITY_GLASS = new DirectionalBlock(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));


    public static void registerBlocks() {
        //Colour blocks
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "black_security_glass"), BLACK_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "white_security_glass"), WHITE_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "red_security_glass"), RED_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "orange_security_glass"), ORANGE_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "yellow_security_glass"), YELLOW_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "green_security_glass"), GREEN_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "blue_security_glass"), BLUE_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "purple_security_glass"), PURPLE_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "magenta_security_glass"), MAGENTA_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "light_blue_security_glass"), LIGHT_BLUE_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "lime_security_glass"), LIME_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "pink_security_glass"), PINK_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "gray_security_glass"), GRAY_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "light_gray_security_glass"), LIGHT_GRAY_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "cyan_security_glass"), CYAN_SECURITY_GLASS);
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "brown_security_glass"), BROWN_SECURITY_GLASS);

    }
}