package com.example.guessthestar.date.stars.source.remote;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.ParseURL;

import java.util.ArrayList;

public class StarsDownloadManager {

    private static StarsDownloadManager sInstance;
   // private StarsLocalRepository starsLocalRepository;
    private ParseURL parseURL;

    private StarsDownloadManager(){
       // this.starsLocalRepository = StarsCacheDataSource.getsInstance();
        this.parseURL = ParseURL.getsInstance();
    }

    public static StarsDownloadManager getsInstance(){
        if (sInstance == null){
            sInstance = new StarsDownloadManager();
        }
        return sInstance;
    }

    /**Callback*/
    public interface StDlMngCallback {
        void downloadComplete(ArrayList<StarClass> arrStarClass);
        void downloadError(String mess);
    }




    public void downloadedStars(final StarsRepository.DownloadStarCallback downloadStarCallback) {
       // StarsDownloadInfoRequest.getsInstance().request();

        //StarsServiceRequest.getsInstance().requestImages();
        //StarsServiceRequest.getsInstance().requestText();
        //StarsServiceRequest.getsInstance().requestXml();

        //StarsServiceRequestOk.getsInstance().requestTextOkhttp3();
        //StarsServiceRequestOk.getsInstance().requestTextOkhttp3_2();


        parseURL.startRequest(new StDlMngCallback(){
            @Override
            public void downloadComplete(ArrayList<StarClass> arrStarClass) {
                downloadStarCallback.downloadComplete(arrStarClass);
            }
            @Override
            public void downloadError(String mess) {
                downloadStarCallback.downloadError(mess);
            }
        });





    }




    public void setStars(StarClass starClass){
       // starsLocalRepository.setStar(starClass);
    }


}
