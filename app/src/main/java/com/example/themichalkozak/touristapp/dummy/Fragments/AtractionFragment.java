package com.example.themichalkozak.touristapp.dummy.Fragments;



import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.themichalkozak.touristapp.ElementAdapter;
import com.example.themichalkozak.touristapp.ListElements;
import com.example.themichalkozak.touristapp.R;

import java.util.ArrayList;


public class AtractionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    int fragVal;

    public AtractionFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
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

        for (int i=0;i<lenImageArray;i++){
            attractionArray[i] = imgs.getResourceId(i,0);
        }
        imgs.recycle();


        for(int i=0;i<attractionArray.length;i++) {

            listElements.add(new ListElements(attractionNameArray[i],attractionArray[i]));
            Log.i("Resource", ""+ attractionArray[i]);
        }


        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);


        return rootView;    }





}
