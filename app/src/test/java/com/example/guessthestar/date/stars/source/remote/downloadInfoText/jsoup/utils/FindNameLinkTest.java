package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

import static com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils.DocForFindNameLinkTest.htmlDom;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.example.guessthestar.date.stars.StarClass;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNameLinkTest {

    Document doc;
    FindNameLink findNameLink;


    @Before
    public void setUp() throws Exception {
        //doc = Jsoup.connect("https://en.wikipedia.org/wiki/AFI%27s_100_Years...100_Stars").get();
        doc = Jsoup.parse(htmlDom);
        findNameLink = new FindNameLink(doc);
    }


    @Test
    public void findTegTbody_NotNull() {
        Element tbodyElements = findNameLink.getTbodyElement();

        String mess = "unitTest :: FindNameLinkTest.findTegTbody :: ERROR :: error in found Teg <tbody> ";
        assertNotNull(mess,tbodyElements);
    }

    @Test
    public void findStringFemaleMale_25(){
        Elements scriptElements = findNameLink.getTrElements();

        int expected = 7;  // в тестовом dom 5 + 2 мусор  (1 строка - 2 звезды)
        int actual = scriptElements.size();

        String mess = "unitTest :: FindNameLinkTest.findStringFemaleMale_25 :: ERROR :: error in found Teg <tr>  :: ";
        assertEquals(mess+" строк = "+actual, expected, actual);
    }

    @Test
    public void getArrNameLink_10Stars(){
        HashMap<Element, Element> arrNameLink = findNameLink.getArrNameLink();

        int expected = 10;  // в тестовом dom 5 tr строк это 10 звезд
        int actual = arrNameLink.size();

        String mess = "unitTest :: FindNameLinkTest.getArrNameLink :: ERROR :: error in found Teg <td>  :: ";
        assertEquals(mess+" строк = "+actual, expected, actual);
    }


    @Test
    public void findNameLink(){
        ArrayList<StarClass> arrStarClass = findNameLink.getArrStarClass();

        int expected = 10;  // в тестовом dom  10 звезд
        int actual = arrStarClass.size();

        String mess = "unitTest :: FindNameLinkTest.findNameLink :: ERROR :: error in found name or link :: ";
        assertEquals(mess+" строк = "+actual, expected, actual);
    }






}