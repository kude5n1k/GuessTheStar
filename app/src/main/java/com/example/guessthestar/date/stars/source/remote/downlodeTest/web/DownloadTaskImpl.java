package com.example.guessthestar.date.stars.source.remote.downlodeTest.web;

import static com.example.guessthestar.model.date.db.DataStarClass.URL_STAR;
import static com.example.guessthestar.model.date.db.DataStarClass.getSizeArrayListStars;

import android.os.AsyncTask;
import android.util.Log;

import com.example.guessthestar.utils.FindPatternInLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadTaskImpl implements DownloadTask {
   // private final PreviewPresenter_OLD previewPresenterOLD;
    private int progress = 0;
/*

    public DownloadTaskImpl(PreviewPresenter_OLD previewPresenterOLD) {
        this.previewPresenterOLD = previewPresenterOLD;

    }
*/

    //  PreviewPresenter.class  ===>  MainRepositoryDownload.class
    @Override
    public void startDownload(){
        MainRepositoryDownload mainRepositoryDownload = new MainRepositoryDownload();  // Class for download strings from wikipedia
        mainRepositoryDownload.execute(URL_STAR);
    }

    //  PreviewPresenter.class  <=== FindPatternInLine.class
    @Override
    public void progressUpdate(){
        progress++;
        //if(previewPresenterOLD !=null) previewPresenterOLD.progressUpdate(progress);
    }

    //  PreviewPresenter.class  <=== MainRepositoryDownload.class
    @Override
    public void downloaded() {
        int countStars = getSizeArrayListStars();
        if(countStars >= 1){
            //if(previewPresenterOLD != null)
           // previewPresenterOLD.downloadComplete(countStars);
        }else {
           // if(previewPresenterOLD != null)
           // previewPresenterOLD.downloadError();
        }


    }





    private class MainRepositoryDownload extends AsyncTask<String, Void, Void> {
        FindPatternInLine findPatternInLine = new FindPatternInLine();  // Class for find ava link and name in strings

        @Override
        protected Void doInBackground(String... params) {

            InputStream input = null;                                                       //Log.i("MyDEBUG","DownloadTask :: doInBackground :: start " );
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();

                input = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(input);

                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();

                // чтение из буфера строк по очередности DOM дерева  (по одной строке)
                while (line != null){
                    boolean rezlt = findPatternInLine.startFindPattern(line);
                    if (rezlt) progressUpdate();
                    line = bufferedReader.readLine();
                }


            } catch (MalformedURLException e) {
                Log.i("MyDEBUG","DownloadTask :: MalformedURLException :: ERROR :: Invalid URL ");
            } catch (IOException e) {
                Log.i("MyDEBUG","DownloadTask :: IOException :: ERROR ::  No internet connection " );
            } catch (Exception e) {
                Log.i("MyDEBUG","DownloadTask :: Exception =  " + e );
            } finally {
                try { if (input != null) input.close(); } catch (Exception ignored) {}
                if (urlConnection != null) urlConnection.disconnect();
            }


            if (getSizeArrayListStars() < 1) Log.i("MyDEBUG","DownloadTask :: doInBackground ::  звезд не найдено" );
            // else  Log.i("MyDEBUG","DownloadTask :: doInBackground :: stop :: звезды определены " );

            return null;
        }


        @Override
        protected void onPostExecute(Void v) {
            super.onPostExecute(v);
            //Log.i("MyDEBUG","DownloadTask :: onPostExecute :: start " );
            downloaded();
        }


    }



}
