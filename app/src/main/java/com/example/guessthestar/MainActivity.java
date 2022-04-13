package com.example.guessthestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startApp(View view) {
        Intent intent = new Intent(getApplicationContext(), ListStarActivity.class);
        startActivity(intent);
    }




    // for the test --- start new activity
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("ОТЛАДКА :: onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("ОТЛАДКА :: onDestroy");
    }

}