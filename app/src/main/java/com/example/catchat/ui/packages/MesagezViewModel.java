package com.example.catchat.ui.packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MesagezViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MesagezViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mesagez inbox");
    }

    public LiveData<String> getText() {
        return mText;
    }
}