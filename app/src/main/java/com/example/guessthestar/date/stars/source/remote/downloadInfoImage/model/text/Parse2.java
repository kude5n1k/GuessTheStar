package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text;


import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;


public class Parse2 {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("text")
    @Expose
    private TextClass textClass;




    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public TextClass getTextClass() {
        return textClass;
    }
    public void setTextClass(TextClass textClass) {
        this.textClass = textClass;
    }




}