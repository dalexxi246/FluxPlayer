package com.wh2.foss.fluxplayer.viewmodels;

import android.app.Application;
import android.support.annotation.NonNull;

import com.wh2.foss.fluxplayer.MainStore;
import com.wh2.foss.fluxplayer.model.Queue;

import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel;

public class MainViewModel extends StoreAndroidViewModel<Queue, MainStore> {

    public MainViewModel(Application application, @NonNull MainStore store) {
        super(application, store);
    }
}
