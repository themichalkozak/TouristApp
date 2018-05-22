package com.example.themichalkozak.touristapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by themichalkozak on 04/05/2018.
 */

public class ElementAdapter extends ArrayAdapter<ListElements> {


    private String urlweb;
    private String telefon;
    private String email;


    public ElementAdapter(Context context, ArrayList<ListElements> elements) {
        super(context, 0, elements);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artifact_layout, parent, false);
        }

        ListElements currentElement = getItem(position);


        ImageView elementImage = listItemView.findViewById(R.id.list_item_element_image);
        elementImage.setBackgroundResource(currentElement.getmImageResourceId());
        TextView elementName = listItemView.findViewById(R.id.list_item_element_name);
        elementName.setText(currentElement.getmName());
        TextView elementDescription = listItemView.findViewById(R.id.list_item_description);
        elementDescription.setText(currentElement.getmDescription());

        final LinearLayout hiddenLayout = listItemView.findViewById(R.id.hidden_layout);
        hiddenLayout.setVisibility(View.GONE);
        elementImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenLayout.getVisibility() == View.GONE) {
                    hiddenLayout.setVisibility(View.VISIBLE);
                } else if (hiddenLayout.getVisibility() == View.VISIBLE) {
                    hiddenLayout.setVisibility(View.GONE);
                }
            }
        });

        urlweb = currentElement.getSiteURL();
        email = currentElement.getmEmailAdress();
        telefon = currentElement.getmTelefon();

        listItemView.findViewById(R.id.list_item_web).setOnClickListener(awesomeOnClickListener);
        listItemView.findViewById(R.id.list_item_telefon).setOnClickListener(awesomeOnClickListener);
        listItemView.findViewById(R.id.list_item_email).setOnClickListener(awesomeOnClickListener);


        return listItemView;
    }

    private View.OnClickListener awesomeOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.list_item_web:
                    Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(urlweb));
                    Log.i("URL web link","" + urlweb);
                    getContext().startActivity(webIntent);
                    break;
                case R.id.list_item_telefon:
                    Intent telefonIntent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",telefon,null));
                    getContext().startActivity(telefonIntent);
                    break;
                case R.id.list_item_email:
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:"));
                    emailIntent.putExtra(Intent.EXTRA_EMAIL,email);
                    getContext().startActivity(emailIntent);
            }
        }
    };

}