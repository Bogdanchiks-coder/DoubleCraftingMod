package com.example.doublecrafting;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CraftingHandler {
    @SubscribeEvent
    public void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        PlayerEntity player = event.getPlayer();
        ItemStack crafted = event.getCrafting();
        if (!player.level.isClientSide) {
            ItemStack bonus = crafted.copy();
            bonus.setCount(1);
            player.addItem(bonus);
        }
    }
}
