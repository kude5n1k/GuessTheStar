package com.example.guessthestar.Model;

import com.example.guessthestar.Presenter.StarClass;

import java.util.ArrayList;

public final class DataStarClass {

    public static String URL_STAR = "https://ru.wikipedia.org/wiki/100_%D0%B2%D0%B5%D0%BB%D0%B8%D1%87%D0%B0%D0%B9%D1%88%D0%B8%D1%85_%D0%B7%D0%B2%D1%91%D0%B7%D0%B4_%D0%BA%D0%B8%D0%BD%D0%BE_%D0%B7%D0%B0_100_%D0%BB%D0%B5%D1%82_%D0%BF%D0%BE_%D0%B2%D0%B5%D1%80%D1%81%D0%B8%D0%B8_AFI";
    private static ArrayList<StarClass> arrayListStars = new ArrayList<>();





    public static StarClass getStar(int index) {
        return arrayListStars.get(index);
    }


    public static void setArrayStars(ArrayList<StarClass> arrayListStars) {
        DataStarClass.arrayListStars = arrayListStars;
    }
    public static void setStar(StarClass Star) {
        arrayListStars.add(Star);
    }


    public static int getSizeArrayListStars(){
        return arrayListStars.size();
    }



}
