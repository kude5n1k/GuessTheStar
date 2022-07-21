package com.example.guessthestar.date.stars.source.remote.downlodeTest.test;

import android.util.Log;

import androidx.annotation.NonNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StarsDownloadInfoRequest {


    private static StarsDownloadInfoRequest sInstance;

    private StarsDownloadInfoRequest(){}

    public static StarsDownloadInfoRequest getsInstance(){
        if (sInstance == null){
            sInstance = new StarsDownloadInfoRequest();
        }
        return sInstance;
    }



    public void request(){
        StarsDownloadInfoBuilder.getsInstance()
                .getJSONApi()
                .getPostWithID(1)
                .enqueue(new Callback<POJOClass>() {   // Call.execute() - для синхронного запроса   || Call.enqueue() - для асинхронного
                    @Override
                    public void onResponse(@NonNull Call<POJOClass> call, @NonNull Response<POJOClass> response) {
                        POJOClass mPOJOClass = response.body();

                        String rezalt = "id: " + mPOJOClass.getId() + "\n" +
                                "UserId: " + mPOJOClass.getUserId() + "\n" +
                                "Title: " + mPOJOClass.getTitle() + "\n" +
                                "Body: " + mPOJOClass.getBody() + "\n"+
                                "--------------------------------------";

                        Log.i("MyDEBUG","StarsDownloadManagerImpl :: downloadedStars->onFailure :: rezalt = \n" + rezalt );

                    }

                    @Override
                    public void onFailure(@NonNull Call<POJOClass> call, @NonNull Throwable t) {

                        Log.i("MyDEBUG","StarsDownloadManagerImpl :: downloadedStars->onFailure :: Error occurred while getting request!" );
                        t.printStackTrace();
                    }
                });

    }






}
