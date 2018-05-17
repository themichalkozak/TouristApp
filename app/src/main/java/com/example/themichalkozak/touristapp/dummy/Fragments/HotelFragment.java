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

public class HotelFragment extends Fragment {

    public HotelFragment() {
    }

    public static HotelFragment newInstance() {
        HotelFragment fragment = new HotelFragment();
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


        View rootView = inflater.inflate(R.layout.list_item,container,false);

        ArrayList<ListElements> listElements = new ArrayList<>();

        String hotelName [] = getResources().getStringArray(R.array.hotelName);
        String descriptionArray [] = getResources().getStringArray(R.array.monument_description);

        TypedArray imgs = getResources().obtainTypedArray(R.array.hotelDrawableId);
        int lenDrawableId = imgs.length();

        int hotelDrawableId [] = new int [lenDrawableId];

        for (int i=0;i<lenDrawableId;i++){
            hotelDrawableId [i] = imgs.getResourceId(i,0);

        }

        for(int i =0;i<lenDrawableId;i++){
            listElements.add(new ListElements(hotelName[i],hotelDrawableId[i],descriptionArray[i]));
        }

        imgs.recycle();

        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);


        return rootView;    }


}
