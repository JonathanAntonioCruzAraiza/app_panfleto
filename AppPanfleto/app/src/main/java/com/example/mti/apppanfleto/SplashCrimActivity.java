package com.example.mti.apppanfleto;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashCrimActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            /*    startActivity(new Intent(SplashCrimActivity.this,PanfletoPrincipal.class));
                finish();*/
                Log.e("SPLASH_DISPLAY_LENGTH","");
                Intent mainIntent = new Intent(SplashCrimActivity.this,PanfletoPrincipal.class);
                SplashCrimActivity.this.startActivity(mainIntent);
                SplashCrimActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}
