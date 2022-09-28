package com.example.guessthestar.date.stars.source.local.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.guessthestar.date.stars.StarClass;

import java.util.ArrayList;
import java.util.List;


@Dao
public interface StarsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)  //для избежания ошибки при вставке. REPLACE старая запись будет заменена новой.
    void saveStars(ArrayList<StarClass> arrStarClass);


    // количество элементов в DB для LiveData
    @Query("SELECT COUNT(id) FROM stars")
    LiveData<Integer> getCountStarsLD();



    // количество элементов в DB
    @Query("SELECT COUNT(id) FROM stars")
    int getCountStars();

    //  ИМЯ элемента по номеру в списке
    @Query("SELECT name FROM stars LIMIT 1 OFFSET :line-1")
    String getName(int line);

    // АДРЕСС avatar элемента по номеру в списке
    @Query("SELECT avatar FROM stars LIMIT 1 OFFSET :line-1")
    String getAvatar(int line);



    @Query("DELETE FROM stars")
    void deleteStars();

}
