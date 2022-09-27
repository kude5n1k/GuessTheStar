package com.example.guessthestar.utils;

import java.util.HashMap;
import java.util.Random;

public class GenerateRandom {


    public int[] getLinesArrStarsVariants(int countAllStars){
        if (countAllStars<3) throw new IllegalArgumentException("ERROR :: not enough stars");

        int star1=-1;
        int star2=-1;
        int star3=-1;

        int min = 1;
        int max = countAllStars;

        while ( star1 == star2  ) {
            star1 = generateInt(min, max);
            star2 = generateInt(min, max);
        }
        do {
            star3 = generateInt(min, max);
        } while( star1 == star3 || star2 == star3);

        return new int[] {star1, star2, star3};
    }


    public HashMap<Integer, Integer> getLineRightStar(int[] tempStars){
        HashMap<Integer, Integer> keyAndLink = new HashMap<>();
        int rightKey = generateInt(0, 2);
        int rightLine = tempStars[rightKey];
        keyAndLink.put(rightKey, rightLine);
        return keyAndLink;
    }





    // random int, min and max inclusive
    public int generateInt(int min, int max){
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


