package com.example.guessthestar.date.stars.source.remote.starsDownloadAvaImg.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import com.example.guessthestar.ui.body_test.presenter.BodyTestActivityPresenterImpl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadAva implements DownloadAvaImpl {
    private BodyTestActivityPresenterImpl bodyTestPresenterImpl;
    private Bitmap bitmap;

    public DownloadAva(BodyTestActivityPresenterImpl bodyTestPresenterImpl) {
        this.bodyTestPresenterImpl = bodyTestPresenterImpl;
    }


    public void startDownloadAva(String urlStr){
                                                                            //Log.i("MyDEBUG","DownloadAva :: downlodeAva :: start " );
        RequestTaskAva requestTaskAva = new RequestTaskAva();
        requestTaskAva.execute(urlStr);
    }

    public void returnAva(){
        if(bitmap!=null) bodyTestPresenterImpl.setAva(bitmap);
    }






    private class RequestTaskAva extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {
                                                                            //Log.i("MyDEBUG","DownloadAva :: RequestTaskAva :: cкачиваем аву в потоке " );
            InputStream input = null;
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();

                input = urlConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(input);

            } catch (MalformedURLException e) {
                Log.i("MyDEBUG","DownloadAva :: RequestTask :: ERROR :: Invalid URL ");
            } catch (IOException e) {
                Log.i("MyDEBUG","DownloadAva :: RequestTask :: ERROR ::  No internet connection " );
            } catch (Exception e) {
                Log.i("MyDEBUG","DownloadAva :: RequestTask :: Exception =  " + e );
            } finally {
                try { if (input != null) input.close(); } catch (Exception ignored) {}
                if (urlConnection != null) urlConnection.disconnect();
            }


            if (bitmap == null) Log.i("MyDEBUG","DownloadAva :: RequestTaskAva ::  ава не загружена" );
            //else                Log.i("MyDEBUG","DownloadAva :: RequestTaskAva :: ава в потоке скачена " );
            return null;
        }


        @Override
        protected void onPostExecute(Void v) {
            super.onPostExecute(v);
            returnAva();
        }
    }






}
