package com.example.guessthestar;


import androidx.annotation.NonNull;

public class StarClass {
    private String avatar;
    private String name;

    public StarClass(String avatar, String name) {
        if (!avatar.isEmpty() && !name.isEmpty()) {
            this.avatar = avatar;
            this.name = name;
        }
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
