package com.example.guessthestar.date.stars;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "stars")
public class StarClass {

    @PrimaryKey(autoGenerate = true)  // назначить какое-либо поле ключом
    @ColumnInfo(name = "id")
    private int id;

    @Expose       // true, поле, отмеченное этой аннотацией, записывается в JSON при сериализации.
    @SerializedName("avatar")      // имя поля при его сериализации или десериализации
    @ColumnInfo(name = "avatar")   // указать именя поля в таблице
    private String avatar;


    @Expose
    @SerializedName("name")
    @ColumnInfo(name = "name")
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
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
