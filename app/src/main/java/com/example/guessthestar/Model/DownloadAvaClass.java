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

public class DownloadAvaClass {

    Bitmap bitmap;


    public Bitmap downlodeAva(String urlStr){
                                                                            //Log.i("ОТЛАДКА","HttpCnnctAva :: downlodeAva :: start " );
        RequestTaskAva task = new RequestTaskAva();
        try {
            bitmap = task.execute(urlStr).get();
        } catch (ExecutionException e) {
            //e.printStackTrace();
            Log.i("ОТЛАДКА","HttpCnnctAva.downlodeAva :: ExecutionException :: ERROR =  " + e );
        } catch (InterruptedException e) {
            //e.printStackTrace();
            Log.i("ОТЛАДКА","HttpCnnctAva.downlodeAva :: InterruptedException :: ERROR =  " + e );
        }
                                                                            // Log.i("ОТЛАДКА","HttpCnnctAva :: downlodeAva :: stop " );
        return bitmap;
    }






    private class RequestTaskAva extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... strings) {
                                                                            //Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTaskAva :: cкачиваем аву в потоке " );
            URL url = null;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(in);


            } catch (MalformedURLException e) {
                Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTask :: ERROR :: линк криво составлен ");
            } catch (IOException e) {
                Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTask :: IOException =  " + e );
            } catch (Exception e) {
                Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTask :: Exception =  " + e );
            } finally {
                if (urlConnection != null) urlConnection.disconnect();
            }

            //try { Thread.sleep(5000); } catch (Exception ignored) { }

            if (bitmap == null) Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTaskAva ::  ава не загружена" );
            //else                Log.i("ОТЛАДКА","HttpCnnctAva :: RequestTaskAva :: ава в потоке скачена " );
            return bitmap;
        }
    }






}
