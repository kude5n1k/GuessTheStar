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


   // @Query("SELECT * FROM stars")
   // ArrayList<StarClass> getStars();


    @Query("SELECT * FROM stars")
    LiveData<List<StarClass>> getStarsList();

    @Query("SELECT * FROM stars WHERE id =:starId")
    LiveData<StarClass> getStar(int starId);



    //@Query("SELECT COUNT(id) FROM stars")
    //int getCountStars();


    @Query("SELECT COUNT(id) FROM stars")
    LiveData<Integer> getCountStars();



    @Query("DELETE FROM stars")
    void deleteStars();


}
