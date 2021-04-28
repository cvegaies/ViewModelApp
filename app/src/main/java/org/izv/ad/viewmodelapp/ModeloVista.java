package org.izv.ad.viewmodelapp;

import androidx.lifecycle.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//https://developer.android.com/topic/libraries/architecture/viewmodel
//https://developer.android.com/jetpack/androidx/releases/lifecycle#declaring_dependencies

public class ModeloVista extends ViewModel {

    private List<String> data = new ArrayList<>();
    private MutableLiveData<List<String>> strings;

    public LiveData<List<String>> getString() {
        if (strings == null) {
            strings = new MutableLiveData<List<String>>();
            loadStrings();
        }
        return strings;
    }

    private void loadStrings() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(300);
                    } catch (InterruptedException e) {
                    }
                    data.add(randomString());
                    strings.postValue(data);
                }
            }
        };
        thread.start();
    }

    private String randomString() {
        return UUID.randomUUID().toString();
    }
}