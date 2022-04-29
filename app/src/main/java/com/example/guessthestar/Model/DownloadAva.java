package com.example.guessthestar.Model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class DownloadAva {

    Bitmap bitmap;


    public Bitmap downlodeAva(String urlStr){
                                                                            //Log.i("MyDEBUG","DownloadAva :: downlodeAva :: start " );
        RequestTaskAva task = new RequestTaskAva();
        try {
            bitmap = task.execute(urlStr).get();
        } catch (ExecutionException e) {
            //e.printStackTrace();
            Log.i("MyDEBUG","DownloadAva.downlodeAva :: ExecutionException :: ERROR =  " + e );
            bitmap = null;
        } catch (InterruptedException e) {
            //e.printStackTrace();
            Log.i("MyDEBUG","DownloadAva.downlodeAva :: InterruptedException :: ERROR =  " + e );
            bitmap = null;
        }
                                                                            // Log.i("MyDEBUG","DownloadAva :: downlodeAva :: stop " );
        return bitmap;
    }






    private class RequestTaskAva extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... strings) {
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
            return bitmap;
        }
    }






}
