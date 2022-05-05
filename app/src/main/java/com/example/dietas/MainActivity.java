package com.example.dietas;

import static com.example.dietas.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final long MainActivity_SCREEN_DELAY = 3000;

    //variables
    Animation topAnim, bottomAnim;
    ImageView image, logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Animación
        topAnim = AnimationUtils.loadAnimation (this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.botton_animation);
        //lógica y diseño
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Dietas.class);
                startActivity(intent);
                finish();
            }
        },MainActivity_SCREEN_DELAY);
    }
}