package com.example.guessthestar;

import static com.example.guessthestar.DataStarClass.getSizeArrayListStars;
import static com.example.guessthestar.DataStarClass.getStar;


import java.util.ArrayList;
import java.util.Random;


/** get 3 random stars from arrayListStars  and  choose 1 for right variant*/
public class RandomClass {
    private ArrayList<StarClass> arrayListStarsRandom;
    private int numberRightStar; // star for check from 3 random stars

    public RandomClass() { }

    public void initialization(){
        arrayListStarsRandom = new ArrayList<>();
        int countStars = getSizeArrayListStars(); // all star

        int star1=0;
        int star2=0;
        int star3=0;
        while ( star1 == star2  ) {
            star1 = genRandom(0, countStars-1);
            star2 = genRandom(0, countStars-1);
        }
        while ( star1 == star3 || star2 == star3  ) {
            star3 = genRandom(0, countStars-1);
        }

        arrayListStarsRandom.add(getStar(star1) );
        arrayListStarsRandom.add(getStar(star2) );
        arrayListStarsRandom.add(getStar(star3) );

        numberRightStar = genRandom(0, arrayListStarsRandom.size()-1);
    }


    public ArrayList<StarClass> getArrayListStarsRandom(){
        return arrayListStarsRandom;
    }
    public String getURLAvatar(){
        return arrayListStarsRandom.get(numberRightStar).getURLAvatar();
    }
    public String getName(){
        return arrayListStarsRandom.get(numberRightStar).getName();
    }

    public int getNumberRightStar() {
        return numberRightStar;
    }



    // random int, min and max inclusive
    public int genRandom(int min, int max){
        int i = 0;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
        return i;
    }







}
