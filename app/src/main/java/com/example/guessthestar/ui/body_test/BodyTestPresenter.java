package com.example.guessthestar.ui.body_test;

import android.graphics.Bitmap;

import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAva;
import com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web.DownloadAvaImpl;
import com.example.guessthestar.ui.base.BasePresenter;
import com.example.guessthestar.utils.random.RandomStars;


public class BodyTestPresenter extends BasePresenter<BodyTestView> {

    private final StarsRepository starsRepository;
    private DownloadAvaImpl downloadAvaImpl;
    private int randomStar;

    protected BodyTestPresenter(BodyTestView bodyTestView, StarsRepository starsRepository) {
        super(bodyTestView);
        this.starsRepository = starsRepository;
    }


    /** Activity ===> Presenter */
    public void createNewTest() {

        RandomStars randomStars = new RandomStars();
        randomStars.initialization();
        randomStar = randomStars.getNumberRightStar();

        // ava
        String urlStrAva = "https://"+ randomStars.getURLAvatarRightStar();
        //downloadAvaImpl = new DownloadAva(this);
        //downloadAvaImpl.startDownloadAva(urlStrAva);


        /**  Activity ===>  Presenter  ===>  Activity */
        // name
        view.setNames(randomStars.getArrayListStarsRandom());

    }



    /** Activity  <=== Presenter */
    public void setAva(Bitmap bitmapAva) {
        view.setAva(bitmapAva);
    }


    /**  Activity ===>  Presenter  ===>  Activity */
    public void checkAnswer(int i) {
        if (randomStar == i){
            view.answerCorrect();
        } else {
            view.answerNotCorrect();
        }
    }




}
