package com.example.catchat.ui.packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HalpViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public HalpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is halp fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}