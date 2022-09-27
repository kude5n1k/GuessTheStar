package com.example.guessthestar.ui.preview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.ui.base.BasePresenter;
import com.example.guessthestar.ui.body_test.BodyTestActivity;

import java.util.ArrayList;


public class PreviewPresenter extends BasePresenter<PreviewView>  implements PreviewPresenterCallback {

    private final StarsRepository starsRepository;
    LiveData<Integer> countStarsLiveData;
    Observer<Integer> countStarsObserver;

    PreviewPresenter(PreviewView previewView, StarsRepository starsRepository) {
        super(previewView);
        this.starsRepository = starsRepository;


        countStarsLiveData = starsRepository.getCountStarsLD();
        countStarsObserver = new Observer<Integer>(){
            @Override
            public void onChanged(@Nullable Integer count) {
                //view.sendMessage("!-Live date-! "+count);
                Log.i("MyDEBUG","PreviewPresenter :: LiveDate :: start : count="+count );
                resultCountStars(count);
            }
        };

    }

    public void startObserverLD(LifecycleOwner owner){
        countStarsLiveData.observe(owner, countStarsObserver);
    }
    public void stopObserverLD(){
        countStarsLiveData.removeObserver(countStarsObserver);
    }



    public void resultCountStars(int countStars) {
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



    /**Callback*/
    public interface PreviewPresenterCallback {
        void downloadError(String mess);
    }
    public void downloadedStars() {
        starsRepository.getStarsFromRemoteDataSource(new PreviewPresenterCallback(){
            @Override
            public void downloadError(String mess) {
                sendMessage(mess);
            }
        });
    }



    public void clearStars(){
        starsRepository.deleteStars();
    }

    @Override
    public void sendMessage(String mess){
        view.sendMessage(mess);
    };





    public void startBodyTestActivity(Context cnt) {
        Intent intent = new Intent(cnt, BodyTestActivity.class);
        cnt.startActivity(intent);
    }










}
