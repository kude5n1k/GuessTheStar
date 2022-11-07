package com.example.guessthestar.ui.preview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;


import com.example.guessthestar.R;
import com.example.guessthestar.date.DataManager;
import com.example.guessthestar.date.stars.source.StarsRepositoryManager;
import com.example.guessthestar.ui.base.BaseActivity;




public class PreviewActivity extends BaseActivity<PreviewPresenter> implements PreviewView  {
    TextView textView;
    ProgressBar progressBar;
    Button buttonStartTest;


    @NonNull
    @Override
    protected PreviewPresenter createPresenter() {
        StarsRepositoryManager starsRepositoryManager = DataManager.getsInstance().getStarsRepository();
        return new PreviewPresenter(this, starsRepositoryManager);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        textView = findViewById(R.id.textView_status);
        progressBar = findViewById(R.id.progressBar_download);
        progressBar.setMax(40);
        buttonStartTest = findViewById(R.id.buttonStartBodyTestActivity);
        buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }


    @Override
    protected void onStart() {
        super.onStart();
        presenter.startObserverLD(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.stopObserverLD();
    }




    /** Buttons */
    public void downloadStars(View view) {
        presenter.downloadedStars(); // скачиваем данные по звездам
    }

    public void clearingStars(View view) {
        presenter.clearingStars();
    }

    public void startBodyTestActivity(View view) {
        presenter.startBodyTestActivity(this);
    }





    /** View (Activity <=== Presenter)  */
    @Override
    public void showCountStars(int count) {
        if (count >= 3)  {
            // Ready To Start (данные есть - готовы начать)
            sendMessage(getString(R.string.have_X_stars, count));

            progressBar.setProgress(count);

            buttonStartTest.setEnabled(true);
            buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.green));

        }else {
            // not Ready To Start
            sendMessage(getString(R.string.need_downloaded_stars));

            progressBar.setProgress(0);

            buttonStartTest.setEnabled(false);
            buttonStartTest.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        }
     }


    @Override
    public void sendMessage(String mess) {
        textView.setText(mess);
    }





}