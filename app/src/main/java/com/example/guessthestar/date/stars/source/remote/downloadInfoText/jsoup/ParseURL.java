package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup;

import android.os.AsyncTask;
import android.util.Log;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.date.stars.source.remote.StarsDownloadManager;
import com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils.FindNameLink;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;


public class ParseURL {
    private String url = "https://en.wikipedia.org/wiki/AFI%27s_100_Years...100_Stars";


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
       new ParseURLAsyncTask().execute(url);
    }



    private class ParseURLAsyncTask extends AsyncTask<String, Void, Void> {
        private ArrayList<StarClass> arrStarClass = new ArrayList();

        @Override
        protected Void doInBackground(String... strings) {

            try {
/*
                jsoup-библиотека предназначена для разбора HTML-страниц (парсинг),
                позволяя извлечь необходимые данные, используя DOM, CSS и методы в стиле jQuery.
                Библиотека поддерживает спецификации HTML5 и позволяет парсить страницы,
                как это делают современные браузеры.
*/
                Document doc = Jsoup.connect(strings[0]).get();

                // поиск строк для объекта StarClass
                FindNameLink findNameLink = new FindNameLink(doc);
                arrStarClass = findNameLink.getArrStarClass();


            } catch (Throwable t) {
                Log.i("MyDEBUG","ParseURLAsyncTask :: ERROR :: t = "+t.getMessage());
                stDlMngCallback.downloadError("ParseURLAsyncTask :: ERROR :: t = "+t.getMessage());
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            if (arrStarClass != null) {
                stDlMngCallback.downloadComplete(arrStarClass);
            }else {
                stDlMngCallback.downloadError("ParseURLAsyncTask :: ERROR :: no stars found");
            }
        }
    }















}