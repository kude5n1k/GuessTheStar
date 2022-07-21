package com.example.guessthestar.ui.body_test.presenter;

import android.graphics.Bitmap;

import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAvaImpl;
import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAva;
import com.example.guessthestar.utils.random.RandomStars;
import com.example.guessthestar.ui.body_test.view.BodyTestActivityView;

public class BodyTestActivityPresenterImpl implements BodyTestActivityPresenter {
    private BodyTestActivityView bodyTestActivityView;
    private DownloadAvaImpl downloadAvaImpl;
    private int randomStar;

    public BodyTestActivityPresenterImpl(BodyTestActivityView bodyTestActivityView) {
        this.bodyTestActivityView = bodyTestActivityView;
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
        bodyTestActivityView.setNames(randomStars.getArrayListStarsRandom());

    }




    /** Activity  <=== Presenter */
    @Override
    public void setAva(Bitmap bitmapAva) {
        bodyTestActivityView.setAva(bitmapAva);
    }


    /**  Activity ===>  Presenter  ===>  Activity */
    @Override
    public void checkAnswer(int i) {
        if (randomStar == i){
            bodyTestActivityView.answerCorrect();
        } else {
            bodyTestActivityView.answerNotCorrect();
        }
    }







}
