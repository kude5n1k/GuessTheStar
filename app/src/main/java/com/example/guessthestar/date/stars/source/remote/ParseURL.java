package com.example.guessthestar.date.stars.source.remote;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class ParseURL {
    private String URL_WIKI = "https://en.wikipedia.org/wiki/AFI%27s_100_Years...100_Stars";


    private static ParseURL sInstance;
    private ParseURL(){}
    public static ParseURL getsInstance(){
        if (sInstance==null){
            sInstance = new ParseURL();
        }
        return sInstance;
    }

    private StarsDownloadManager.StDlMngCallback stDlMngCallback = null;


    public void startRequest(StarsDownloadManager.StDlMngCallback stDlMngCallback){
        this.stDlMngCallback = stDlMngCallback;
       new DownloadHTMLAsyncTask().execute(URL_WIKI);
    }



    private class DownloadHTMLAsyncTask extends AsyncTask<String, Void, Document> {  //params, progress, result

        @Override
        protected Document doInBackground(String... strings) {
            Document doc;
            try {
/*
                jsoup-библиотека предназначена для разбора HTML-страниц (парсинг),
                позволяя извлечь необходимые данные, используя DOM, CSS и методы в стиле jQuery.
                Библиотека поддерживает спецификации HTML5 и позволяет парсить страницы,
                как это делают современные браузеры.
*/
                doc = Jsoup.connect(strings[0]).get();

            } catch (Exception i ) {
                return null;
            }
            return doc;
        }


        @Override
        protected void onPostExecute(Document doc) {
            if (doc != null) {
                stDlMngCallback.downloadComplete(doc);
            }else {
                stDlMngCallback.downloadError("Network Error");
            }
        }
    }















}