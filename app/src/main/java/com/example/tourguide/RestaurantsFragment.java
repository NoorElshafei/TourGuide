package com.example.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);

        ArrayList<PlacesModel> placesModels;
        CheckRestaurantsCities checkRestaurantsCities = new CheckRestaurantsCities();

        Intent intent = getActivity().getIntent();
        int position = intent.getExtras().getInt("id");
        Log.i("CheckRestaurantsCities", "id= " + position);
        placesModels = checkRestaurantsCities.checkCities(position);

        PlacesAdapterView placesAdapterView = new PlacesAdapterView(getActivity(), 0, placesModels);
        ListView listView = rootView.findViewById(R.id.list_view_details);
        listView.setAdapter(placesAdapterView);

        return rootView;
    }

}
