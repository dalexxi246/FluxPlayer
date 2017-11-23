package com.wh2.foss.fluxplayer;

import com.wh2.foss.fluxplayer.model.AppState;

public class MainStore {

    private final AppState appState;

    public MainStore() {
        appState = AppState.Companion.initialState();
    }

}
