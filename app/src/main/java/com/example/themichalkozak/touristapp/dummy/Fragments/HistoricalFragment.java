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


public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
    }

    public static HistoricalFragment newInstance() {
        HistoricalFragment fragment = new HistoricalFragment();
        Bundle args = new Bundle();


        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item,container,false);

        ArrayList<ListElements> listElements = new ArrayList<>();

        String historicalArray [] = getResources().getStringArray(R.array.historicalObjectName);
        String descriptionArray [] = getResources().getStringArray(R.array.monument_description);
        String contactArray [] = getResources().getStringArray(R.array.monument_contact);

        TypedArray imgs = getResources().obtainTypedArray(R.array.historicalDrawableID);
        int lenDrawableArray = imgs.length();

        int historicalDrawableId  [] = new int [lenDrawableArray];


        for(int i=0;i<lenDrawableArray;i++) {

            historicalDrawableId [i] = imgs.getResourceId(i,0);

        }

        imgs.recycle();

        for(int j=0;j<lenDrawableArray;j++){

            listElements.add(new ListElements(historicalArray[j],historicalDrawableId[j],descriptionArray[j],
                    contactArray[3*j],contactArray[3*j+1],contactArray[3*j+2]));
        }


        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);



        return rootView;    }


}
