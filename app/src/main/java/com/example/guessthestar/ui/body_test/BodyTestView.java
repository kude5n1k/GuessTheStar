package com.example.guessthestar.ui.body_test;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.example.guessthestar.ui.base.BaseView;

import java.util.ArrayList;

public interface BodyTestView extends BaseView {

    Context getContextOwner();

    ImageView getImageViewAva();
    void setNames(ArrayList<String> arrayListStarsRandom);

    void answerCorrect(View viewVariant);
    void answerNotCorrect(View viewVariant);


    void toastError(String mess);

}
