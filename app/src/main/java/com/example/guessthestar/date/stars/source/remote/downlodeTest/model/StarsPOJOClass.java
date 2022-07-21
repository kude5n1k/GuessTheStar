package com.example.guessthestar.date.stars.source.remote.downlodeTest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class StarsPOJOClass {

    @SerializedName("parse")
    @Expose
    private Map<String, String> parse = new HashMap<String, String>();



    public String getTitle() {
        return null;
    }

    public void setTitle(String text) {

    }



}
