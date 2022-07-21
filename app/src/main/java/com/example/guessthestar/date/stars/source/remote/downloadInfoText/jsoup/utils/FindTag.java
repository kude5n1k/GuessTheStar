package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

import android.util.Log;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                printlog("ParseURLAsyncTask", " \n srcset = " + text);
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
            //String srcset = findPattern(_srcset, ".jpg 1.5x, //(.+?).jpg");    // "img alt=\"(.*?).jpg\""   // <img alt="Humphrey Bogart 1940.jpg" src=

            String __srcset = _srcset.replace("//(.+)//", "");
            String srcset = __srcset.replace(" 2x", "");

            printlog("ParseURLAsyncTask",  altName + " \n srcset = " + srcset);
            arrAltNameLink.put(altName, srcset);
        }
        if (arrAltNameLink.size()<1) throw new IllegalArgumentException("link not found");
        return arrAltNameLink;
    }


    private String findPattern(String line, String patternStr){
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            return matcher.group(1);
        }
        return null;
    }



    private void printlog(String teg, String log){
        //Log.i("MyDEBUG","FindTag :: "+teg+" :: rezalt = \n" + log + "\n ---------------------------------");
    }

}
