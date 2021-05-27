package com.example.skiathos.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skiathos.Dashboard.Dashboard;
import com.example.skiathos.R;
import com.scwang.wave.MultiWaveHeader;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_SCREEN = 4000;


    MultiWaveHeader wave;
    Animation topAnimation, botAnimation, sunAnimation;
    TextView title, subtitle;
    ImageView sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        wave = findViewById(R.id.waves);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        botAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        sunAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_anim);


        title = findViewById(R.id.skiathos);
        subtitle = findViewById(R.id.an_early_paradise);
        sun = findViewById(R.id.sun);

        title.setAnimation(topAnimation);
        subtitle.setAnimation(botAnimation);
        sun.setAnimation(sunAnimation);


        wave.setVelocity(5);
        wave.setProgress(1);
        wave.isRunning();
        wave.setGradientAngle(45);
        wave.setWaveHeight(40);
        wave.setStartColor(Color.BLUE);
        wave.setCloseColor(Color.BLUE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Dashboard.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}