package com.example.guessthestar.date.stars.source.remote.downlodeTest.test;


// класс модели
// Model Class - json-ответ от сервера нужно реализовать как модель
// по структуре ответа сайта в виде JSON (или других форматов) создать Java-класс в виде POJO.
// POJO расшифровывается как Plain Old Java Class и переводится как "Просто Java класс"

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class POJOClass {
    @SerializedName("userId")
    @Expose
    private int userId;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("body")
    @Expose
    private String body;




    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
