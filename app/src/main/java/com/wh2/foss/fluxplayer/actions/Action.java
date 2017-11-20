package com.wh2.foss.fluxplayer.actions;

public class Action<T> {

    private final ActionType type;
    private final T data;

    Action(ActionType type, T data) {
        this.type = type;
        this.data = data;
    }

    public ActionType getType() {
        return type;
    }

    public T getData() {
        return data;
    }

}
