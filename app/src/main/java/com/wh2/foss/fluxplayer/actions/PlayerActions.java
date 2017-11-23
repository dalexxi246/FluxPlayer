package com.wh2.foss.fluxplayer.actions;

import com.wh2.foss.fluxplayer.model.Song;
import com.yheriatovych.reductor.Action;
import com.yheriatovych.reductor.annotations.ActionCreator;

@ActionCreator
public interface PlayerActions {

    String PLAY = "play";
    String PAUSE = "pause";
    String STOP = "stop";
    String UPDATE_TIME = "update_time";

    @ActionCreator.Action(PLAY)
    Action play(Song song);

    @ActionCreator.Action(PAUSE)
    Action pause(Song song);

    @ActionCreator.Action(STOP)
    Action stop(Song song);

    @ActionCreator.Action(UPDATE_TIME)
    Action updateTime(Song song);

}
