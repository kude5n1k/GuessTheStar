package com.example.guessthestar.date.stars.source;


import androidx.lifecycle.LiveData;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.local.StarsDbDataSource;
import com.example.guessthestar.date.stars.source.remote.StarsDownloadManager;
import com.example.guessthestar.ui.preview.PreviewPresenter;

import org.jsoup.nodes.Document;

import java.util.ArrayList;

public class StarsRepository {

    private static StarsRepository sInstance;
    private StarsDbDataSource starsDbDataSource;
    private StarsDownloadManager starsDownloadManager;


    private StarsRepository(StarsDownloadManager starsDownloadManager,
                            StarsDbDataSource starsDbDataSource){
        this.starsDownloadManager = starsDownloadManager;
        this.starsDbDataSource = starsDbDataSource;
    }

    public static StarsRepository getsInstance(StarsDownloadManager starsDownloadManager,
                                               StarsDbDataSource starsDbDataSource){
        if (sInstance==null){
            sInstance = new StarsRepository(starsDownloadManager, starsDbDataSource);
        }
        return sInstance;
    }



    // local :: DB //////////////////////////

    public void setAllStar(ArrayList<StarClass> arrStarClass) {
        starsDbDataSource.setAllStar(arrStarClass);
    }

    public LiveData<Integer> getCountStarsLD() {
        return starsDbDataSource.getCountStarsLD();
    }

    public int getCountStars() {
        return starsDbDataSource.getCountStars();
    }

    public String getAddressAva(int line) {
        return starsDbDataSource.getAddressAva(line);
    }

    public ArrayList<String> getNameStarsVariants(int[] arrStarsLines) {
        return starsDbDataSource.getNameStarsVariants(arrStarsLines);
    }

    public void deleteStars(){
        starsDbDataSource.clearAllStars();
    }







    // remote :: download ////////////////////////////

    /**Callback*/
    public interface DownloadStarCallback {
        void downloadComplete(Document doc);
        void downloadError(String mess);
    }
    public void getStarsFromRemoteDataSource(final PreviewPresenter.PreviewPresenterCallback previewPresenterCallback){
        starsDownloadManager.downloadedStars(new DownloadStarCallback(){
            @Override
            public void downloadComplete(Document doc){
                foundNameAndLink(doc);
            }
            @Override
            public void downloadError(String mess){
                previewPresenterCallback.downloadError(mess);
            }
        });

    }


    // parse DOM, and found Stars name and link avatar
    public void foundNameAndLink(Document doc){
        // поиск строк для объекта StarClass
        FindNameAndAvaLink findNameAndAvaLink = new FindNameAndAvaLink(doc);
        ArrayList<StarClass> arrStarClass = findNameAndAvaLink.getArrStarClass();
        if (arrStarClass != null){
            deleteStars();  // clearing DB
            setAllStar(arrStarClass);   // save in DB
        }
    }







}
