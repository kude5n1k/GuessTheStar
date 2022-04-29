package com.example.guessthestar.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.guessthestar.Model.DownloadAva;
import com.example.guessthestar.Presenter.RandomClass;
import com.example.guessthestar.Presenter.StarClass;
import com.example.guessthestar.R;

public class ListStarActivity extends AppCompatActivity {
    ImageView imageViewAvatar;
    ListView listView;
    ConstraintLayout ConstLayotActivityTes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_star);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        listView = findViewById(R.id.ListName);
        ConstLayotActivityTes = findViewById(R.id.constrainLayotActivityTestId);

        createTest();
    }



    private void createTest(){
        RandomClass randomClass = new RandomClass();

        int randomStar = randomClass.getNumberRightStar();

        // ava
        String urlStrAva = "https://"+randomClass.getURLAvatar();
        Bitmap bitmapAva = new DownloadAva().downlodeAva(urlStrAva);
        if(bitmapAva!=null) imageViewAvatar.setImageBitmap(bitmapAva);

        // names
        ArrayAdapter<StarClass> adapterArrName = new ArrayAdapter<>(getApplicationContext(), R.layout.element_of_about, randomClass.getArrayListStarsRandom());


        // show names + waiting answer
        listView.setAdapter(adapterArrName);
        listView.setEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (randomStar == i){
                    listView.setEnabled(false);
                    setColor(10 ,Color.GREEN);
                    setColor(300, Color.WHITE);
                    //Toast.makeText(getApplicationContext(), "you guessed fuking star", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            createTest();
                        }
                    },1000);

                } else {
                    setColor(10, Color.RED);
                    setColor(300, Color.WHITE);
                    //Toast.makeText(getApplicationContext(), "you not guessed star", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




    private void setColor(int time, int color){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ConstLayotActivityTes.setBackgroundColor(color);
            }
        }, time);
    }


}