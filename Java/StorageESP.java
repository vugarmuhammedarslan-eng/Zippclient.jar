package com.miracsclient.Modules;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;

public class StorageESP {
    public static boolean isEnabled = false;

    public static void init() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (!isEnabled || client.world == null || client.player == null) return;
    }
}
