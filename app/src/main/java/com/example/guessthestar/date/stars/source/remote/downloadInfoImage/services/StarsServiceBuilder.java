package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.services;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class StarsServiceBuilder {

    private static StarsServiceBuilder sInstance;

    private StarsServiceBuilder(){
        request();
    }

    public static StarsServiceBuilder getsInstance(){
        if (sInstance == null){
            sInstance = new StarsServiceBuilder();
        }
        return sInstance;
    }



    private static final String BASE_URL = "https://en.wikipedia.org/w/api.php/";
    private Retrofit mRetrofit;

    public void request(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                //.connectTimeout(10, TimeUnit.SECONDS)  // Тайм-аут подключения
                //.writeTimeout(10, TimeUnit.SECONDS)    // Тайм-аут чтения
                //.readTimeout(10, TimeUnit.SECONDS)    // Тайм-аут записи
                .addInterceptor(interceptor);


        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)  // Базовый URL
                //.addConverterFactory(SimpleXmlConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())  // конвертр из build.gradle
                .client(client.build()) // реализовано логирование
                .build();
    }


    public StarsApi createStarsApi() {
        return mRetrofit.create(StarsApi.class);
    }



}
