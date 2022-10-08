package com.example.guessthestar.ui;


import static com.example.guessthestar.DataStarClass.URL_STAR;
import static com.example.guessthestar.DataStarClass.getSizeArrayListStars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.guessthestar.DownloadTask;
import com.example.guessthestar.R;

public class PreviewActivity extends AppCompatActivity {

    TextView textView;
    ProgressBar progressBar;
    Button buttonStart;
    private int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
                                                                                 Log.i("MyDEBUG","MainActivity :: onCreate :: start " );
        textView = findViewById(R.id.textView_download);
        progressBar = findViewById(R.id.progressBar_download);
        progressBar.setMax(40);
        buttonStart = findViewById(R.id.buttonStart);


        //checking if stars have
        int countStars = getSizeArrayListStars();
        try {
            if (countStars < 1)  {
                downloadingNames();
            }else {
                textView.setText("have " + countStars + "  stars");
                progressBar.setProgress(countStars);
                buttonStart.setEnabled(true);
            }
        } catch (Exception e) {
            textView.setText(R.string.we_have_error);
            Log.i("MyDEBUG", "MainActivity :: ERROR :: e =" + e);
        }
    }

    //download data with stars
    public void downloadingNames(){
        DownloadTask downloadTask = new DownloadTask(new DownloadTask.DownloadListener() {

            @Override
            public void onProgressUpdate() {
                progress++;
                progressBar.setProgress(progress);
            }

            @Override
            public void onDownloadComplete() {
                textView.setText("have " + getSizeArrayListStars() + "  star");
                if(getSizeArrayListStars() >= 1 ) {
                    buttonStart.setEnabled(true);
                }else {
                    textView.setText(R.string.we_have_error);
                }
            }
        });
        downloadTask.execute(URL_STAR);

    }






    public void startApp(View view) {
        Intent intent = new Intent(getApplicationContext(), TestActivity.class);
        startActivity(intent);
    }



}