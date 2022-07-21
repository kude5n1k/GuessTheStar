package com.example.guessthestar.model.BD;

import static com.example.guessthestar.model.date.db.DataStarClass.clearArrayListStars;
import static com.example.guessthestar.model.date.db.DataStarClass.getSizeArrayListStars;
import static com.example.guessthestar.model.date.db.DataStarClass.getStar;
import static com.example.guessthestar.model.date.db.DataStarClass.setStar;
import static org.junit.Assert.*;

import com.example.guessthestar.date.stars.StarClass;

import org.junit.After;
import org.junit.Test;

public class DataStarClassTest {

    @After
    public void setUp() throws Exception {
         clearArrayListStars();
        System.out.println("TEST :: clearArrayListStars -start");
    }


    @Test
    public void setStarInArrayListTest() {
        StarClass _StarClass;
        int sizeArr;

        ///////==== 1 =======
        for (byte i=-1; i<=10; i++){
            _StarClass = new StarClass("url_"+i, "name_"+i);
            setStar(_StarClass);
        }

        sizeArr = getSizeArrayListStars();
        assertEquals(12, sizeArr);

        ///////==== 2 =======
        String arrName[] = {"", " ", "   ", "----", "-", null, "!",  "\n", "!%$#@", "zzz zzz", "\\\\", "qqqq'qqqq", "aaaaa#%aaaaa", "ssssss.ssssss", "wwwww wwwww", "eeeeee"};
        for (byte i=0; i<arrName.length; i++) {
            try {
                _StarClass = new StarClass(arrName[i], arrName[i]);
                setStar(_StarClass);
            } catch (Exception ex) {
                System.out.println("TEST :: setStarInArrayListTest :: ERROR :: i="+i+" :: ava = " + arrName[i] + "    name = " + arrName[i]);
            }
        }

        ///////==== 3 =======
        _StarClass = null;
        setStar(_StarClass);


        sizeArr = getSizeArrayListStars();  //10
        assertEquals(18, sizeArr);
    }



    @Test
    public void getStarFromArrayList() {
        for (byte i=1; i<=10; i++){
            StarClass starClass = new StarClass("url_"+i, "name_"+i);
            setStar(starClass);
        }

        int sizeArr = getSizeArrayListStars();
        assertEquals("ERROR - sizeArr",10, sizeArr);

        byte k = 0;
        for (int i=-1; i<=sizeArr+1; i++){
            String name=null;
            try {
                name = getStar(i).getName();
                if(name!=null)k++;
                System.out.println("TEST :: getStarFromArrayList :: i(итерация)="+i+" :: k(успешно итераций)=" + k + "   name = " + name + "   всего:" + sizeArr);
            }catch (Exception ex){
                System.out.println("TEST :: getStarFromArrayList :: ERROR :: i(итерация)=" + i + " :: k(успешно итераций)=" + k+ "   name = " + name + "   всего:" + sizeArr);
            }


        }

        assertEquals("ERROR - K",10, k);
    }








}