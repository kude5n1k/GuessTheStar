package com.example.guessthestar.date.stars.source.local.db;

import androidx.lifecycle.LiveData;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.utils.DiskExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class StarsDbDataSource {

    private Executor executor;
    private StarsDao starsDao;


    private static StarsDbDataSource sInstance;

    private StarsDbDataSource(Executor executor, StarsDao starsDao){
        this.executor = executor;
        this.starsDao = starsDao;
    }

    public static StarsDbDataSource getsInstance(StarsDao starsDao){
        if(sInstance == null){
            sInstance = new StarsDbDataSource(new DiskExecutor(), starsDao);
        }
        return sInstance;
    }





    public void setAllStar(ArrayList<StarClass> arrStarClass) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                starsDao.saveStars(arrStarClass);
            }
        };
        executor.execute(runnable); // интерфейс Runnable в Executor для создания потока
    }


    public void getAllStar11() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               /* ArrayList<StarClass> stars = starsDao.getStars();
                if (!stars.isEmpty()) {
                    //callback.onMoviesLoaded(movies);
                } else {
                    //callback.onDataNotAvailable();
                }*/
            }
        };
        executor.execute(runnable);
    }


    public LiveData<List<StarClass>> getAllStar() {
        return starsDao.getStarsList();
    }

    public LiveData<StarClass> getStar(int starId) {
        return starsDao.getStar(starId);
    }

    public LiveData<Integer> getCountStars() {
        return starsDao.getCountStars();
    }





    public void clearAllStars() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                starsDao.deleteStars();
            }
        };
        executor.execute(runnable);
    }





}
