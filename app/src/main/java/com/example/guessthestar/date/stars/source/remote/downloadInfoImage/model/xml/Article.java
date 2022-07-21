package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.xml;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

// Аннотация @ Root помечает класс как подлежащий (де)сериализации

@Root(name = "text", strict = false)
public class Article {

    @Element(name = "div")  //Element - представляет XML-элемент.
    private String title;

    @Element(name = "href")
    private String link;




    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
}
