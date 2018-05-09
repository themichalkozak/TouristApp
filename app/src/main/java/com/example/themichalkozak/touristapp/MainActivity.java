package com.example.themichalkozak.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper imgFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sliders[] = {
                R.drawable.lublin,
                R.drawable.lublin_2,
                R.drawable.lublin_3,
                R.drawable.lublin_4,
                R.drawable.lublin_5,
                R.drawable.lublin_6
        };

        imgFlipper = findViewById(R.id.flipper_img);

        for (int slide : sliders) {
            sliderFlipper(slide);
        }
    }

public void sliderFlipper (int image){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        imgFlipper.addView(imageView);
        imgFlipper.setFlipInterval(4000);
        imgFlipper.setAutoStart(true);
        imgFlipper.setInAnimation(this,android.R.anim.fade_in);
        imgFlipper.setOutAnimation(this,android.R.anim.fade_out);
}
}
