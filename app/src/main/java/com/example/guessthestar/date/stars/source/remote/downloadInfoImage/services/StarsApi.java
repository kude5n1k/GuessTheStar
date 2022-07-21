package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.services;

import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.Images.RootParse;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text.Parse1;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.xml.RSSFeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StarsApi {

    //json
    @GET("?action=parse&format=json&page=AFI%27s_100_Years...100_Stars&prop=images")
    public Call<RootParse> getImages();

    @GET("?action=parse&format=json&page=AFI%27s_100_Years...100_Stars&prop=text")
    public Call<Parse1> getText();



    //xml
    @GET("?action=parse&format=xml&page=AFI%27s_100_Years...100_Stars&prop=text")
    public Call<RSSFeed> loadRSSFeed();

}
