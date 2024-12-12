package com.arlojay.cosmicearth.mixins;

import com.github.puzzle.core.loader.launch.Piece;
import com.github.puzzle.core.loader.provider.mod.entrypoint.impls.PreModInitializer;
import finalforeach.cosmicreach.server.ServerLauncher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerLauncher.class)
public class ServerLauncherMixin {
//    @ModifyVariable(method = "main", at = @At(value = "STORE", target = "Lfinalforeach/cosmicreach/io/ChunkLoader;loadWorld(Ljava/lang/String;)Lfinalforeach/cosmicreach/world/World;"), ordinal = 0)
//    private static String injected(String selectedZoneId) {
//        return "cosmicearth:earth";
//    }

    @ModifyVariable(method = "main", at = @At("STORE"), ordinal = 1)
    private static String injected2(String selectedZoneId) {
        return "cosmicearth:earth";
    }

//    @ModifyVariable(method = "main", at = @At(value = "INVOKE", target = "Lfinalforeach/cosmicreach/io/ChunkLoader;loadWorld(Ljava/lang/String;)Lfinalforeach/cosmicreach/world/World;"), ordinal = 0)
//    private static String injected(String selectedZoneId) {
//        return "cosmicearth:earth";
//    }
}
