package com.wh2.foss.fluxplayer.model

class Queue(val queue: List<Song>) {

    companion object {
        fun initialState() = Queue(listOf())
    }
}
