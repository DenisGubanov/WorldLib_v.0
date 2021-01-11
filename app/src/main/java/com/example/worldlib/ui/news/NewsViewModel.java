package com.example.worldlib.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsViewModel extends ViewModel {

    boolean FragmentActivation = false;
    private MutableLiveData<String> mText;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        if (FragmentActivation) {
            mText.setValue("This is gallery fragment");
        }
    }

    public LiveData<String> getText() {
        return mText;
    }
}