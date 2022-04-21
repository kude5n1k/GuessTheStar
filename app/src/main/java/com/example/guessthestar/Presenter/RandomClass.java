package com.example.guessthestar.Presenter;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;
import static com.example.guessthestar.Model.DataClass.URL_STAR;
import static com.example.guessthestar.Model.DataClass.getSizeArrayListStars;

import android.util.Log;

import com.example.guessthestar.Model.DataClass;
import com.example.guessthestar.Model.HttpCnnct;

import java.util.ArrayList;
import java.util.Random;

public class RandomClass {
    private final ArrayList<StarClass> arrayListStarsRndm;
    private int randomStar; // star for check


    public RandomClass() {
        arrayListStarsRndm = new ArrayList<>();
        int sizeArrayListStars = DataClass.getSizeArrayListStars();

        int ind1=0;
        int ind2=0;
        int ind3=0;
        while ( ind1==ind2 || ind1==ind3 || ind2==ind3  ) {
            ind1 = genRandom(0, sizeArrayListStars+1);
            ind2 = genRandom(0, sizeArrayListStars+1);
            ind3 = genRandom(0, sizeArrayListStars+1);
        }

        arrayListStarsRndm.add(DataClass.getStar(ind1) );
        arrayListStarsRndm.add(DataClass.getStar(ind2) );
        arrayListStarsRndm.add(DataClass.getStar(ind3) );

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
