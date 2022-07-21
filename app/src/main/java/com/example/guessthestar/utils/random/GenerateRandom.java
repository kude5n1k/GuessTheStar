package com.example.guessthestar.utils.random;

import java.util.Random;

public class GenerateRandom {


    // random int, min and max inclusive
    public int start(int min, int max){
        try {

            int i = 0;
            int diff = max - min;
            Random random = new Random();
            i = random.nextInt(diff + 1);
            i += min;
            return i;

        } catch (Exception ignored) {
            throw new IllegalArgumentException("min/max not valid :: min=("+min+") ; max=("+max+") ");
        }
    }


}


