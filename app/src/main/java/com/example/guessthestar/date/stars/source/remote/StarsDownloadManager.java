package com.example.guessthestar.date.stars.source.remote;

import com.example.guessthestar.date.stars.source.StarsRepositoryManager;

import org.jsoup.nodes.Document;

public class StarsDownloadManager {

    private static StarsDownloadManager sInstance;
    private ParseURL parseURL;

    private StarsDownloadManager(){
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
        void downloadComplete(Document doc);
        void downloadError(String mess);
    }

    public void downloadedStars(final StarsRepositoryManager.DownloadStarCallback downloadStarCallback) {

        parseURL.startRequest(new StDlMngCallback(){
            @Override
            public void downloadComplete(Document doc) {
                downloadStarCallback.downloadComplete(doc);
            }
            @Override
            public void downloadError(String mess) {
                downloadStarCallback.downloadError(mess);
            }
        });





    }





}
