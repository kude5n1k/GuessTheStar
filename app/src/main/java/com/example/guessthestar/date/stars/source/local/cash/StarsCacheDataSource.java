package com.example.guessthestar.date.stars.source.local.cash;

import com.example.guessthestar.date.stars.StarClass;

import java.util.ArrayList;


public class StarsCacheDataSource   {

    private static StarsCacheDataSource sInstance;


    //private final SparseArray<StarClass> cachedMovies = new SparseArray<>();
    private ArrayList<StarClass> arrayListStars = new ArrayList<>();

    private StarsCacheDataSource(){};

    public static StarsCacheDataSource getsInstance() {
        if (sInstance == null) {
            sInstance = new StarsCacheDataSource();
        }
        return sInstance;
    }




    public void setStar(StarClass Star) {
        if (Star!= null) arrayListStars.add(Star);
    }
    public StarClass getStar(int index) {
        return arrayListStars.get(index);
    }


    public void setAllStar(ArrayList<StarClass> arrStarClass) {
        if (arrStarClass!=null)
        this.arrayListStars = arrStarClass;
    }
    public ArrayList<StarClass> getAllStar() {
        return arrayListStars;
    }


    public int getCountStars() {
        return arrayListStars.size();
    }


    public void clearAllStars() {
        if (arrayListStars!= null) arrayListStars.clear();
    }



}
