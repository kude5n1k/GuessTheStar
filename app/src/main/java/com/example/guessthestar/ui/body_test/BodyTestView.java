package com.example.guessthestar.ui.body_test;

import android.graphics.Bitmap;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.ui.base.BaseView;

import java.util.ArrayList;

public interface BodyTestView extends BaseView {

    void setAva(Bitmap bitmapAva);
    void setNames(ArrayList<StarClass> arrayListStarsRandom);

    void answerCorrect();
    void answerNotCorrect();

}
