package com.example.guessthestar.ui.body_test.view;

import android.graphics.Bitmap;

import com.example.guessthestar.date.stars.StarClass;

import java.util.ArrayList;

public interface BodyTestActivityView {

    void setAva(Bitmap bitmapAva);
    void setNames(ArrayList<StarClass> arrayListStarsRandom);

    void answerCorrect();
    void answerNotCorrect();

}
