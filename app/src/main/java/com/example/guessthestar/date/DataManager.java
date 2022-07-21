package com.example.guessthestar.date;

import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.date.stars.source.local.cash.StarsCacheDataSource;
import com.example.guessthestar.date.stars.source.local.db.StarsDbDataSource;
import com.example.guessthestar.date.stars.source.remote.StarsDownloadManager;

public class DataManager {

    private static DataManager sInstance;

    private DataManager(){}

    public static synchronized DataManager getsInstance(){
        if (sInstance == null){
            sInstance = new DataManager();
        }
        return sInstance;
    }



    public StarsRepository getStarsRepository() {

        StarsDownloadManager starsDownloadManager = StarsDownloadManager.getsInstance();

        StarsDbDataSource starsDbDataSource = StarsDbDataSource.getsInstance();

        StarsCacheDataSource starsCacheDataSource = StarsCacheDataSource.getsInstance();

        return StarsRepository.getsInstance(starsDownloadManager, starsDbDataSource, starsCacheDataSource);
    }

}
