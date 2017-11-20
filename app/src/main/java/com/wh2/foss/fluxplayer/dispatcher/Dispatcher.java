package com.wh2.foss.fluxplayer.dispatcher;

import com.wh2.foss.fluxplayer.actions.Action;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

public class Dispatcher {

    private BehaviorSubject<Action> actionSubject = BehaviorSubject.create();

    public void dispatch(Action action) {
        actionSubject.onNext(action);
    }

    public Observable<Action> actionsIssuedObservable() {
        return actionSubject.hide();
    }

}
