package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.services;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class StarsServiceRequestOk {
    private static StarsServiceRequestOk sInstance;

    private StarsServiceRequestOk(){}

    public static StarsServiceRequestOk getsInstance(){
        if (sInstance == null){
            sInstance = new StarsServiceRequestOk();
        }
        return sInstance;
    }

    String url = "https://en.wikipedia.org/w/api.php?action=parse&format=xml&page=AFI%27s_100_Years...100_Stars&prop=text";
    //String url = "https://en.wikipedia.org/wiki/AFI%27s_100_Years...100_Stars";


    public void requestTextOkhttp3(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();

                    Request request = new Request.Builder()
                            .get() // хотим прочитать страницу
                            .url(url)
                            .build();

                    // Объект Response - это данные, возвращаемые сервером.
                    okhttp3.Response response = client.newCall(request)
                            .execute(); // отправки запроса и получения данных, возвращаемых сервером

                    if (!response.isSuccessful()){
                        showResponse(response.toString());
                        return;
                    }

                    String responseData = response.body().string();

                    showResponse(response.code()+"");
                    showResponse(responseData);
                } catch (Exception e) {
                    //e.printStackTrace();
                    showResponse(""+e);
                } finally {

                }
            }
        }).start();
    }

    /**
     * Показать полученный текст
     * @param response
     */
    private void showResponse(String response){
        Log.i("MyDEBUG","StarsServiceRequestOk :: requestTextOkhttp3->showResponse :: rezalt = \n" + response + "\n -----------------------------------------");
    }



    public void requestTextOkhttp3_2(){
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .get()
                .url(url)
               // .addHeader("User-Agent","android")
               // .header("Content-Type","text/html; charset=utf-8")
                .build();

        Call call = client.newCall(request);

        // Call.enqueue() - для асинхронного
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                showResponse("!!!!!!!!!!!!!!!!!!!!!" + call.toString());
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (!response.isSuccessful()){
                    showResponse(response.toString());
                    return;
                }


                String responseStr = response.body().string();
                showResponse(response.code()+"");
                showResponse(responseStr);
            }

        });
    }




}
