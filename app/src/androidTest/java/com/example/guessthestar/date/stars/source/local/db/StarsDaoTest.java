package com.example.guessthestar.date.stars.source.local.db;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import androidx.room.Room;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.example.guessthestar.App;
import com.example.guessthestar.date.stars.StarClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;


@RunWith(AndroidJUnit4.class)
public class StarsDaoTest {

    private StarsDataBase db;  //  здесь будет хранится база
    private StarsDao starsDao;

    // массив звезд
    ArrayList<StarClass> arrStarClass = new ArrayList<>();

    @Before
    public void createDb() throws Exception {
        db = Room.inMemoryDatabaseBuilder(
                        InstrumentationRegistry.getInstrumentation().getTargetContext(),
                        StarsDataBase.class
                ).build();

        starsDao = db.starsDao();

        arrStarClass.add(new StarClass("name_1", "www_1"));
        arrStarClass.add(new StarClass("name_2", "www_2"));
        arrStarClass.add(new StarClass("name_3", "www_3"));
    }

    @After
    public void closeDb() throws Exception {
        db.close();
    }



    @Test
    public void saveStars() {
        int controlElement = 2;

        starsDao.saveStars(arrStarClass);  // сохраним записи в bd

        int countArr = arrStarClass.size();  // задонное количество звезд
        int countBD = starsDao.getCountStars(); // количество записей в bd

        // в ArrayList отсчет элементов 0,1,2
        String nameArr = arrStarClass.get(controlElement-1).getName();   // заданное имя у элемента X
        String avatarArr = arrStarClass.get(controlElement-1).getAvatar();

        // в BD отсчет элементов 1,2,3
        String nameBD = starsDao.getName(controlElement);                // имя в BD у элемента X
        String avatarBG = starsDao.getAvatar(controlElement);



        // проверка что имя из bd совпадает с заданным
        assertTrue("name from bd != name from Arr", nameArr.equals(nameBD));
        // проверка что адрес аватара из bd совпадает с заданным
        assertTrue("avatar from bd != avatar from Arr", avatarArr.equals(avatarBG));

        // проверка количества записей(Звезд) в bd
        assertEquals("countArr != countBD", countArr,countBD);
    }



    @Test
    public void deleteStars() {

        assertEquals("countBD != 0 ", 0, starsDao.getCountStars());
        starsDao.saveStars(arrStarClass);  // сохраним в bd

        int countArr = arrStarClass.size();  // задонное количество звезд
        int countBD = starsDao.getCountStars(); // количество записей в bd

        // проверка количества записей(Звезд) в bd
        assertEquals("countArr != countBD", countArr, countBD);

        // удалить все записи
        starsDao.deleteStars();

        assertEquals("countBD != 0 ", 0, starsDao.getCountStars());
    }











}















