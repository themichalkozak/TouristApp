package com.example.themichalkozak.touristapp.dummy.Fragments;

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



    // TODO: Rename and change types of parameters



    public HotelFragment() {
        // Required empty public constructor
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
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.list_item,container,false);

        ArrayList<ListElements> listElements = new ArrayList<>();

        for(int i=0;i<10;i++) {

            listElements.add(new ListElements("Zamek", R.drawable.lublin_2));
            listElements.add(new ListElements("Elod",R.drawable.lublin));
        }

        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);


        return rootView;    }


}
