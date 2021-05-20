package com.example.sharefood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash2 extends AppCompatActivity {

    //variables

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo, text;
private static int SPLASH_SCREEN=6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash2);



        //Animations

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //Hooks
        image=findViewById(R.id.imageLogo);
        logo =findViewById(R.id.textView);
        text=findViewById(R.id.textView2);
        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        text.setAnimation(bottomAnim);
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent=new Intent(splash2.this,MainActivity.class);
                 startActivity(intent);
                 finish();
             }
         }, SPLASH_SCREEN);

    }
}