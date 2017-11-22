package com.wh2.foss.fluxplayer.model

import java.util.*

class Queue(val queue: List<Song>) {

    companion object {
        fun initialState() = Queue(Collections.emptyList())
    }
}
