package com.example.guessthestar.Presenter;

import static org.junit.Assert.assertEquals;

import com.example.guessthestar.RandomClass;

import org.junit.Before;
import org.junit.Test;

public class RandomClassTest {
    RandomClass randomClass;

    @Before
    public void setUp() throws Exception {
        randomClass = new RandomClass();
    }


    @Test
    public void genRandoming() {
        int actual =-1;

        for (int i=0; i<=100; i++){

            actual = randomClass.genRandom(0,10);

            System.out.println("TEST :: genRandom :: i="+i+" :: actual = " + actual);
            assertEquals( "TEST :: genRandom :: "+i+" :: not valid actual = "+actual, true, (actual>=0)&&(actual<=10));
        }
    }














}