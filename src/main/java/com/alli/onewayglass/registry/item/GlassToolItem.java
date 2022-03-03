package com.alli.onewayglass.registry.item;

import com.alli.onewayglass.OneWayGlass;
import com.alli.onewayglass.registry.tool.CustomAxe;
import com.alli.onewayglass.registry.tool.CustomHoe;
import com.alli.onewayglass.registry.tool.CustomPickaxe;
import com.alli.onewayglass.registry.tool.GlassToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GlassToolItem {
    public static ToolItem GLASS_SHOVEL = new ShovelItem(GlassToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem GLASS_SWORD = new SwordItem(GlassToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem GLASS_PICKAXE = new CustomPickaxe(GlassToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem GLASS_AXE = new CustomAxe(GlassToolMaterial.INSTANCE, 7.0F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem GLASS_HOE = new CustomHoe(GlassToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_shovel"), GLASS_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_sword"), GLASS_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_pickaxe"), GLASS_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_axe"), GLASS_AXE);
        Registry.register(Registry.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_hoe"), GLASS_HOE);
    }
}
