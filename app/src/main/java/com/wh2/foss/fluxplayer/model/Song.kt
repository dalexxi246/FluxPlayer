package com.wh2.foss.fluxplayer.model

data class Song(
        val id : Int,
        val name : String,
        val artist : String,
        val currentTime : Long,
        val favorite : Boolean,
        val state : SongState) : Comparable<Song> {

    override fun compareTo(other: Song) : Int {
        return this.id - other.id
    }

}

enum class SongState {
    PLAYING, PAUSED, STOPPED
}
