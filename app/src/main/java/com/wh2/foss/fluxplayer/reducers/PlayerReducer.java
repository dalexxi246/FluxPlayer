package com.wh2.foss.fluxplayer.reducers;

import com.wh2.foss.fluxplayer.actions.PlayerActions;
import com.wh2.foss.fluxplayer.model.AppState;
import com.wh2.foss.fluxplayer.model.Song;
import com.yheriatovych.reductor.Reducer;
import com.yheriatovych.reductor.annotations.AutoReducer;

@AutoReducer
public abstract class PlayerReducer implements Reducer<AppState> {

    @AutoReducer.Action(PlayerActions.PLAY)
    Song play(Song currentSong, Song nextSong) {
        return nextSong;
    }

    static PlayerReducer create() {
        return new PlayerReducerImpl();
    }

}
