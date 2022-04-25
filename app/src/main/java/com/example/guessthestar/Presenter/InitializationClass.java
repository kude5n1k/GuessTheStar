package com.example.guessthestar.Presenter;

import static com.example.guessthestar.Model.DataStarClass.URL_STAR;
import static com.example.guessthestar.Model.DataStarClass.getSizeArrayListStars;

import android.util.Log;

import com.example.guessthestar.Model.HttpCnnctClass;

public class InitializationClass {

    public InitializationClass() {
        try {
            if (getSizeArrayListStars() < 1)  {
                new HttpCnnctClass(URL_STAR);
            }
        } catch (Exception e) {
            Log.i("ОТЛАДКА", "InitializationClass :: ERROR :: e =" + e);
        }
    }




}
