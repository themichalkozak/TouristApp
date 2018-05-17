package com.example.themichalkozak.touristapp.dummy.Fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.themichalkozak.touristapp.ElementAdapter;
import com.example.themichalkozak.touristapp.ListElements;
import com.example.themichalkozak.touristapp.R;

import java.util.ArrayList;


public class HistoricalFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    public HistoricalFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HistoricalFragment newInstance() {
        HistoricalFragment fragment = new HistoricalFragment();
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

        ArrayList<ListElements> listElements = new ArrayList<>();

        String historicalArray [] = getResources().getStringArray(R.array.historicalObjectName);

        TypedArray imgs = getResources().obtainTypedArray(R.array.historicalDrawableID);
        int lenDrawableArray = imgs.length();

        int historicalDrawableId  [] = new int [lenDrawableArray];


        for(int i=0;i<lenDrawableArray;i++) {

            historicalDrawableId [i] = imgs.getResourceId(i,0);
            listElements.add(new ListElements(historicalArray[i],historicalDrawableId[i]));
        }
        imgs.recycle();

        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);



        return rootView;    }


}
