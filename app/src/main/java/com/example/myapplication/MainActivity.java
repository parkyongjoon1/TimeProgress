package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = findViewById(R.id.progress2);
    }

    public void mCnt(View view) {
        Log.v("timerid", String.valueOf(countDownTimer));
        if (countDownTimer != null) countDownTimer.cancel();
        countDownTimer = new CountDownTimer(10000, 100) {
            @Override
            public void onTick(long m) {
                pb.setProgress((int) (m / 100));
                //Log.v("출력", String.valueOf(m));
            }

            @Override
            public void onFinish() {
                pb.setProgress(0);
                //Log.v("출력끝.","끝");
            }

        };

        countDownTimer.start();
    }

}
