package com.example.guessthestar.date.stars.source.local.db;

import com.example.guessthestar.date.stars.StarClass;

import java.util.ArrayList;

public class StarsDbDataSource {

    private static StarsDbDataSource sInstance;

    private StarsDbDataSource(){};

    public static StarsDbDataSource getsInstance(){
        if(sInstance == null){
            sInstance = new StarsDbDataSource();
        }
        return sInstance;
    }



    public void setStar(StarClass Star) {
        //if (Star!= null) ;
    }
    public StarClass getStar(int index) {
        return null;
    }


    public void setAllStar(ArrayList<StarClass> arrStarClass) {
       // if (arrStarClass!=null)
            //this.arrayListStars = arrStarClass;
    }
    public ArrayList<StarClass> getAllStar() {
        return null;
    }


    public int getCountStars() {
        return 0;
    }


    public void clearAllStars() {
        //if (arrayListStars!= null) arrayListStars.clear();
    }




}
