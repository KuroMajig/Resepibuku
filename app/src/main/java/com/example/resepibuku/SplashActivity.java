// SplashActivity.java
package com.example.resepibuku;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_SCREEN_TIME = 3000; // Waktu tampil splash screen (3 detik)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler untuk menunda transisi ke MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Mulai MainActivity setelah waktu SPLASH_SCREEN_TIME selesai
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup SplashActivity
            }
        }, SPLASH_SCREEN_TIME);
    }
}
