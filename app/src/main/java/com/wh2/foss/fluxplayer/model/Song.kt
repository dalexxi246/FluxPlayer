package com.wh2.foss.fluxplayer.model

data class Song(
        val id : Int,
        val name : String,
        val artist : String,
        val currentTime : Long,
        val favorite : Boolean) : Comparable<Song> {

    override fun compareTo(other: Song) : Int {
        return this.id - other.id
    }

}
