package com.example.themichalkozak.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalTreasure extends AppCompatActivity {

    ArrayList<ListElements> listElements = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        listElements.add(new ListElements("Zamek",R.drawable.lublin_2,"opis","+48-333","www.teatrnn.pl","teatrnn@gmail.com"));

        ElementAdapter adapter = new ElementAdapter(HistoricalTreasure.this,listElements);

        ListView listView = findViewById(R.id.list_item);

        listView.setAdapter(adapter);
    }



}
