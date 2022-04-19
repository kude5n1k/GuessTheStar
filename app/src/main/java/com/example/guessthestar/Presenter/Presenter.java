package com.example.guessthestar.Presenter;

import static com.example.guessthestar.Model.HttpCnnct.arrayListStars;

import android.util.Log;

import com.example.guessthestar.Model.HttpCnnct;

import java.util.ArrayList;

public class Presenter {


    public void initDate(){
        try {
            new HttpCnnct();
            if (arrayListStars == null) {
               // new HttpCnnct();
            }
        } catch (Exception e) {
            Log.i("ОТЛАДКА", "Presenter :: initDate :: ERROR :: e =" + e);
        }

    }


    public ArrayList<StarClass> getRandomName(){

        ArrayList<StarClass> arrayListStarsT = new ArrayList<>();
        arrayListStarsT.add(arrayListStars.get(0));
        arrayListStarsT.add(arrayListStars.get(1));
        arrayListStarsT.add(arrayListStars.get(2));
        return arrayListStarsT;
    }







}
