package com.nizam.timerlibrary;

import android.os.CountDownTimer;
import android.widget.TextView;

public class TimerLibraryClass {



    public static String timerMethod(final TextView textView, final String secondsToShow) {
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView.setText("Completed");
                timerMethod(textView, secondsToShow);
            }
        }.start();

        return "done";
    }


}
