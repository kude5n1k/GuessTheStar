package com.example.guessthestar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class ListStarActivity extends AppCompatActivity {

    ImageView imageViewAvatar;
    RecyclerView recyclerViewNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_star);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        recyclerViewNames = findViewById(R.id.RecyclerViewName);

        // make a request to the server





    }




}