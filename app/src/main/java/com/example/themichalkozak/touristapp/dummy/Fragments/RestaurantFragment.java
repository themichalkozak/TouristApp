package com.example.themichalkozak.touristapp.dummy.Fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.themichalkozak.touristapp.ElementAdapter;
import com.example.themichalkozak.touristapp.ListElements;
import com.example.themichalkozak.touristapp.R;

import java.util.ArrayList;
import java.util.List;


public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    ArrayList<ListElements> listElements = new ArrayList<>();

    public static RestaurantFragment newInstance( ) {
        RestaurantFragment fragment = new RestaurantFragment();
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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item,container,false);

        TypedArray imgs = getResources().obtainTypedArray(R.array.restaurantDrawableID);
        int lenRestaurantArray = imgs.length();

        int restaurantDrawableId [] = new int [lenRestaurantArray];

        String restaurantName [] = getResources().getStringArray(R.array.resturantObjectName);


        for(int i=0;i<lenRestaurantArray;i++){
            restaurantDrawableId [i] = imgs.getResourceId(i,0);

        }

        for (int i=0;i<lenRestaurantArray;i++){
            listElements.add(new ListElements(restaurantName[i],restaurantDrawableId[i]));
        }

        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);


        return rootView;    }




}
