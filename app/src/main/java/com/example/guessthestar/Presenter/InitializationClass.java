package com.example.guessthestar.Presenter;

import static com.example.guessthestar.Model.DataClass.URL_STAR;
import static com.example.guessthestar.Model.DataClass.getSizeArrayListStars;

import android.util.Log;

import com.example.guessthestar.Model.HttpCnnct;

public class InitializationClass {

    public InitializationClass() {
        initDate();
    }

    private void initDate(){
        try {
            if (getSizeArrayListStars() < 1)  {
                new HttpCnnct(URL_STAR);
            }
        } catch (Exception e) {
            Log.i("ОТЛАДКА", "InitializationClass :: initDate :: ERROR :: e =" + e);
        }

    }



}
