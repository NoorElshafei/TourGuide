package com.example.tourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionFragment extends Fragment {
        private int position;

    public AttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.details_list,container,false);

        final ArrayList<PlacesModel> placesModels;

        Intent intent=getActivity().getIntent();
         position=intent.getExtras().getInt("id");
        //Log.i("CheckAttractionCities", "id= "+position);
        CheckAttractionCities checkAttractionCities=new CheckAttractionCities();
        placesModels=checkAttractionCities.checkCities(position);

        final PlacesAdapterView placesAdapterView=new PlacesAdapterView(getActivity(),0,placesModels);
        ListView listView =rootView.findViewById(R.id.list_view_details);
        listView.setAdapter(placesAdapterView);




        return rootView;
    }


}
