package com.example.themichalkozak.touristapp.dummy.Fragments;



import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.icu.text.UnicodeSetSpanner;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.themichalkozak.touristapp.ElementAdapter;
import com.example.themichalkozak.touristapp.ListElements;
import com.example.themichalkozak.touristapp.R;

import java.util.ArrayList;


public class AtractionFragment extends Fragment {


    public AtractionFragment() {
    }


    public static AtractionFragment newInstance() {
        AtractionFragment fragment = new AtractionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item,container,false);

        ArrayList<ListElements> listElements = new ArrayList<>();



        TypedArray imgs = getResources().obtainTypedArray(R.array.atractionDrawableId);

        int lenImageArray = imgs.length();

        int attractionArray []= new int [lenImageArray];
        String attractionNameArray [] = getResources().getStringArray(R.array.attractionName);
        String descriptionArray [] = getResources().getStringArray(R.array.monument_description);
        String contactArray [] = getResources().getStringArray(R.array.atraction_contact);
        Log.i("contact Array", contactArray[5] + "");

        for (int i=0;i<lenImageArray;i++){
            attractionArray[i] = imgs.getResourceId(i,0);
        }
        imgs.recycle();


        for(int i=0;i<lenImageArray;i++) {

            listElements.add(new ListElements(attractionNameArray[i],attractionArray[i],descriptionArray[i],contactArray[i].toString(),contactArray[i+1].toString(),contactArray[i+2].toString()));
            //listElements.add(new ListElements(attractionNameArray[i],attractionArray[i],descriptionArray[i],"http://www.mosir.lublin.pl/obiekty/aqua-lublin","81 466 51 01","osrodek@mosik.lubli.pl"));

        }


        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);

        return rootView;
    }



}
