package com.example.guessthestar.ui.preview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.guessthestar.R;
import com.example.guessthestar.date.DataManager;
import com.example.guessthestar.date.stars.source.StarsRepository;
import com.example.guessthestar.ui.base.BaseActivity;


/**
 * MVP
 * mvp moxy
 * */

public class PreviewActivity extends BaseActivity<PreviewPresenter> implements PreviewView  {

    TextView textView;
    ProgressBar progressBar;
    Button buttonStartTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
                                                                                 Log.i("MyDEBUG","MainActivity :: onCreate :: start " );
        textView = findViewById(R.id.textView_status);
        progressBar = findViewById(R.id.progressBar_download);
        progressBar.setMax(40);
        buttonStartTest = findViewById(R.id.buttonStartBodyTestActivity);
        buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }


    @NonNull
    @Override
    protected PreviewPresenter createPresenter() {
        StarsRepository starsRepository = DataManager.getsInstance().getStarsRepository();
        return new PreviewPresenter(this, starsRepository);
    }



    /** buttons (Activity ===> Presenter)  */
    public void checkStars(View view) {
        presenter.checkCountStars(); // проверяем есть ли в bd звезды
    }

    public void downloadStars(View view) {
        presenter.downloadedStars(); // скачиваем данные по звездам
    }

    public void clearStars(View view) {
        presenter.clearStars();
    }

    public void startBodyTestActivity(View view) {
        //previewPresenter.startBodyTestActivity(this);
    }





    /** View (Activity <=== Presenter)  */
    @Override
    public void sendMessage(String mess) {
        textView.setText(mess);
    }

    @Override
    public void progressUpdate(int progress) {
        progressBar.setProgress(progress);
    }

    @Override
    public void isButtonStartTestEnabled(boolean status){
        buttonStartTest.setEnabled(status);
        if(status) {
            buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }else {
            buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        }
    };


}