package com.example.guessthestar.model.random;

import static com.example.guessthestar.model.date.db.DataStarClass.setStar;
import static org.junit.Assert.*;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.utils.random.RandomStars;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RandomStarsTest {

    RandomStars randomStars = new RandomStars();


    @Before
    public void init() throws Exception {
        for (byte i=0; i<=5; i++){
            StarClass _StarClass = new StarClass("url_"+i, "name_"+i);
            setStar(_StarClass);
        }
        randomStars.initialization();
    }


    @Test
    public void getArrayListStarsRandom() {
        ArrayList<StarClass> arrayListStarsRandom = randomStars.getArrayListStarsRandom();
        int size = arrayListStarsRandom.size();
        assertEquals(3,size);
    }

    @Test
    public void getURLAvatar_Not_Null() {
        String ava = randomStars.getURLAvatarRightStar();
        assertNotNull(ava);
    }

    @Test
    public void getName_Not_Null() {
        String name = randomStars.getNameRightStar();
        assertNotNull(name);
    }


    @Test
    public void getNumberRightStar() {
        int numberRightStar = randomStars.getNumberRightStar();
        boolean actual =  (numberRightStar>=0)&&(numberRightStar<=2);
        assertTrue( "TEST :: getNumberRightStar ::  not valid actual = "+numberRightStar, actual);
    }
}