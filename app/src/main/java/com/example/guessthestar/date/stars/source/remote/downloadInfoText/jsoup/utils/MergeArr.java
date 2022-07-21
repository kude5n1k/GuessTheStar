package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


// создание результирующего массива arrStarsInfo с valid name и link на img
public class MergeArr {

    private HashMap<String, String> arrStarsInfo = new HashMap<>();


    public HashMap<String, String> start(ArrayList<String> arrValidName, HashMap<String, String> arrAltNameLink){

        for(Map.Entry<String, String> entry : arrAltNameLink.entrySet()) {
            String altName = entry.getKey();
            String link = entry.getValue();

            for (String name: arrValidName){

                if (altName.contains(name)){
                    arrStarsInfo.put(name, link);

                    arrValidName.remove(name);
                    break;
                }

            }

        }

        return arrAltNameLink;
    }







}
