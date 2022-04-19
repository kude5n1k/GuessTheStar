package com.example.guessthestar.View;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.guessthestar.Model.HttpCnnctAva;
import com.example.guessthestar.Presenter.Presenter;
import com.example.guessthestar.Presenter.StarClass;
import com.example.guessthestar.R;

public class ListStarActivity extends AppCompatActivity {

    ImageView imageViewAvatar;
    ListView listView;
    Presenter presenter;
    ArrayAdapter<StarClass> adapterArrName;

    HttpCnnctAva httpCnnctAva;
    Bitmap bitmapAva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_star);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        listView = findViewById(R.id.ListName);

        //names
        presenter = new Presenter();
        adapterArrName = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, presenter.getRandomName());

        // ava
        httpCnnctAva = new HttpCnnctAva();

    }


    @Override
    protected void onStart() {
        super.onStart();

        bitmapAva = httpCnnctAva.downlodeAva("https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Humphrey_Bogart_1940.jpg/100px-Humphrey_Bogart_1940.jpg");
        imageViewAvatar.setImageBitmap(bitmapAva);

        listView.setAdapter(adapterArrName);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "5555555555", LENGTH_LONG).show();
            }
        });


    }
}