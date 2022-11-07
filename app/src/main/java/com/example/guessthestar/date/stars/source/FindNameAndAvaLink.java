package com.example.guessthestar.date.stars.source;


import com.example.guessthestar.date.stars.StarClass;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNameAndAvaLink {

    private Element tbodyElement =null;
    private Elements trElements =null;
    private final HashMap<Element, Element> arrTdNameLink = new HashMap<>();
    ArrayList<StarClass> arrStarClass = new ArrayList<>();

    public FindNameAndAvaLink(Document doc) {
        try {
            tbodyElement = doc.getElementsByTag("tbody").last();
            trElements = tbodyElement.getElementsByTag("tr");  // делаем массив строк ж - м 25шт
            findTdElementsNameLink(); // делаем HashMap <name, link> 50 звезд
            findNameLink();
        } catch (Exception e) {
            System.out.println("FindNameLink :: ERROR :: ex = "+e.getMessage());
        }
    }

    // td name link
    private void findTdElementsNameLink(){
        try {
            for (Element tr : trElements){
                Elements tdElements = tr.getElementsByTag("td");  // 7 td в каждом tr
                if (tdElements.size() == 7){
                    // берем Ж 2,3 ::  М 5,6  ---- сдвиг на -1 тк get() берет от 0
                    arrTdNameLink.put(tdElements.get(1), tdElements.get(2));
                    arrTdNameLink.put(tdElements.get(4), tdElements.get(5));
                }
            }
        } catch (Exception e) {
            System.out.println("FindNameLink.findTdElementsNameLink :: ERROR :: ex = "+e.getMessage());
        }
    }


    //  name link
    private void findNameLink(){
        try {
            for(Map.Entry<Element, Element> entry : arrTdNameLink.entrySet()) {
                Element tdName = entry.getKey();
                String textName = tdName.text();

                Element tdLink = entry.getValue();
                tdLink = tdLink.select("img[srcset$= 2x]").first(); // img with src ending 2x
                String textLink = tdLink.attr("srcset");
                textLink = textLink.replaceAll (".+//", "");
                textLink = textLink.replace(" 2x", "");

                if(textName.length()>1 && textLink.length()>1) arrStarClass.add(new StarClass(textName, textLink));
            }
        } catch (Exception e) {
            System.out.println("FindNameLink.findNameLink :: ERROR :: ex = "+e.getMessage());
        }
    }




    public Element getTbodyElement(){
        return tbodyElement;
    }

    public Elements getTrElements() {
        return trElements;
    }

    public HashMap<Element, Element> getArrNameLink(){
        return arrTdNameLink;
    }

    public ArrayList<StarClass> getArrStarClass(){
        return arrStarClass;
    }













}
