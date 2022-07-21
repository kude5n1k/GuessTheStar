package com.example.guessthestar.utils;

import android.content.Context;
import android.content.Intent;

import com.example.guessthestar.ui.body_test.view.BodyTestActivity;

public class StartBodyTest {

    public StartBodyTest(Context cnt) {
        Intent intent = new Intent(cnt, BodyTestActivity.class);
        cnt.startActivity(intent);
    }

}
