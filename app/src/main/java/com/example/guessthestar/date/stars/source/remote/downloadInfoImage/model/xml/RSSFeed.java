package com.example.guessthestar.date.stars.source.remote.downloadInfoImage.model.xml;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="api", strict=false)
public class RSSFeed {

    @Element(name="parse")  //Element - представляет XML-элемент.
    private ParseFeed parse;

    public ParseFeed getParse() {
        return parse;
    }

    public void setParse(ParseFeed parse) {
        this.parse = parse;
    }

    @Element(name="title")  //Element - представляет XML-элемент.
    @Path("parse")      // Path можно указать путь к элементу XML внутри дерева XML
    private String channelTitle;

    @ElementList(name="text", inline=true)  // поле используется для хранения коллекции
    @Path("parse")
    private List<Article> articleList;



    public String getChannelTitle() {
        return channelTitle;
    }
    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public List<Article> getArticleList() {
        return articleList;
    }
    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}