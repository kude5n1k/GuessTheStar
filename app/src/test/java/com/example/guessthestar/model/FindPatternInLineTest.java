package com.example.guessthestar.model;

import static org.junit.Assert.*;

import com.example.guessthestar.utils.FindPatternInLine;

import org.junit.Test;

public class FindPatternInLineTest {

    String arrLine[] = {
            "<td><a href=\"/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:Humphrey_Bogart_1940.jpg\" class=\"image\"><noscript><img alt=\"Humphrey Bogart 1940.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/100px-Humphrey_Bogart_1940.jpg\" decoding=\"async\" width=\"100\" height=\"142\" data-file-width=\"527\" data-file-height=\"746\"></noscript><span class=\"lazy-image-placeholder\" style=\"width: 100px;height: 142px;\" data-src=\"//upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/100px-Humphrey_Bogart_1940.jpg\" data-alt=\"Humphrey Bogart 1940.jpg\" data-width=\"100\" data-height=\"142\"> </span></a>",
            "<td><a href=\"/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:Katharine_Hepburn_promo_pic.jpg\" class=\"image\"><noscript><img alt=\"Katharine Hepburn promo pic.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/100px-Katharine_Hepburn_promo_pic.jpg\" decoding=\"async\" width=\"100\" height=\"125\" data-file-width=\"2100\" data-file-height=\"2632\"></noscript><span class=\"lazy-image-placeholder\" style=\"width: 100px;height: 125px;\" data-src=\"//upload.wikimedia.org/wikipedia/commons/thumb/0/08/Katharine_Hepburn_promo_pic.jpg/100px-Katharine_Hepburn_promo_pic.jpg\" data-alt=\"Katharine Hepburn promo pic.jpg\" data-width=\"100\" data-height=\"125\"> </span></a>",
            "<td><a href=\"/wiki/%D0%A4%D0%B0%D0%B9%D0%BB:Grant,_Cary_(Suspicion)_01_Crisco_edit.jpg\" class=\"image\"><noscript><img alt=\"Grant, Cary (Suspicion) 01 Crisco edit.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg/100px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg\" decoding=\"async\" width=\"100\" height=\"129\" data-file-width=\"1699\" data-file-height=\"2200\"></noscript><span class=\"lazy-image-placeholder\" style=\"width: 100px;height: 129px;\" data-src=\"//upload.wikimedia.org/wikipedia/commons/thumb/2/27/Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg/100px-Grant%2C_Cary_%28Suspicion%29_01_Crisco_edit.jpg\" data-alt=\"Grant, Cary (Suspicion) 01 Crisco edit.jpg\" data-width=\"100\" data-height=\"129\"> </span></a>",
            "$%^%$^$%",
            "\n",
            null,
            "",
    };


    @Test
    public void findPatternInLineTest() {
        FindPatternInLine findPatternInLine = new FindPatternInLine();   /// !!!!!!!!!!!! макито !!!!!!!!!!!!!

        byte k=0;
        for (String line: arrLine){
            boolean rezalt = findPatternInLine.startFindPattern(line);
            if (rezalt)k++;
        }

        assertEquals("TEST :: FindPatternInLineTest :: ERROR :: k="+k, 3, k);
    }




}