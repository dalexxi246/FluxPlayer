package com.wh2.foss.fluxplayer.actions;

import com.wh2.foss.fluxplayer.dispatcher.Dispatcher;
import com.wh2.foss.fluxplayer.model.Song;

import java.util.ArrayList;
import java.util.List;

class QueueActionCreator extends ActionCreator {

    public QueueActionCreator(Dispatcher dispatcher) {
        super(dispatcher);
    }

    public void initialState(){
        // TODO: 19/11/17 Arraylist might be loaded from preferences
        Action<List<Song>> action = new Action(ActionType.QUEUE_INIT, new ArrayList<>());
        dispatcher.dispatch(action);
    }

    public void addSong(Song song){
        Action<Song> action = new Action(ActionType.QUEUE_ADD_SONG, song);
        dispatcher.dispatch(action);
    }

    public void removeSong(Song song){}

    public void changeSongPosition(Song song, int newIndex){}

    public void markAsFavorite(Song song){}

}
