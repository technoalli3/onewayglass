package com.alli.onewayglass.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.alli.onewayglass.registry.item.ModItems.POWDERED_GLASS;
import static com.alli.onewayglass.registry.tool.GlassToolItem.GLASS_PICKAXE;

@Mixin(LivingEntity.class)
public abstract class MixinReplaceBrokenTool {
    @Shadow public abstract void sendEquipmentBreakStatus(EquipmentSlot slot);

    @Shadow public abstract void clearActiveItem();

    @Shadow public abstract boolean isHolding(Item item);

    @Shadow public abstract ItemStack getStackInHand(Hand hand);

    @Shadow public abstract void setStackInHand(Hand hand, ItemStack stack);

    @Shadow public abstract ItemStack getActiveItem();

    @Shadow public abstract ItemStack getMainHandStack();

    @Shadow public abstract ItemStack getOffHandStack();

    @Shadow public abstract void equipStack(EquipmentSlot slot, ItemStack stack);

    @Inject(method="sendEquipmentBreakStatus",at=@At("HEAD"))
    public void sendToolBreakStatus(EquipmentSlot slot, CallbackInfo ci) {
        if(getMainHandStack().isOf(GLASS_PICKAXE)) {
            this.equipStack(slot, new ItemStack(POWDERED_GLASS));
        }
    }
}
