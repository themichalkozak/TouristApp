package com.example.themichalkozak.touristapp;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.themichalkozak.touristapp.dummy.Fragments.AtractionFragment;

public class MainActivity extends AppCompatActivity {

    ViewFlipper imgFlipper;
    View.OnClickListener onClickListenerToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.icon_miasto_inspiracji_transparet);


        int sliders[] = {
                R.drawable.plac_litewski_1,
                R.drawable.lublin_7,
                R.drawable.karnawal_6,
                R.drawable.lublin_5,
                R.drawable.noc_kultury_4,
                R.drawable.stare_miasto,
                R.drawable.wieza_trynitarska_3,
                R.drawable.sloneczny_wrotkow_1
        };

        imgFlipper = findViewById(R.id.flipper_img);

        for (int slide : sliders) {
            sliderFlipper(slide);
        }

        findViewById(R.id.main_atraction).setOnClickListener(intentOnClickListener);
        findViewById(R.id.main_hotels).setOnClickListener(intentOnClickListener);
        findViewById(R.id.main_relic).setOnClickListener(intentOnClickListener);
        findViewById(R.id.main_restaurants).setOnClickListener(intentOnClickListener);
        findViewById(R.id.main_transport).setOnClickListener(intentOnClickListener);
        findViewById(R.id.main_rate_us).setOnClickListener(intentOnClickListener);

    }

    public void sliderFlipper(int image) {

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        imgFlipper.addView(imageView);
        imgFlipper.setFlipInterval(4000);
        imgFlipper.setAutoStart(true);
        imgFlipper.setInAnimation(this, android.R.anim.fade_in);
        imgFlipper.setOutAnimation(this, android.R.anim.fade_out);
    }



    final View.OnClickListener intentOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.main_atraction :
                    startActivity(0);
                    break;
                case R.id.main_relic:
                    startActivity(1);
                    break;
                case R.id.main_hotels:
                    startActivity(2);
                    break;
                case R.id.main_restaurants:
                    startActivity(3);
                    break;
                case R.id.main_transport:
                    String url = "http://mpk.lublin.pl";
                    Intent transportIntent = new Intent(Intent.ACTION_VIEW);
                    transportIntent.setData(Uri.parse(url));
                    startActivity(transportIntent);
                    break;
                case R.id.main_rate_us:
                    Intent rateIntent = new Intent(MainActivity.this,RateActivity.class);
                    startActivity(rateIntent);
                default:
                    Toast.makeText(MainActivity.this,"Bugs Man",Toast.LENGTH_SHORT).show();
            }
        }
    };

    public void startActivity(int numberFragmnet){
        Intent i = new Intent(MainActivity.this, ListActivity.class);
        i.putExtra("TAB",numberFragmnet);
        startActivity(i);
    }

}
