package com.example.guessthestar.model;

import static org.junit.Assert.assertEquals;

import com.example.guessthestar.date.stars.StarClass;

import org.junit.Test;


/** test privet method isStringValid through constructor StarClass*/
public class StarClassTest {

    @Test
    public void isStringValid() {
        String[] arrName = {"", " ", "   ", "----", "-", null, "!", "\n", "!%$#@",
                "ZZZ zzz", "rrRRr", "qqqq'qqqq", "aaaaa#%aaaaa", "ssssss.sSSSs", "wwwww wwwww",     // 6 valid name
                "\\\\", "#$%\ndf*56hg\\" };

        int k=0;
        for (int i=0; i<arrName.length; i++) {
            try {

                StarClass starClass = new StarClass("avatar", arrName[i]); // init class

                if (starClass.getName() != null ) k++;  // if class have -> +1

            } catch (Exception ex) {
                System.out.println("TEST :: testOnValidAvatarName :: ERROR :: ================================================");
                System.out.println("TEST :: testOnValidAvatarName :: ERROR :: i="+i+" :: name = " + arrName[i] + "      k="+k);
                System.out.println("TEST :: testOnValidAvatarName :: ERROR :: ex = " + ex);
                System.out.println("TEST :: testOnValidAvatarName :: ERROR :: ================================================\n");
            }
            //System.out.println("TEST :: testOnValidAvatarName :: i="+i+" :: name = " + arrName[i] + " --->  starClass = " + _starClass.getName() + "     k="+k);
        }
        assertEquals(6,k);
    }



}