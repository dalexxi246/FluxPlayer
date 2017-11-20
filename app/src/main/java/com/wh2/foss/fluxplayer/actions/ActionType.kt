package com.wh2.foss.fluxplayer.actions

enum class ActionType {

    QUEUE_INIT,
    QUEUE_ADD_SONG,
    QUEUE_REMOVE_SONG,
    QUEUE_CHANGE_SONG_POSITION,
    QUEUE_MARK_FAVORITE,

    SONG_INIT,
    SONG_PLAYING,
    SONG_STOPPED,
    SONG_PAUSED,
    SONG_TIME_UPDATED
}

