package com.alli.onewayglass.mixin;

import com.alli.onewayglass.registry.tool.GlassToolItem;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class GlassHoeIcon {
    @ModifyVariable(method = "innerRenderInGui(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;IIII)V",
            at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private ItemStack modid$CustomItemstack(ItemStack old) {
        if (old.isOf(GlassToolItem.GLASS_AXE)) {
            ItemStack stack = old.copy();
            stack.getOrCreateNbt().putInt("CustomModelData", 1);
            return stack;
        }
        return old;
    }
}
