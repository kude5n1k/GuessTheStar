package com.example.guessthestar.Model;

import static com.example.guessthestar.Model.DataStarClass.getSizeArrayListStars;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.example.guessthestar.Presenter.StarClass;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DownloadTask extends AsyncTask<String, Void, Void> {

    public interface DownloadListener {
        void onProgressUpdate();
        void onDownloadComplete();
    }

    private final DownloadListener listener;


    public DownloadTask(DownloadListener listener) {
        this.listener = listener;
    }




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

            while (line != null){
                findPatternLine(line);
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
        if (listener != null) listener.onDownloadComplete();
    }


    // search for strings by pattern
    private void findPatternLine(String line){
        Pattern pattern = Pattern.compile("<td><a href(.*?)</span></a>");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){

            String name = findPattern(matcher.group(1), "img alt=\"(.*?).jpg\"");
            String ava = findPattern(matcher.group(1), "src=\"//(.*?)\" decoding");

            if(name!=null && ava!=null){
                Log.i("MyDEBUG","RequestTask :: findPatternLine ::  еть новая звезда " + name );
                DataStarClass.setStar(new StarClass(ava, name));
                if (listener != null) listener.onProgressUpdate();
                //try { Thread.sleep(500); } catch (Exception ignored) { }
            }
        }
    }

    private String findPattern(String line, String patternStr){
        String resalt = null;
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            resalt = matcher.group(1);
        }
        return resalt;
    }


}
