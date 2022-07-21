package com.example.guessthestar.date.stars.source.remote.downlodeTest.test;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StarsDownloadInfoBuilder {

    private static StarsDownloadInfoBuilder sInstance;

    private StarsDownloadInfoBuilder(){
        request();
    }

    public static StarsDownloadInfoBuilder getsInstance(){
        if (sInstance == null){
            sInstance = new StarsDownloadInfoBuilder();
        }
        return sInstance;
    }




    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private Retrofit mRetrofit;

    public void request(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)  // Базовый URL
                .addConverterFactory(GsonConverterFactory.create())  // конверте из build.gradle
                .build();
    }


    public JSONPlaceHolderApi getJSONApi() {
        return mRetrofit.create(JSONPlaceHolderApi.class);
    }


}


/*
Call.execute() - для синхронного запроса
Call.enqueue() - для асинхронного
*/
