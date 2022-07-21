package com.example.guessthestar.ui.preview;

import android.content.Context;

import com.example.guessthestar.date.stars.source.StarsDataSource;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.ui.base.BasePresenter;
import com.example.guessthestar.utils.StartBodyTest;

import java.lang.ref.WeakReference;


public class PreviewPresenter extends BasePresenter<PreviewView> {

    private final StarsRepository starsRepository;

    PreviewPresenter(PreviewView previewView, StarsRepository starsRepository) {
        super(previewView);
        this.starsRepository = starsRepository;
    }


    /**Callback*/
    public interface Callback {
        void sendMessage(String mess);
    }




    /** Activity ===> Presenter */
    //checking if stars have
    public void checkCountStars(){
        int countStars = starsRepository.getCountStars();
        if (countStars <= 1)  {
            // not Ready To Start
            view.sendMessage("need downloaded stars");
            view.progressUpdate(0);
            view.isButtonStartTestEnabled(false);

        }else {
            // Ready To Start (данные есть - готовы начать)
            view.sendMessage("we have " + countStars + "  stars");
            view.progressUpdate(countStars);
            view.isButtonStartTestEnabled(true);
        }
    }

    public void downloadedStars() {
        //starsRepository.getStarsFromRemoteDataSource(new StarsDownloadCallListener(view));
        starsRepository.getStarsFromRemoteDataSource(new Callback(){
            @Override
            public void sendMessage(String mes) {
                view.sendMessage(mes);
            }
        });
    }

    public void clearStars(){
        starsRepository.clearStars(new Callback(){
            @Override
            public void sendMessage(String mes) {
                view.sendMessage(mes);
            }
        });
    }

    public void startBodyTestActivity(Context cnt) {
        new StartBodyTest(cnt);
    }






    /** Activity <=== Presenter*/
    public void progressUpdate(int progress) {
        view.progressUpdate(progress);
    }
    public void downloadComplete(int countStars) {
       // view.readyToStart(countStars);
    }
    public void downloadError() {
        view.sendMessage("  ");
    }

    /**
     * Callback
     **/
    private static class StarsDownloadCallListener implements StarsDataSource.LoadStarsCallback {
        private WeakReference<PreviewView> view;   // мягкая ссылка подходит для метаданных

        private StarsDownloadCallListener(PreviewView view) {
            this.view = new WeakReference<>(view);
        }

        @Override
        public void onProgressUpdate(int progress){
            if (view.get() == null) return;
            view.get().progressUpdate(progress);
        }

        @Override
        public void onDownloadComplete(int countStars){
            if (view.get() == null) return;
           // view.get().readyToStart(countStars);
        }

        @Override
        public void sendMessage(String mes){
            if (view.get() == null) return;
            view.get().sendMessage(mes);
        }
    }



}
