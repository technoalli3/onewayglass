package com.alli.onewayglass.registry.block;

import com.alli.onewayglass.OneWayGlass;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NaturalGlassDoors {
    public static final GlassDoor OAK_GLASS_DOOR = new GlassDoor(FabricBlockSettings.of(Material.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque().hardness(1.5F));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(OneWayGlass.MOD_ID, "oak_glass_door"), OAK_GLASS_DOOR);
    }
}
