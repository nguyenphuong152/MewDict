package com.example.doandd;

import android.content.Intent;
import android.os.Bundle;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

//    private TextView tv;
//    private ImageView imv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        tv = (TextView) findViewById(R.id.tvMewdict);
//        imv = (ImageView) findViewById(R.id.imgviewCat);
//
//        Animation anim = AnimationUtils.loadAnimation(this, R.anim.welcome_transition);
//
//        tv.startAnimation(anim);
//        imv.startAnimation(anim);

//        setContentView(R.layout.splash_screen_layout);

//        final Intent i = new Intent(this,MainActivity.class);
//        Thread timer = new Thread() {
//            public void run() {
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                finally {
//                    startActivity(i);
//                    finish();
//                }
//            }
//        };
//        timer.start();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
