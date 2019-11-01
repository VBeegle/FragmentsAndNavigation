package com.example.catchat.ui.packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeebackViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FeebackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Feedback fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}