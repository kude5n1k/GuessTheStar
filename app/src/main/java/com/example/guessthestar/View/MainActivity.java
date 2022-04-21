package com.example.guessthestar.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.guessthestar.Presenter.InitializationClass;
import com.example.guessthestar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ОТЛАДКА","MainActivity :: onCreate " );

        new InitializationClass();


    }

    public void startApp(View view) {
        Intent intent = new Intent(getApplicationContext(), ListStarActivity.class);
        startActivity(intent);
    }




}