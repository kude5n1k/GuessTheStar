package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.Images;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Generated;

// POJO


@Generated("jsonschema2pojo")
public class RootParse {

    @SerializedName("parse")
    @Expose
    private Parse parse;

    public Parse getParse() {
        return parse;
    }

    public void setParse(Parse parse) {
        this.parse = parse;
    }

    public RootParse withParse(Parse parse) {
        this.parse = parse;
        return this;
    }

}