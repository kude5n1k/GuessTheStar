package com.example.guessthestar.Presenter;

import org.junit.Test;

public class RandomClassTest {

    @Test
    public void genRandom() {

        RandomClass randomClass = new RandomClass();
        int actual =-1;
        for (int i=0; i<=100; i++){
            actual = randomClass.genRandom(0,41);
            System.out.println("TEST :: genRandom :: i="+i+" :: actual = " + actual);
        }

    }
}