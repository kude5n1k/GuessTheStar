package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;

public class FindTag {

    private ArrayList<String> arrValidName = new ArrayList();
    private HashMap<String, String> arrAltNameLink = new HashMap<>();



    // valid name
    public ArrayList<String> findName(Document doc){
        /*
          тег "span" у которого есть тег "a" с полем "href" который начинается с  "/wiki/"
          или тег "td" у котрого ...
         */
        Elements elementsA = doc.select("span > a[href^=/wiki/], td > a[href^=/wiki/]");
        for (Element elements : elementsA) {
            if(elements.attr("class").length()>1)continue;;

            String text = elements.text();
            String name = elements.attr("title");

            if (text.equals(name) && text.length()>1 ) {
                arrValidName.add(text);
            }
        }
        if (arrValidName.size()<1) throw new IllegalArgumentException("name not found");
        return arrValidName;
    }


    // altName + link
    public HashMap<String, String> findAltNameAndLink(Document doc){
        Elements elements2x = doc.select("img[srcset$=.jpg 2x]"); // img with src ending .png

        for (Element elementsArr2x : elements2x) {
            String altName = elementsArr2x.attr("alt");
            String _srcset = elementsArr2x.attr("srcset");

            String __srcset = _srcset.replaceAll (".+//", "");
            String srcset = __srcset.replace(" 2x", "");


            arrAltNameLink.put(altName, srcset);
        }
        if (arrAltNameLink.size()<1) throw new IllegalArgumentException("link not found");
        return arrAltNameLink;
    }





}
