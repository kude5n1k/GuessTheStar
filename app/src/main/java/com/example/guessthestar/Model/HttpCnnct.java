package com.example.guessthestar.Model;


import static com.example.guessthestar.Model.DataStarClass.getSizeArrayListStars;

import android.os.AsyncTask;
import android.util.Log;

import com.example.guessthestar.Presenter.StarClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpCnnct {


    public HttpCnnct(String URL) {
                                                                                 //Log.i("ОТЛАДКА","HttpCnnct :: start " );
        RequestTask requestTask = new RequestTask();
        requestTask.execute(URL);
                                                                                 //Log.i("ОТЛАДКА","HttpCnnct :: stop " );
    }


    private class RequestTask extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {
                                                                             //Log.i("ОТЛАДКА","HttpCnnct :: RequestTask :: start " );
            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();

                InputStream in = urlConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);

                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();

                while (line != null){
                    findPatternLine(line);
                    line = bufferedReader.readLine();
                }



            } catch (MalformedURLException e) {
                Log.i("ОТЛАДКА","RequestTask :: MalformedURLException =  " + e );
            } catch (IOException e) {
                Log.i("ОТЛАДКА","RequestTask :: IOException =  " + e );
            } catch (Exception e) {
                Log.i("ОТЛАДКА","RequestTask :: Exception =  " + e );
            } finally {
                if (urlConnection != null) urlConnection.disconnect();
            }


            if (getSizeArrayListStars() < 1) Log.i("ОТЛАДКА","RequestTask :: findPatternLine ::  звезд не найдено" );
            else  Log.i("ОТЛАДКА","HttpCnnct :: RequestTask :: stop :: звезды определены " );

            return null;
        }
    }


    // поиск целой строки
    private void findPatternLine(String line){
        Pattern pattern = Pattern.compile("<td><a href(.*?)</span></a>");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            String name = findPatternName(matcher.group(1));
            String ava = findPatternAva(matcher.group(1));
            if(name!=null && ava!=null){
               // Log.i("ОТЛАДКА","RequestTask :: findPatternLine ::  еть новая звезда " + name );

                DataStarClass.setStar(new StarClass(ava, name));

            }
        }
    }

    // поиск имени в строке
    private  String findPatternName(String line){
        String resalt = null;
        Pattern pattern = Pattern.compile("img alt=\"(.*?).jpg\"");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            //Log.i("ОТЛАДКА","pattern Name = " + matcher.group(1) );
            resalt = matcher.group(1);
        }
        return resalt;
    }
    // поиск аватарки в строке
    private  String findPatternAva(String line){
        String resalt = null;
        Pattern pattern = Pattern.compile("src=\"//(.*?)\" decoding");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            //Log.i("ОТЛАДКА","pattern Ava = " + matcher.group(1) );
            resalt = matcher.group(1);
        }
        return resalt;
    }

}
