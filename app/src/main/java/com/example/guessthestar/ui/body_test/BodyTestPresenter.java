package com.example.guessthestar.ui.body_test;


import android.util.Log;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.guessthestar.R;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.ui.base.BasePresenter;
import com.example.guessthestar.utils.GenerateRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class BodyTestPresenter extends BasePresenter<BodyTestView> {

    private final StarsRepository starsRepository;
    private int countAllStars;
    private int rightStarKey; // right answer

    protected BodyTestPresenter(BodyTestView bodyTestView, StarsRepository starsRepository) {
        super(bodyTestView);
        this.starsRepository = starsRepository;
        countAllStars = starsRepository.getCountStars(); // all star
    }


    /** Activity ===> Presenter */
    public void createNewTest() {
        /*
         get 3 random number from all list stars :: x[1...49] : x{5,12,45}
         get random right name from x[] :: y={key,line} :: y={0,5}
        */

        GenerateRandom generateRandom = new GenerateRandom();
        // три рандом звезды от 1 до 49
        int[] arrStarsLines = generateRandom.getLinesArrStarsVariants(countAllStars); // варианты звезд

        // правильный ответ key [0,1,2] и его значение [1-49]
        HashMap<Integer, Integer> keyAndLink = generateRandom.getLineRightStar(arrStarsLines);
         rightStarKey=-1; // правильная звезда key
        int rightStarLine=-1; // правильная звезда line
        for(Map.Entry<Integer, Integer> entry : keyAndLink.entrySet()) {
            rightStarKey = entry.getKey();
            rightStarLine = entry.getValue();
        }

/*
        Log.i("MyDEBUG","BodyTestPresenter :: " +
                "\ncountAllStars = " + countAllStars+
                "\narrStarsLines = " + arrStarsLines[0] + " " + arrStarsLines[1] + " " +arrStarsLines[2] +
                "\nrightStarKey = " + rightStarKey + " rightStarLine = " + rightStarLine
        );
*/

        // ava for nuw test
        setAva(rightStarLine);

        // variant name for nuw test
        setNames(arrStarsLines);
    }


    // download and set AVA for nuw test
    public void setAva(int rightStarLine){
        try {
            Glide
                    .with(view.getContextOwner())
                    .load("https://"+starsRepository.getAddressAva(rightStarLine))
                    .into(view.getImageViewAva());
        }catch (Exception ignored){
            view.toastError("ERROR\n"+R.string.ERROR_uploading_avatar);
        }
    }


    // list NAMEs for nuw test
    public void setNames(int[] arrStarsLines){
        try {
            ArrayList<String> nameStarsVariants = starsRepository.getNameStarsVariants(arrStarsLines);
            view.setNames(nameStarsVariants);
        }catch (Exception ignored){
            view.toastError("ERROR\n"+R.string.ERROR_uploading_list_names);
        }

    }






    /**  Activity ===>  Presenter  ===>  Activity */
    public void checkAnswer(View viewVariant, int position) {
        try {
            if (rightStarKey == position) {
                view.answerCorrect(viewVariant);
            } else {
                view.answerNotCorrect(viewVariant);
            }
        }catch (Exception ignored){
            view.toastError("ERROR\n"+R.string.ERROR_check_variant);
        }
    }













}
