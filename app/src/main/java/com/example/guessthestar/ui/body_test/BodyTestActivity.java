package com.example.guessthestar.ui.body_test;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.guessthestar.date.DataManager;
import com.example.guessthestar.R;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.ui.base.BaseActivity;

import java.util.ArrayList;

public class BodyTestActivity extends BaseActivity<BodyTestPresenter> implements BodyTestView {

    ImageView imageViewAvatar;
    ListView listViewName;
    ConstraintLayout ConstLayoutActivityTes;


    @NonNull
    @Override
    protected BodyTestPresenter createPresenter() {
        StarsRepository starsRepository = DataManager.getsInstance().getStarsRepository();
        return new BodyTestPresenter(this, starsRepository);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_test);

        imageViewAvatar = findViewById(R.id.imageViewAvatar);
        listViewName = findViewById(R.id.ListName);
        ConstLayoutActivityTes = findViewById(R.id.constrainLayotActivityTestId);


        presenter.createNewTest();
    }

    /** View (Activity <=== Presenter)  */
    @Override
    public Context getContextOwner() {
        return this;
    }

    @Override
    public ImageView getImageViewAva() {
        return imageViewAvatar;
    }



    @Override
    public void setNames(ArrayList<String> arrayListStarsRandom) {

        ArrayAdapter<String> adapterArrName = new ArrayAdapter<>(
                getApplicationContext(),
                R.layout.element_normal,
                arrayListStarsRandom);

        // show names + waiting answer
        listViewName.setAdapter(adapterArrName);
        listViewName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                presenter.checkAnswer(view, position); // i = 0;1;2
             }
        });
    }




    @Override
    public void answerCorrect(View viewVariant) {
        viewVariant.setBackgroundResource(R.drawable.form_element_ok);

        listViewName.setOnItemClickListener(null); //отключиение прослушивания кликов

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.createNewTest();
            }
        },1000);
    }

    @Override
    public void answerNotCorrect(View viewVariant) {
        Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animAlpha.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                viewVariant.setBackgroundResource(R.drawable.form_element_not_ok);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                viewVariant.setBackgroundResource(R.drawable.form_element_normal);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        viewVariant.startAnimation(animAlpha);
    }



    @Override
    public void toastError(String mess){
        Toast.makeText(this, mess, Toast.LENGTH_LONG).show();
        Log.i("MyDEBUG","BodyTestActivity :: toastError :: " + mess);
    }

}