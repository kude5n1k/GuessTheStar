package com.example.guessthestar.date.stars.source;


import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.local.cash.StarsCacheDataSource;
import com.example.guessthestar.date.stars.source.local.db.StarsDbDataSource;
import com.example.guessthestar.date.stars.source.remote.StarsDownloadManager;
import com.example.guessthestar.ui.base.BaseView;
import com.example.guessthestar.ui.preview.PreviewPresenter;

import java.util.ArrayList;
import java.util.List;

public class StarsRepository {

    private static StarsRepository sInstance;
    private StarsDownloadManager starsDownloadManager;
    private StarsDbDataSource starsDbDataSource;
    private StarsCacheDataSource starsCacheDataSource;

    private StarsRepository(StarsDownloadManager starsDownloadManager,
                            StarsDbDataSource starsDbDataSource,
                            StarsCacheDataSource starsCacheDataSource){
        this.starsDownloadManager = starsDownloadManager;
        this.starsDbDataSource = starsDbDataSource;
        this.starsCacheDataSource = starsCacheDataSource;
    }

    public static StarsRepository getsInstance(StarsDownloadManager starsDownloadManager,
                                               StarsDbDataSource starsDbDataSource,
                                               StarsCacheDataSource starsCacheDataSource){
        if (sInstance==null){
            sInstance = new StarsRepository(starsDownloadManager, starsDbDataSource, starsCacheDataSource);
        }
        return sInstance;
    }

    /**Callback*/
    public interface Callback {
        void downloadComplete(ArrayList<StarClass> arrStarClass);
        void downloadError(String mess);
    }


    public int getCountStars(){
        int countCache = starsCacheDataSource.getCountStars();
        int countDb = starsDbDataSource.getCountStars();
        if (countCache >= countDb) return countCache;
        return countDb;
    }


    public void getStarsFromRemoteDataSource(final PreviewPresenter.Callback callback){
        if (callback == null) return;
        starsDownloadManager.downloadedStars(new Callback(){
            @Override
            public void downloadComplete(ArrayList<StarClass> arrStarClass){
                callback.sendMessage("stars downloaded: OK");
                // refresh cash
                setStarsOnCache(arrStarClass);
                // seve in DB
                setStarsOnDB(arrStarClass);
            }
            @Override
            public void downloadError(String mess){
                callback.sendMessage(mess);
            }
        });

    }

    public void clearStars(final PreviewPresenter.Callback callback){
        starsDbDataSource.clearAllStars();
        starsCacheDataSource.clearAllStars();
        if(getCountStars()<1){
            callback.sendMessage("stars clear: OK");
        }else {
            callback.sendMessage("stars clear: ERROR");
        }
    }


    public void setStarsOnDB(ArrayList<StarClass> arrStarClass){
        starsDbDataSource.setAllStar(arrStarClass);
    }
    public void getStarsFromDB(){
    }


    public void setStarsOnCache(ArrayList<StarClass> arrStarClass){
        starsCacheDataSource.setAllStar(arrStarClass);
    }
    public void getStarsFromCache(){
    }






}
