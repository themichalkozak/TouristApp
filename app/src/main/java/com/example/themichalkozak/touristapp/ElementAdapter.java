package com.example.themichalkozak.touristapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by themichalkozak on 04/05/2018.
 */

public class ElementAdapter extends ArrayAdapter<ListElements> {

    public ElementAdapter(Context context, ArrayList<ListElements> elements) {
        super(context, 0, elements);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artifact_layout,parent,false);
        }

        ListElements currentElement = getItem(position);


        ImageView elementImage = listItemView.findViewById(R.id.list_item_element_image);
        elementImage.setBackgroundResource(currentElement.getmImageResourceId());
        TextView elementName = listItemView.findViewById(R.id.list_item_element_name);
        elementName.setText(currentElement.getmName());


//        ImageView elementImage = listItemView.findViewById(R.id.list_item_image_view);
//        elementImage.setImageResource(currentElement.getmImageResourceId());

//        TextView elementDescription = listItemView.findViewById(R.id.list_item_description);
//        elementDescription.setText(currentElement.getmDescription());
//
//        TextView elementTelefon = listItemView.findViewById(R.id.list_item_telefon);
//        elementTelefon.setText(currentElement.getmTelefonNumber());
//
//        TextView elementWeb = listItemView.findViewById(R.id.list_item_web);
//        elementWeb.setText(currentElement.getmWeb());
//
//        TextView elementEmail = listItemView.findViewById(R.id.list_item_e_mail);
//        elementEmail.setText(currentElement.geteMail());

        return listItemView;
    }


}
