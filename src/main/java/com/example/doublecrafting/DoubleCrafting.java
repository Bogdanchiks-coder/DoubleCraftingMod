package com.example.doublecrafting;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("doublecrafting")
public class DoubleCrafting {
    public DoubleCrafting() {
        MinecraftForge.EVENT_BUS.register(new CraftingHandler());
    }
}
