package com.example.guessthestar.date.stars.source.local.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.guessthestar.App;
import com.example.guessthestar.date.stars.StarClass;


@Database(entities = {StarClass.class}, version = 1, exportSchema = false)
public abstract class StarsDatabase extends RoomDatabase {

    public abstract StarsDao starsDao();

    private static StarsDatabase sInstance;

    public static StarsDatabase getInstance(){
        if(sInstance == null){
            // Создание объекта базы данных в классе StarsDatabase.class
            sInstance = Room.databaseBuilder(App.getInstance(), StarsDatabase.class, "Stars.db").build();
        }
        return sInstance;
    }



}
