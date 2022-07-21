package com.example.guessthestar.date.stars.source;


public interface StarsDataSource {

    interface LoadStarsCallback {
        void onProgressUpdate(int progress);
        void onDownloadComplete(int countStars);
        void sendMessage(String mes);
    }




}
