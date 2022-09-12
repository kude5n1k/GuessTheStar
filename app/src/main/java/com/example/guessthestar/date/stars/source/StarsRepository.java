package com.example.guessthestar.date.stars.source;


import androidx.lifecycle.LiveData;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.local.db.StarsDbDataSource;
import com.example.guessthestar.date.stars.source.remote.StarsDownloadManager;

import java.util.ArrayList;

public class StarsRepository {

    private static StarsRepository sInstance;
    private StarsDownloadManager starsDownloadManager;
    private StarsDbDataSource starsDbDataSource;

    private StarsRepository(StarsDownloadManager starsDownloadManager,
                            StarsDbDataSource starsDbDataSource){
        this.starsDownloadManager = starsDownloadManager;
        this.starsDbDataSource = starsDbDataSource;
    }

    public static StarsRepository getsInstance(StarsDownloadManager starsDownloadManager,
                                               StarsDbDataSource starsDbDataSource){
        if (sInstance==null){
            sInstance = new StarsRepository(starsDownloadManager, starsDbDataSource);
        }
        return sInstance;
    }


    public LiveData<Integer> getCountStars() {
        return starsDbDataSource.getCountStars();
    }



    /**Callback*/
    public interface DownloadStarCallback {
        void downloadComplete(ArrayList<StarClass> arrStarClass);
        void downloadError(String mess);
    }
    public void getStarsFromRemoteDataSource(){
        starsDownloadManager.downloadedStars(new DownloadStarCallback(){
            @Override
            public void downloadComplete(ArrayList<StarClass> arrStarClass){
                deleteStars();
                // save in DB
                starsDbDataSource.setAllStar(arrStarClass);
            }
            @Override
            public void downloadError(String mess){
                //previewPresenterCallback.sendMessage(mess);
            }
        });

    }

    public void deleteStars(){
        starsDbDataSource.clearAllStars();
    }







}
