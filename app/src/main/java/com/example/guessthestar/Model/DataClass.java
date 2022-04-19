package com.example.guessthestar.Model;

import android.content.Context;

import com.example.guessthestar.Presenter.StarClass;

import java.util.ArrayList;

public final class DataClass {

    private static DataClass INSTANCE;
    private static ArrayList<StarClass> arrayListStarsw = new ArrayList<>();


    private DataClass() { }


    public static synchronized DataClass getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DataClass();
        }
        return INSTANCE;
    }



    public static StarClass getStar(int index) {
        return arrayListStarsw.get(index);
    }


    public static void setArrayStars(ArrayList<StarClass> arrayListStars) {
        DataClass.arrayListStarsw = arrayListStars;
    }
    public static void setStar(StarClass Star) {
        arrayListStarsw.add(Star);
    }




}
