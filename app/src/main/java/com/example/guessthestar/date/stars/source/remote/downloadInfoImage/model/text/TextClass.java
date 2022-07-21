package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextClass {


    @SerializedName("*")
    @Expose
    //private String text;
    private List<String> ListText = new ArrayList<String>();


    public String getListTextFromList(int coun) {
        return ListText.get(coun);
    }




    /*
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
   */



}
