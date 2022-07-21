package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.services;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.Images.Parse;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.Images.RootParse;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text.Parse1;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text.Parse2;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.text.TextClass;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.xml.Article;
import com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.xml.RSSFeed;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StarsServiceRequest {

    private static StarsServiceRequest sInstance;

    private StarsServiceRequest(){}

    public static StarsServiceRequest getsInstance(){
        if (sInstance == null){
            sInstance = new StarsServiceRequest();
        }
        return sInstance;
    }


    public void requestImages(){
        StarsServiceBuilder.getsInstance()
                .createStarsApi()
                .getImages()
                .enqueue(new Callback<RootParse>() {   // Call.execute() - для синхронного запроса   || Call.enqueue() - для асинхронного
                    @Override
                    public void onResponse(@NonNull Call<RootParse> call, @NonNull Response<RootParse> response) {
                        RootParse rootParse = response.body();
                        Parse parse = rootParse.getParse();


                        String rezalt = ""+
                                //""id: " + mStarsPOJOClass.getId() + "\n" +
                                //"UserId: " + mStarsPOJOClass.getUserId() + "\n" +
                                "Title: " + parse.getTitle() + "\n" +
                                //"Body: " + mStarsPOJOClass.getBody() + "\n"+
                                "--------------------------------------";

                        Log.i("MyDEBUG","StarsDownloadManagerImpl :: downloadedStars->onFailure :: rezalt = \n" + rezalt );

                    }

                    @Override
                    public void onFailure(@NonNull Call<RootParse> call, @NonNull Throwable t) {

                        Log.i("MyDEBUG","StarsDownloadManagerImpl :: downloadedStars->onFailure :: Error occurred while getting request!" );
                        t.printStackTrace();
                    }
                });

    }


    public void requestText(){
        StarsServiceBuilder.getsInstance()
                .createStarsApi()
                .getText()
                .enqueue(new Callback<Parse1>() {   // Call.execute() - для синхронного запроса   || Call.enqueue() - для асинхронного
                    @Override
                    public void onResponse(@NonNull Call<Parse1> call, @NonNull Response<Parse1> response) {

                        Parse1 parse1 = response.body();

                        Parse2 parse2 = parse1.getParse2();
                        printlog("parse2.getTitle",parse2.getTitle());


                        TextClass textClass = parse2.getTextClass();

                        printlog("textClass.getText()",textClass.getListTextFromList(0));
                       // printlog("textClass.getText()",textClass.getListTextFromList(1));

                    }

                    @Override
                    public void onFailure(@NonNull Call<Parse1> call, @NonNull Throwable t) {

                        Log.i("MyDEBUG","StarsServiceRequest :: requestText->onFailure :: Error occurred while getting request!" );
                        t.printStackTrace();
                    }
                });

    }



    public void requestXml(){
        StarsServiceBuilder.getsInstance()
                .createStarsApi()
                .loadRSSFeed()
                .enqueue(new Callback<RSSFeed>() {   // Call.execute() - для синхронного запроса   || Call.enqueue() - для асинхронного
                    @Override
                    public void onResponse(@NonNull Call<RSSFeed> call, @NonNull Response<RSSFeed> response) {

                        RSSFeed rss = response.body();
                        String channelTitle = rss.getChannelTitle();
                        printlog("xml",channelTitle);

/*
                        List<Article> rssFeeds = rss.getArticleList();

                        for (Article article: rssFeeds){
                            printlog(article.getTitle());
                        }
*/


                    }

                    @Override
                    public void onFailure(@NonNull Call<RSSFeed> call, @NonNull Throwable t) {
                        Log.i("MyDEBUG","StarsServiceRequest :: requestXml->onFailure :: Error occurred while getting request!" );
                        t.printStackTrace();
                    }
                });

    }


    private void printlog(String teg, String log){
        Log.i("MyDEBUG","StarsServiceRequest :: "+teg+" :: rezalt = \n" + log + "\n ---------------------------------");
    }




}
