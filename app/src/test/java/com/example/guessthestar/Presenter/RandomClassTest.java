package com.example.guessthestar.Presenter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RandomClassTest {


    @Test
    public void genRandom() {

        RandomClass randomClass = new RandomClass();
        int actual =-1;

        for (int i=0; i<=100; i++){

            actual = randomClass.genRandom(0,10);

            System.out.println("TEST :: genRandom :: i="+i+" :: actual = " + actual);
        }
        //assertEquals(0, 2 + 2);
    }




    @Test
    public void addition_isNotCorrect() throws Exception {
        assertEquals("Numbers isn't equals!", 5, 2 + 2);
    }












}