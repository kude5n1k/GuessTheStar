package com.example.guessthestar.View;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.guessthestar.Model.HttpCnnctAva;
import com.example.guessthestar.Presenter.RandomClass;
import com.example.guessthestar.Presenter.StarClass;
import com.example.guessthestar.R;

public class ListStarActivity extends AppCompatActivity {
    ImageView imageViewAvatar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_star);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        listView = findViewById(R.id.ListName);

        createTest();
    }



    private void createTest(){
        RandomClass randomClass = new RandomClass();

        int randomStar = randomClass.getRandomStar();

        // ava
        String urlStrAva = "https://"+randomClass.getURLAvatar();
        Bitmap bitmapAva = new HttpCnnctAva().downlodeAva(urlStrAva);
        imageViewAvatar.setImageBitmap(bitmapAva);

        //names
        ArrayAdapter<StarClass> adapterArrName = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, randomClass.getArrayListStarsRndm());


        listView.setAdapter(adapterArrName);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (randomStar == i){
                    Toast.makeText(getApplicationContext(), "you guessed fuking star", LENGTH_LONG).show();
                    createTest();
                } else {
                    Toast.makeText(getApplicationContext(), "you not guessed star", LENGTH_LONG).show();
                }
            }
        });
    }




}