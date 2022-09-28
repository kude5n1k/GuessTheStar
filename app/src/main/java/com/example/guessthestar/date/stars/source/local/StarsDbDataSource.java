package com.example.guessthestar.date.stars.source.local;

import androidx.lifecycle.LiveData;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.local.db.StarsDao;
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




    // количество элементов в DB для LiveData
    public LiveData<Integer> getCountStarsLD() {
        return starsDao.getCountStarsLD();
    }



    // количество элементов в DB
    public int getCountStars() {
        int coin;
        try {
            CountStarsProvider countStarsProvider = new CountStarsProvider();
            countStarsProvider.start();
            countStarsProvider.join();
            coin = countStarsProvider.getCoin();
        }catch (Exception ex){
            coin = -1;
        }
        return coin;
    }

    private class CountStarsProvider extends Thread {
        private int coin;
        public int getCoin() {
            return coin;
        }
        @Override
        public void run() {
            coin = starsDao.getCountStars();
        }
    }




    //  адрес http avatar элемента по номеру в списке
    public String getAddressAva(int line) {
        String addressAva;
        try {
            AddressAvaProvider addressAvaProvider = new AddressAvaProvider(line);
            addressAvaProvider.start();
            addressAvaProvider.join();
            addressAva = addressAvaProvider.getAddressAva();
        }catch (Exception ignored){
            addressAva = null;
        }
        return addressAva;
    }

    private class AddressAvaProvider extends Thread {
        private String addressAva;
        private final int line;
        public AddressAvaProvider(int line) {
            this.line = line;
        }
        public String getAddressAva() {
            return addressAva;
        }
        @Override
        public void run() {
            addressAva = starsDao.getAvatar(line);
        }
    }








    // имена элементов для вариантов выбора по номеру в списке
    public ArrayList<String> getNameStarsVariants(int[] arrStarsLines) {
        ArrayList<String> names;
        try {
            NameStarsVariantsProvider nameStarsVariantsProvider = new NameStarsVariantsProvider(arrStarsLines);
            nameStarsVariantsProvider.start();
            nameStarsVariantsProvider.join();
            names = nameStarsVariantsProvider.getNames();
        }catch (Exception ignored){
            names = null;
        }
        return names;
    }

    private class NameStarsVariantsProvider extends Thread {
        ArrayList<String> names = new ArrayList<>();
        private final int[] arrStarsLines;

        public NameStarsVariantsProvider(int[] arrStarsLines) {
            this.arrStarsLines = arrStarsLines;
        }

        public ArrayList<String> getNames() {
            return names;
        }

        @Override
        public void run() {
            for (int line: arrStarsLines){
                String name = starsDao.getName(line);
                names.add(name);
            }
        }
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
