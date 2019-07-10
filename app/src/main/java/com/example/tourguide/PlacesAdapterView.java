package com.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlacesAdapterView extends ArrayAdapter<PlacesModel> {
    private String currentMap;

    public String getCurrentMap() {
        return currentMap;
    }

    public PlacesAdapterView(Context context, int resource, List<PlacesModel> objects) {
        super(context, resource, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.details_item, parent, false);
        }
        final PlacesModel currentModel = getItem(position);
        TextView name = listItemView.findViewById(R.id.tour_text_view);
        name.setText(currentModel.getNameOfPlace());
        TextView description = listItemView.findViewById(R.id.desc_text_view);
        description.setText(currentModel.getDesc());
        ImageView imageView = listItemView.findViewById(R.id.tour_image_view);
        imageView.setImageResource(currentModel.getImageResource());
        ImageView imageView1 = listItemView.findViewById(R.id.map_location);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(currentModel.getMapLocation());

                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(mapIntent);
                }
            }
        });


        return listItemView;
    }
}
