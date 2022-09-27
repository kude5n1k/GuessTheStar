package com.example.guessthestar.date.stars.source.local.db;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.guessthestar.App;
import com.example.guessthestar.date.stars.StarClass;


@Database(entities = {StarClass.class}, version = 1, exportSchema = false)
public abstract class StarsDataBase extends RoomDatabase {

    public abstract StarsDao starsDao();

    private static StarsDataBase sInstance;

    public static StarsDataBase getInstance(){
        if(sInstance == null){
            // Создание объекта базы данных в классе StarsDatabase.class
            sInstance = Room.databaseBuilder(App.getInstance(), StarsDataBase.class, "Stars.db").build();
        }
        return sInstance;
    }



}
