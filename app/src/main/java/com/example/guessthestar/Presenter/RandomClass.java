package com.example.guessthestar.Presenter;

import com.example.guessthestar.Model.DataStarClass;

import java.util.ArrayList;
import java.util.Random;

public class RandomClass {
    private final ArrayList<StarClass> arrayListStarsRndm;
    private final int randomStar; // star for check


    public RandomClass() {
        arrayListStarsRndm = new ArrayList<>();
        int sizeArrayListStars = DataStarClass.getSizeArrayListStars();

        int ind1=0;
        int ind2=0;
        int ind3=0;
        while ( ind1==ind2 || ind1==ind3 || ind2==ind3  ) {
            ind1 = genRandom(0, sizeArrayListStars-1);
            ind2 = genRandom(0, sizeArrayListStars-1);
            ind3 = genRandom(0, sizeArrayListStars-1);
        }

        arrayListStarsRndm.add(DataStarClass.getStar(ind1) );
        arrayListStarsRndm.add(DataStarClass.getStar(ind2) );
        arrayListStarsRndm.add(DataStarClass.getStar(ind3) );

        randomStar = genRandom(0,2);
    }



    public ArrayList<StarClass> getArrayListStarsRndm(){
        return arrayListStarsRndm;
    }
    public String getURLAvatar(){
        return arrayListStarsRndm.get(randomStar).getURLAvatar();
    }
    public String getName(){
        return arrayListStarsRndm.get(randomStar).getName();
    }

    public int getRandomStar() {
        return randomStar;
    }



    public int genRandom(int min, int max){
        int i = 0;
        int diff = max - min;
        Random random = new Random();
        i = random.nextInt(diff + 1);
        i += min;
        return i;
    }







}
