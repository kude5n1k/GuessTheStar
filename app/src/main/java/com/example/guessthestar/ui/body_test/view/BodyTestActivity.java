package com.example.guessthestar.ui.body_test.view;

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

import com.example.guessthestar.date.stars.StarClass;
import com.example.guessthestar.R;
import com.example.guessthestar.ui.body_test.presenter.BodyTestActivityPresenter;
import com.example.guessthestar.ui.body_test.presenter.BodyTestActivityPresenterImpl;

import java.util.ArrayList;

public class BodyTestActivity extends AppCompatActivity implements BodyTestActivityView {
    private BodyTestActivityPresenter bodyTestActivityPresenter;
    ImageView imageViewAvatar;
    ListView listView;
    ConstraintLayout ConstLayotActivityTes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_test);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        listView = findViewById(R.id.ListName);
        ConstLayotActivityTes = findViewById(R.id.constrainLayotActivityTestId);

        bodyTestActivityPresenter = new BodyTestActivityPresenterImpl(this);
        bodyTestActivityPresenter.createNewTest();

    }


    @Override
    public void setAva(Bitmap bitmapAva) {
        imageViewAvatar.setImageBitmap(bitmapAva);
    }

    @Override
    public void setNames(ArrayList<StarClass> arrayListStarsRandom) {
        ArrayAdapter<StarClass> adapterArrName = new ArrayAdapter<>(getApplicationContext(), R.layout.element_of_about, arrayListStarsRandom);

        // show names + waiting answer
        listView.setAdapter(adapterArrName);
        listView.setEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                bodyTestActivityPresenter.checkAnswer(i);
            }
        });
    }

    @Override
    public void answerCorrect() {
        listView.setEnabled(false);
        setColor(10 , Color.GREEN);
        setColor(300, 0);
        //Toast.makeText(getApplicationContext(), "you guessed fuking star", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                bodyTestActivityPresenter.createNewTest();
            }
        },600);
    }

    @Override
    public void answerNotCorrect() {
        setColor(10, Color.RED);
        setColor(300, 0);
        //Toast.makeText(getApplicationContext(), "you not guessed star", Toast.LENGTH_SHORT).show();
    }





    private void setColor(int time, int color){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(color==0){
                    ConstLayotActivityTes.setBackgroundResource(R.drawable.back_stars);
                }else {
                    ConstLayotActivityTes.setBackgroundColor(color);
                }
            }
        }, time);
    }


}