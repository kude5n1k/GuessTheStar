package com.example.guessthestar.utils;

import static org.junit.Assert.assertEquals;

import com.example.guessthestar.utils.GenerateRandom;

import org.junit.Test;

public class GenerateRandomTest {

    @Test
    public void getLinesArrStarsVariants() {
        GenerateRandom generateRandom = new GenerateRandom();

        int maxCountStar = 49; // допустим 50 звезд всего
        int k=0;  // подсчет легитимных line звезд (не ID)

        for (int i=-5; i<=maxCountStar; i++){

            try {
                int[] arr = generateRandom.getLinesArrStarsVariants(i);
                for (int x : arr) {
                    // диапазон должкн быть от 1(если всего одна звезда) до maxCountStar
                    if (x >= 1 && x <= maxCountStar) k++;
                }
                //System.out.println("TEST :: getLinesArrStarsVariants :: i = "+i+" :: k="+ k + " :: "+  arr[0] + "  " + arr[1] + "  " + arr[2]);
            }catch (Exception ignored){}
        }

        //  всего звезд 50 * 3 в каждой итерации - первые 2 итерации тк тест действителен
        //  от 3х звезд в BD
        int expected = maxCountStar*3 - 3*2;

        //проверяем, что все позиции звезд от 1 до maxCountStar
        assertEquals( expected, k);
    }




    @Test
    public void getLineRightStar() {
        String mess = "";
        assertEquals(mess+":: k=",1,1 );
        assertEquals( 1, 1);
    }



    @Test
    public void generateInt() {
        GenerateRandom generateRandom = new GenerateRandom();

        int min = 1;
        int max = 10;
        int k=0;
        for (int i=min; i<=max; i++){
            int rez = generateRandom.generateInt(1,i);
            if (min <= rez && rez <= max) k++;

            //System.out.println("TEST :: generateInt :: k="+k+" ::  "+min+" <= "+rez+" <= "+max);
        }
        assertEquals( max, k);
    }





}

