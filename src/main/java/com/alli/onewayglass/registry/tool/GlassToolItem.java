package com.alli.onewayglass.registry.tool;

import com.alli.onewayglass.OneWayGlass;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GlassToolItem {
    public static ToolItem GLASS_SHOVEL = new ShovelItem(GlassToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
    public static ToolItem GLASS_SWORD = new SwordItem(GlassToolMaterial.INSTANCE, 3, -3.0F, new Item.Settings());
    public static ToolItem GLASS_PICKAXE = new CustomPickaxe(GlassToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static ToolItem GLASS_AXE = new CustomAxe(GlassToolMaterial.INSTANCE, 7.0F, -3.2F, new Item.Settings());
    public static ToolItem GLASS_HOE = new CustomHoe(GlassToolMaterial.INSTANCE, 7, -3.2F, new Item.Settings());


    public static void registerTools() {
        Registry.register(Registries.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_shovel"), GLASS_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_sword"), GLASS_SWORD);
        Registry.register(Registries.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_pickaxe"), GLASS_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_axe"), GLASS_AXE);
        Registry.register(Registries.ITEM, new Identifier(OneWayGlass.MOD_ID, "glass_hoe"), GLASS_HOE);
    }
}
