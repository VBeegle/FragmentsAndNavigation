package com.example.catchat.ui.packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SentMesagezViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SentMesagezViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sent mesagez fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}