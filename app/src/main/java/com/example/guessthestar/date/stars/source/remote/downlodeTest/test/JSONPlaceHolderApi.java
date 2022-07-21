package com.example.guessthestar.date.stars.source.remote.downlodeTest.test;

import com.example.guessthestar.date.stars.source.remote.downlodeTest.test.POJOClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


//  интерфейс запросов
//  интерфейс для управления адресом

public interface JSONPlaceHolderApi {
    //@GET("http://api.sample.com/users/user/list")
    //Call<Data> getName();

    @GET("/posts/{id}")
    public Call<POJOClass> getPostWithID(@Path("id") int id);

}




/**
  @GET() GET-запрос для базового адреса. Также можно указать параметры в скобках
  @POST() POST-запрос для базового адреса. Также можно указать параметры в скобках
  @Multipart	Используется при загрузке файлов или изображений

*/

