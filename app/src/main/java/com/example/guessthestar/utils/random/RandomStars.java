package com.example.guessthestar.utils.random;

import static com.example.guessthestar.model.date.db.DataStarClass.getSizeArrayListStars;
import static com.example.guessthestar.model.date.db.DataStarClass.getStar;


import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.utils.random.GenerateRandom;

import java.util.ArrayList;


/** get 3 random stars from arrayListStars  and  choose 1 for right variant*/
public class RandomStars {
    private ArrayList<StarClass> arrayListStarsRandom = new ArrayList<>();  // temp star
    GenerateRandom generateRandom;
    private int numberRightStar; // star for check from 3 random stars

    public void initialization(){
        try {
            generateRandom = new GenerateRandom();
            initArrayListStarsRandom();
            initNumberRightStar();
        } catch (Exception e) {
            //Log.i("MyDEBUG","RandomStars :: initialization :: Exception =  " + e );
        }
    }

    private void initArrayListStarsRandom(){
        int countAllStars = getSizeArrayListStars(); // all star
        int[] arrTempStar = getArrTempStar(countAllStars);

        arrayListStarsRandom.add(getStar(arrTempStar[0]) );
        arrayListStarsRandom.add(getStar(arrTempStar[1]) );
        arrayListStarsRandom.add(getStar(arrTempStar[2]) );
    }

    private int[] getArrTempStar(int countAllStars){
        if (countAllStars<1) throw new IllegalArgumentException("ERROR :: not stars");

        int star1=0;
        int star2=0;
        int star3=0;

        int min = 0;
        int max = countAllStars-1;

        while ( star1 == star2  ) {
            star1 = generateRandom.start(min, max);
            star2 = generateRandom.start(min, max);
        }
        while ( star1 == star3 || star2 == star3  ) {
            star3 = generateRandom.start(min, max);
        }

        return new int[] {star1, star2, star3};
    }

    private void initNumberRightStar(){
        int min = 0;
        int max = arrayListStarsRandom.size()-1;
        numberRightStar = generateRandom.start(min, max);
    }






    // get
    public ArrayList<StarClass> getArrayListStarsRandom(){
        return arrayListStarsRandom;
    }
    public String getURLAvatarRightStar(){
        return arrayListStarsRandom.get(numberRightStar).getURLAvatar();
    }
    public String getNameRightStar(){
        return arrayListStarsRandom.get(numberRightStar).getName();
    }
    public int getNumberRightStar() {
        return numberRightStar;
    }


}
