package com.example.dcastalia.rrrrrr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;



import gr.net.maroulis.library.EasySplashScreen;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*setContentView(R.layout.activity_splash);*/

        EasySplashScreen config = new EasySplashScreen(Splash.this)
                .withFullScreen()
                .withTargetActivity(MapsActivity.class)
                .withSplashTimeOut(4000)
                .withBackgroundResource(android.R.color.white)
                .withLogo(R.drawable.foodpeon);





        //finally create the view
        View easySplashScreenView = config.create();
        setContentView(easySplashScreenView);

    }
}
