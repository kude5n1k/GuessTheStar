package com.example.guessthestar.ui.preview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.example.guessthestar.date.stars.source.StarsRepositoryManager;
import com.example.guessthestar.ui.base.BasePresenter;
import com.example.guessthestar.ui.body_test.BodyTestActivity;


public class PreviewPresenter extends BasePresenter<PreviewView>  {

    private final StarsRepositoryManager starsRepositoryManager;
    LiveData<Integer> countStarsLiveData;
    Observer<Integer> countStarsObserver;

    PreviewPresenter(PreviewView previewView, StarsRepositoryManager starsRepositoryManager) {
        super(previewView);
        this.starsRepositoryManager = starsRepositoryManager;


        countStarsLiveData = starsRepositoryManager.getCountStarsLD();
        countStarsObserver = new Observer<Integer>(){
            @Override
            public void onChanged(@Nullable Integer count) {
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
        view.showCountStars(countStars);
    }



    /**Callback*/
    public interface PreviewPresenterCallback {
        void downloadError(String mess);
    }
    public void downloadedStars() {
        starsRepositoryManager.getStarsFromRemoteDataSource(new PreviewPresenterCallback(){
            @Override
            public void downloadError(String mess) {
                view.sendMessage(mess);
            }
        });
    }



    public void clearingStars(){
        starsRepositoryManager.deleteStars();
    }








    public void startBodyTestActivity(Context cnt) {
        Intent intent = new Intent(cnt, BodyTestActivity.class);
        cnt.startActivity(intent);
    }










}
