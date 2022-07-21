package com.example.guessthestar.utils;

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.model.date.db.DataStarClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/******* Class for find ava link and name in strings  *****/
public class FindPatternInLine {
    Pattern pattern = Pattern.compile("<td><a href(.*?)</span></a>");

    // search for strings by pattern
    public boolean startFindPattern(String line){
        if (line==null)return false;
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){

            String name = findPattern(matcher.group(1), "img alt=\"(.*?).jpg\"");
            String ava = findPattern(matcher.group(1), "src=\"//(.*?)\" decoding");

            if(name!=null && ava!=null){
                // Log.i("MyDEBUG","RequestTask :: findPatternLine ::  еть новая звезда " + name );
                try {
                    DataStarClass.setStar(new StarClass(ava, name));
                    return true;
                }catch (Exception ignored) { }
            }
        }
        return false;
    }

    private String findPattern(String line, String patternStr){
        String resalt = null;
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            resalt = matcher.group(1);
        }
        return resalt;
    }


}
