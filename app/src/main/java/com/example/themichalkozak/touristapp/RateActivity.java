package com.example.themichalkozak.touristapp;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateActivity extends AppCompatActivity {

    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        ratingBar = findViewById(R.id.rate_me);


        findViewById(R.id.rate_me_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rateMe();
            }
        });

    }

    public void rateMe(){
        Toast.makeText(RateActivity.this,"Thanks for rate :) ",Toast.LENGTH_SHORT).show();
    }
}
