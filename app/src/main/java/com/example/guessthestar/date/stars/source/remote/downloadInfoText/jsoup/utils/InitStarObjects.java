package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

import com.example.guessthestar.date.stars.StarClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InitStarObjects {

    private ArrayList<StarClass> arrStarClass = new ArrayList();



    public ArrayList<StarClass> start(HashMap<String, String> arrStarsInfo){

        for(Map.Entry<String, String> entry : arrStarsInfo.entrySet()) {

            String name = entry.getKey();
            String link = entry.getValue();

            if(name.length()>1 && link.length()>1)
            arrStarClass.add(new StarClass(name, link));

        }
        return arrStarClass;
    }



}
