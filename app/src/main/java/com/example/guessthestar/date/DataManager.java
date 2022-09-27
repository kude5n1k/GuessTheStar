package com.example.guessthestar.date;

import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.date.stars.source.local.db.StarsDao;
import com.example.guessthestar.date.stars.source.local.db.StarsDataBase;
import com.example.guessthestar.date.stars.source.local.StarsDbDataSource;
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



        StarsDao starsDao = StarsDataBase.getInstance().starsDao();
        StarsDbDataSource starsDbDataSource = StarsDbDataSource.getsInstance(starsDao);

        return StarsRepository.getsInstance(starsDownloadManager, starsDbDataSource);
    }

}
