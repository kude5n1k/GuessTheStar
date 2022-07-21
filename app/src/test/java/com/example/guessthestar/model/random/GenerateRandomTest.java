package com.example.guessthestar.model.random;

import static org.junit.Assert.*;

import com.example.guessthestar.utils.random.GenerateRandom;

import org.junit.Test;

public class GenerateRandomTest {


    @Test
    public void startTest() {
        GenerateRandom generateRandom = new GenerateRandom();
        int actual =-1;
        int min = 0;
        int max = 10;

        for (int i=0; i<=100; i++){

            actual = generateRandom.start(min,max);

            //System.out.println("TEST :: RandomClassTest :: i="+i+" :: actual = " + actual);

            //проверяем, что результат в нужном диапазоне
            assertTrue( "TEST :: RandomClassTest :: "+i+" :: not valid actual = "+actual,  (actual>=min)&&(actual<=max));
         }
    }





}