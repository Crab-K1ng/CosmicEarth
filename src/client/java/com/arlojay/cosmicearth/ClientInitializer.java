package com.arlojay.cosmicearth;

import com.github.puzzle.core.loader.launch.provider.mod.entrypoint.impls.ClientModInitializer;

public class ClientInitializer implements ClientModInitializer {

    @Override
    public void onInit() {
//        Constants.LOGGER.info("Hello From INIT");
        Debug.addDebugItem("biome", Debug.biomeNoiseDebug);
    }

}
