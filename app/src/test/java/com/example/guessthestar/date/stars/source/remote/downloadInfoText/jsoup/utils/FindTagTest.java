package com.example.guessthestar.date.stars.source.remote.downloadInfoText.jsoup.utils;

import static org.junit.Assert.*;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindTagTest {

    Document doc;
    String html = "<div class= tion-6\"><a href=\"#External_links\"><span class=\"tocnumber\">4</span> <span class=\"toctext\">External" +
            " links</span></a></li>\n</ul>\n</div>\n\n<h2><span class=\"mw-headline\" id=\"List_of_50_greatest_screen_legends:_Top_" +
            "25_Male_and_Top_25_Female_stars\">List of 50 greatest screen legends: Top 25 Male and Top 25 Female stars</span><span " +
            "class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=AFI%27s_100_Years...1" +
            "00_Stars&amp;action=edit&amp;section=1\" title=\"Edit section: List of 50 greatest screen legends: Top 25 Male and Top 25 Fem" +
            "ale stars\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n<table class=\"wikitable sortable\" sty" +
            "le=\"font-size:1.00em; line-height:1.5em;\">\n<tbody><tr>\n<th style=\"width: 2%;\">No.\n</th>\n<th colspan=\"3\">Male leg" +
            "ends\n</th>\n<th colspan=\"3\">Female legends\n</th></tr>\n<tr>\n<td>1\n</td>\n<td style=\"width: 5%;\"><a href=\"/wiki/Hump" +
            "hrey_Bogart\" title=\"Humphrey Bogart\">Humphrey Bogart</a> <small>(1899–1957)</small>\n</td>\n<td style=\"width: 5%;\"><a " +
            "href=\"/wiki/File:Humphrey_Bogart_1940.jpg\" class=\"image\"><img alt=\"Humphrey Bogart 1940.jpg\" src=\"//upload.wikime" +
            "dia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/100px-Humphrey_Bogart_1940.jpg\" decoding=\"async\" wi" +
            "dth=\"100\" height=\"142\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/150px-Humph" +
            "rey_Bogart_1940.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/200px-Humphrey_Bogar" +
            "t_1940.jpg 2x\" data-file-width=\"527\" data-file-height=\"746\" /></a>\n</td>\n<td style=\"width: 39%;\">Known for:\n<p><i><a " +
            "href=\"/wiki/The_Petrified_Forest\" title=\"The Petrified Forest\">The Petrified Forest</a></i> (1936)\n</p><p><i><a href=\"/wi" +
            "ki/The_Maltese_Falcon_(1941_film)\" title=\"The Maltese Falcon (1941 film)\">The Maltese Falcon</a></i> (1941)\n</p><p><i><a hre" +
            "f=\"/wiki/Casablanca_(film)\" title=\"Casablanca (film)\">Casablanca</a></i> (1942)\n</p><p><i><a href=\"/wiki/To_Have_and_Have" +
            "_Not_(film)\" title=\"To Have and Have Not (film)\">To Have and Have Not</a></i> (1944)\n</p><p><i><a href=\"/wiki/The_Big_Slee" +
            "p_(1946_film)\" title=\"The Big Sleep (1946 film)\">The Big Sleep</a></i> (1946)\n</p><p><i><a href=\"/wiki/Dark_Passage_(f" +
            "ilm)\" title=\"Dark Passage (film)\">Dark Passage</a></i> (1947)\n</p><p><i><a href=\"/wiki/The_Treasure_of_the_Sierra_Madre" +
            "_(film)\" title=\"The Treasure of the Sierra Madre (film)\">The Treasure of the Sierra Madre</a></i> (1948)\n</p><p><i><a hr" +
            "ef=\"/wiki/Key_Largo_(film)\" title=\"Key Largo (film)\">Key Largo</a></i> (1948)\n</p><p><i><a href=\"/wiki/In_a_Lonely_Pla" +
            "ce\" title=\"In a Lonely Place\">In a Lonely Place</a></i> (1950)\n</p><p><i><a href=\"/wiki/The_African_Queen_(film)\" titl" +
            "e=\"The African Queen (film)\">The African Queen</a></i> (1951)\n</p><p><i><a href=\"/wiki/The_Caine_Mutiny_(film)\" tit" +
            "le=\"The Caine Mutiny (film)\">The Caine Mutiny</a></i> (1954)\n</p><p>Nominated for three <a href=\"/wiki/Academy_Awards\" ti" +
            "tle=\"Academy Awards\">Academy Awards</a>, won for <i>The African Queen</i>.\n</p>\n</td>\n<td style=\"width: 5%;\"><a href=\"/w" +
            "iki/Katharine_Hepburn\" title=\"Katharine Hepburn\">Katharine Hepburn</a>\n<p><small>(1907–2003)</small>\n</p>\n</td>\n<td styl" +
            "e=\"width: 5%;\"><a href=\"/wiki/File:Katharine_Hepburn_promo_pic.jpg\" class=\"image\"><img alt=\"Katharine Hepburn promo " +
            "pic.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/100px-Katharine_Hepburn_pro" +
            "mo_pic.jpg\" decoding=\"async\" width=\"100\" height=\"125\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Kat" +
            "harine_Hepburn_promo_pic.jpg/150px-Katharine_Hepburn_promo_pic.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/0/08/" +
            "Katharine_Hepburn_promo_pic.jpg/199px-Katharine_Hepburn_promo_pic.jpg 2x\" data-file-width=\"2100\" data-file-height=\"2632\" />" +
            "</a>\n</td>\n<td style=\"width: 39%;\">Known for:\n<p><i><a href=\"/wiki/Little_Women_(1933_film)\" title=\"Little Women (1933 " +
            "film)\">Little Women</a></i> (1933)\n</p><p><i><a href=\"/wiki/Alice_Adams_(1935_film)\" title=\"Alice Adams (1935 film)\">Alice " +
            "Adams</a></i> (1935)\n</p><p><i><a href=\"/wiki/Stage_Door\" title=\"Stage Door\">Stage Door</a></i> (1937)\n</p><p><i><a " +
            "href=\"/wiki/Bringing_Up_Baby\" title=\"Bringing Up Baby\">Bringing Up Baby</a></i> (1938)\n</p><p><i><a href=\"/wiki/The_Phil" +
            "adelphia_Story_(film)\" title=\"The Philadelphia Story (film)\">The Philadelphia Story</a></i> (1940)\n</p><p><i><a href=\"/wi" +
            "ki/Woman_of_the_Year\" title=\"Woman of the Year\">Woman of the Year</a></i> (1942)\n</p><p><i><a href=\"/wiki/The_African_Q" +
            "ueen_(film)\" title=\"The African Queen (film)\">The African Queen</a></i> (1951)\n</p><p><i><a href=\"/wiki/Long_Day%27s_Jo" +
            "urney_Into_Night_(1962_film)\" class=\"mw-redirect\" title=\"Long Day&#39;s Journey Into Night (1962 film)\">Long Day's Journey" +
            " Into Night</a></i> (1962)\n</p><p><i><a href=\"/wiki/Guess_Who%27s_Coming_to_Dinner\" title=\"Guess Who&#39;s Coming to " +
            "Dinner\">Guess Who's Coming to Dinner</a></i> (1967)\n</p><p><i><a href=\"/wiki/The_Lion_in_Winter_(1968_film)\" title=\"The" +
            " Lion in Winter (1968 film)\">The Lion in Winter</a></i> (1968)\n</p><p>Nominated for 12 Academy Awards, won for <i><a " +
            "href=\"/wiki/Morning_Glory_(1933_film)\" title=\"Morning Glory (1933 film)\">Morning Glory</a></i> (1933), <i><a href=\"/wiki" +
            "/Guess_Who%27s_Coming_to_Dinner\" title=\"Guess Who&#39;s Coming to Dinner\">Guess Who's Coming to Dinner</a></i> (1967), <a " +
            "href=\"/wiki/The_Lion_in_Winter_(1968_film)\" title=\"The Lion in Winter (1968 film)\"><i>The Lion in Winter</i></a> (1968)," +
            " and <i><a href=\"/wiki/On_Golden_Pond_(1981_film)\" title=\"On Golden Pond (1981 film)\">On Golden Pond</a></i> (1981).\n<" +
            "/p>\n</td></tr>\n<tr>\n<td>2\n</td>\n<td><a href=\"/wiki/Cary_Grant\" title=\"Cary Grant\">Cary Grant</a>\n<p><small>(1904–19" +
            "86)</small>\n</p>\n</td>\n<td><a href=\"/wiki/File:Grant,_Cary_(Suspicion)_01_Crisco_edit.jpg\" class=\"image\"><img alt=\"Grant" +
            ", Cary (Suspicion) 01 Crisco edit.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspic" +
            "ion%29_01_Crisco_edit.jpg/100px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg\" decoding=\"async\" width=\"100\"" +
            " height=\"129\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jp" +
            "g/150px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_C" +
            "ary_%28Suspicion%29_01_Crisco_edit.jpg/199px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg 2x\" data-file-width=\"1699\" " +
            "data-file-height=\"2200\" /></a>\n</td>\n<td>Known for:\n<p><i><a href=\"/wiki/The_Awful_Truth\" title=\"The Awful Truth\">The " +
            "Awful Truth</a></i> (1937)\n</p><p><i><a href=\"/wiki/Bringing_Up_Baby\" title=\"Bringing Up Baby\">Bringing Up Baby</a></i> " +
            "(1938)\n</p><p><i><a href=\"/wiki/Only_Angels_Have_Wings\" title=\"Only Angels Have Wings\">Only Angels Have Wings</a></i> " +
            "(1939)\n</p><p><i><a href=\"/wiki/His_Girl_Friday\" title=\"His Girl Friday\">His Girl Friday</a></i> (1940)\n</p><p><i><a " +
            "href=\"/wiki/The_Philadelphia_Story_(film)\" title=\"The Philadelphia Story (film)\">The Philadelphia Story</a></i> (1940)\n</p>" +
            "<p><i><a href=\"/wiki/Notorious_(1946_film)\" title=\"Notorious (1946 film)\">Notorious</a></i> (1946)\n</p><p><i><a href=\"/wi" +
            "ki/An_Affair_to_Remember\" title=\"An Affair to Remember\">An Affair to Remember</a></i> (1957)\n</p><p><i><a href=\"/wiki/Nort" +
            "h_by_Northwest\" title=\"North by Northwest\">North by Northwest</a></i> (1959)\n</p><p>Nominated for two Academy Awards, " +
            "earned <a href=\"/wiki/Academy_Honorary_Award\" title=\"Academy Honorary Award\">Academy Honorary Award</a> in 1970\n</p>\n</" +
            "td>\n<td><a href=\"/wiki/Bette_Davis\" title=\"Bette Davis\">Bette Davis</a>\n<p><small>(1908–1989)</small>\n</p>\n</td>\n<td>" +
            "<a href=\"/wiki/File:BETTEDavis_(cropped).jpg\" class=\"image\"><img alt=\"BETTEDavis (cropped).jpg\" src=\"//upload.wikimedia." +
            "org/wikipedia/commons/thumb/f/f1/BETTEDavis_%28cropped%29.jpg/100px-BETTEDavis_%28cropped%29.jpg\" decoding=\"async\" " +
            "width=\"100\" height=\"120\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/f1/BETTEDavis_%28cropped%29.jpg/150px-B" +
            "ETTEDavis_%28cropped%29.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/f1/BETTEDavis_%28cropped%29.jpg/200px-BET" +
            "TEDavis_%28cropped%29.jpg 2x\" data-file-width=\"435\" data-file-height=\"521\" /></a>\n</td>\n<td>Known for:\n<p><i><a h" +
            "ref=\"/wiki/Of_Human_Bondage_(1934_film)\" title=\"Of Human Bondage (1934 film)\">Of Human Bondage</a></i> (1934)\n</p><p><i><a" +
            " href=\"/wiki/The_Petrified_Forest\" title=\"The Petrified Forest\">The Petrified Forest</a></i> (1936)\n</p><p><i><a href=\"/wi" +
            "ki/Jezebel_(1938_film)\" title=\"Jezebel (1938 film)\">Jezebel</a></i> (1938)\n</p><p><i><a href=\"/wiki/Dark_Victory\" " +
            "title=\"Dark Victory\">Dark Victory</a></i> (1939)\n</p><p><i><a href=\"/wiki/The_Letter_(1940_film)\" title=\"The Letter " +
            "(1940 film)\">The Letter</a></i> (1940)\n</p><p><i><a href=\"/wiki/The_Little_Foxes_(film)\" title=\"The Little Foxes " +
            "(film)\">The Little Foxes</a></i> (1941)\n</p><p><i><a href=\"/wiki/All_About_Eve\" title=\"All About Eve\">All About Eve</a>" +
            "</i> (1950)\n</p><p><i><a href=\"/wiki/What_Ever_Happened_to_Baby_Jane%3F_(film)\" title=\"What Ever Happened to Baby Jane? " +
            "(film)\">What Ever Happened to Baby Jane?</a></i> (1962)\n</p><p>Nominated for 11 Academy Awards, won for <i><a href=\"/wiki/" +
            "Dangerous_(1935_film)\" title=\"Dangerous (1935 film)\">Dangerous</a></i>, and <i>Jezebel</i>.\n</p>\n</td></tr>\n<tr>\n<td>" +
            "3\n</td>\n<td><a href=\"/wiki/James_Stewart\" title=\"James Stewart\">James Stewart</a>\n<p><small>(1908–1997)</small>\n</p>\n</" +
            "td>\n<td><a href=\"/wiki/File:Annex_-_Stewart,_James_(Call_Northside_777)_01.jpg\" class=\"image\"><img alt=\"Annex - Stewart, " +
            "James (Call Northside 777) 01.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Annex_-_Stewart%2C_James_%28Cal" +
            "l_Northside_777%29_01.jpg/100px-Annex_-_Stewart%2C_James_%28Call_Northside_777%29_01.jpg\" decoding=\"async\" width=\"100\"" +
            " height=\"126\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Annex_-_Stewart%2C_James_%28Call_Northside_7" +
            "77%29_01.jpg/149px-Annex_-_Stewart%2C_James nal links\">edit</a><span v>";


    @Before
    public void setUp() throws Exception {
        doc = Jsoup.parse(html);
    }



    @Test
    public void findName(){
        FindTag findTag = new FindTag();

        ArrayList<String> arrayListFindTag = findTag.findName(doc);

        int k=0;
        for (String name: arrayListFindTag){

            if(name.length()<5 || name.length()>50) break;
            k++;

            System.out.println("\nTEST :: FindTagTest :: k = " + k + " :: name="+name);
        }

        String mess = "unitTest :: FindTag.findName :: ERROR :: name not found ::";
        assertEquals(mess+" k="+k, 5, k);
    }



    @Test
    public void findAltNameAndLink() {
        FindTag findTag = new FindTag();

        HashMap<String, String> hashMapAltNameSrcset = findTag.findAltNameAndLink(doc);

        int k=0;
        for(Map.Entry<String, String> entry : hashMapAltNameSrcset.entrySet()) {
            String name = entry.getKey();
            String link = entry.getValue();

            if(name.length()<5 || link.length()<5 ) break;
            if(name.contains("//") || link.contains("//") ) break;

            k++;
            System.out.println("\nTEST :: FindTagTest :: k = " + k + " :: name="+name+" :: \nlink = " + link);
        }

        String mess = "unitTest :: FindTag.findAltNameAndLink :: ERROR :: name or address not found ::";
        assertEquals(mess+":: k="+k, 4, k);
    }









}