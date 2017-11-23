package com.wh2.foss.fluxplayer.model

data class AppState(val queue: Queue, val currentSong: Song?) {

    companion object {
        fun initialState(): AppState = AppState(Queue.initialState(), null)
    }

}