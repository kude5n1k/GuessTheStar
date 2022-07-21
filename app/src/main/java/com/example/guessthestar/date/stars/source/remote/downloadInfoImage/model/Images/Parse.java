package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.Images;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



@Generated("jsonschema2pojo")
public class Parse {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("images")
    @Expose
    private List<String> images = null;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Parse withTitle(String title) {
        this.title = title;
        return this;
    }



    public List<String> getImages() {
        return images;
    }
    public void setImages(List<String> images) {
        this.images = images;
    }
    public Parse withImages(List<String> images) {
        this.images = images;
        return this;
    }

}