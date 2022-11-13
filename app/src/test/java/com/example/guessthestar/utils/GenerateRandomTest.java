package com.example.guessthestar.utils;

import static org.junit.Assert.assertEquals;

import com.example.guessthestar.utils.GenerateRandom;

import org.junit.Test;

public class GenerateRandomTest {


    //проверяем, что все позиции звезд от 1 до maxCountStar
    @Test
    public void getLinesArrStarsVariants() {
        GenerateRandom generateRandom = new GenerateRandom();

        int maxCountStar = 49; // допустим X звезд всего
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


        assertEquals( expected, k);
    }




    // проверка генерации ранодом int (min и max включая)
    @Test
    public void generateInt2() {
        GenerateRandom generateRandom = new GenerateRandom();

        int min = -5;
        int max = 5;
        int expected = 55;

        int k=0;
        for (int i=min; i<=max; i++){
            for (int x=min; x<=max; x++){

                try {
                    int rez = generateRandom.generateInt(i,x);
                    if (i <= rez && rez <= x) k++;

                    //System.out.println("TEST :: generateInt :: k="+k+" ::  "+i+" <= "+rez+" <= "+x);
                } catch (Exception ex) {
                    //System.out.println("TEST :: generateInt :: k="+k+" ::  "+i+" <= ERROR <= "+x+ " ::  ex = " + ex );
                }

            }
        }

        assertEquals(expected, k);
    }



}

