package com.example.catchat.ui.packages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DraftzViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DraftzViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Draftz fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}