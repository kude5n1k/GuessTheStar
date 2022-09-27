package com.example.guessthestar.ui.body_test;

import android.content.Context;
import android.widget.ImageView;

import com.example.guessthestar.ui.base.BaseView;

import java.util.ArrayList;

public interface BodyTestView extends BaseView {

    Context getContextOwner();

    ImageView getImageViewAva();
    void setNames(ArrayList<String> arrayListStarsRandom);

    void setStatusListName(boolean status);

    void toastError(String mess);

}
