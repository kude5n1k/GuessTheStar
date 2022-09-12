package com.example.guessthestar.ui.body_test.presenter;

import android.graphics.Bitmap;

import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAvaImpl;
import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAva;
import com.example.guessthestar.utils.random.RandomStars;
import com.example.guessthestar.ui.body_test.BodyTestView;

public class BodyTestActivityPresenterImpl implements BodyTestActivityPresenter {
    private BodyTestView bodyTestView;
    private DownloadAvaImpl downloadAvaImpl;
    private int randomStar;

    public BodyTestActivityPresenterImpl(BodyTestView bodyTestView) {
        this.bodyTestView = bodyTestView;
    }


    /** Activity ===> Presenter */
    @Override
    public void createNewTest() {

        RandomStars randomStars = new RandomStars();
        randomStars.initialization();
        randomStar = randomStars.getNumberRightStar();

        // ava
        String urlStrAva = "https://"+ randomStars.getURLAvatarRightStar();
        downloadAvaImpl = new DownloadAva(this);
        downloadAvaImpl.startDownloadAva(urlStrAva);


        /**  Activity ===>  Presenter  ===>  Activity */
        // name
        bodyTestView.setNames(randomStars.getArrayListStarsRandom());

    }




    /** Activity  <=== Presenter */
    @Override
    public void setAva(Bitmap bitmapAva) {
        bodyTestView.setAva(bitmapAva);
    }


    /**  Activity ===>  Presenter  ===>  Activity */
    @Override
    public void checkAnswer(int i) {
        if (randomStar == i){
            bodyTestView.answerCorrect();
        } else {
            bodyTestView.answerNotCorrect();
        }
    }







}
