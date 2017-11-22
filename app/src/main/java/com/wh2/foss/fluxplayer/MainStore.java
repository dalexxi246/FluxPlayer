package com.wh2.foss.fluxplayer;

import com.wh2.foss.fluxplayer.model.Queue;

import me.tatarka.redux.SimpleStore;

public class MainStore extends SimpleStore<Queue> {

    public MainStore() {
        super(Queue.Companion.initialState());
    }
}
