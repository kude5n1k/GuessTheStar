package com.example.guessthestar.ui.body_test.presenter;

import android.graphics.Bitmap;

public interface BodyTestActivityPresenter {

    void createNewTest();
    void setAva(Bitmap bitmapAva);
    void checkAnswer(int i);

}
