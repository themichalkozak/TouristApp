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



public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item,container,false);

        TypedArray imgs = getResources().obtainTypedArray(R.array.restaurantDrawableID);
        int lenRestaurantArray = imgs.length();
        int restaurantDrawableId [] = new int [lenRestaurantArray];

        String restaurantName [] = getResources().getStringArray(R.array.resturantObjectName);
        String descriptionArray [] = getResources().getStringArray(R.array.monument_description);
        String contactArray [] = getResources().getStringArray(R.array.restaurant_contact);

        for(int i=0;i<lenRestaurantArray;i++){
            restaurantDrawableId [i] = imgs.getResourceId(i,0);

        }
        imgs.recycle();

        for(int j=0;j<lenRestaurantArray;j++){
            listElements.add(new ListElements(restaurantName[j],restaurantDrawableId[j],descriptionArray[j],
                    contactArray[0],contactArray[1],contactArray[2]));
        }

        ElementAdapter elementAdapter  = new ElementAdapter(getActivity(),listElements);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(elementAdapter);


        return rootView;    }




}
