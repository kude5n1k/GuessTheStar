package com.example.guessthestar.Model;

import com.example.guessthestar.Presenter.StarClass;

import org.junit.Before;
import org.junit.Test;

public class DataStarClassTest {

    DataStarClass dataStarClass = new DataStarClass();


    @Before
    public void setUp() throws Exception {
        for (int i=1; i<=40; i++){
            dataStarClass.setStar(new StarClass("url_"+i, "name_"+i));
        }
        int countStar = dataStarClass.getSizeArrayListStars();
        System.out.println("TEST :: setUp :: countStar = " + countStar);
    }


    @Test
    public void getStar() {

        for (int i=-1; i<=41; i++){
            String name = "not_ini";

            try {
                name = dataStarClass.getStar(i).getName();
            }catch (Exception ex){
                name = ""+ex;
            }

            System.out.println("TEST :: getStar :: i="+i+" :: name = " + name);
        }

    }


}