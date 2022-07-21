package com.example.guessthestar.date.stars;


import androidx.annotation.NonNull;

public class StarClass {
    private String avatar;
    private String name;

    public StarClass(String name, String avatar) {

        if (!isStringValid(name))
            throw new IllegalArgumentException("name not valid:("+name+")");

        if (!isStringValid(avatar))
            throw new IllegalArgumentException("avatar not valid:("+avatar+")");

        this.name = name;
        this.avatar = avatar;
        //System.out.println("TEST :: StarClass :: have new star :: ava = " + this.avatar + "    name = " + this.name);
    }


    private boolean isStringValid(String str){
        try {
            boolean pattern = str.matches(".*([a-zA-Z]{3,100}).*"); // от 3 до 100 символов
            if ( pattern) return true;
        } catch (Exception ignored) {}
        return false;
    }

    public String getURLAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }


    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
