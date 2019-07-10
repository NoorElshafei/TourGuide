package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public Integer[] mThumbIds = {
            R.drawable.cairo, R.drawable.giza,
            R.drawable.dahb, R.drawable.aswan,
            R.drawable.sokhna, R.drawable.sharm,
            R.drawable.matroh, R.drawable.hurghada,
            R.drawable.luxor, R.drawable.alex,
    };
    public String[] mCities = {
            "Cairo", "Giza",
            "Dahb", "Aswan",
            "Ain Sokhna", "Sharm El-Sheikh",
            "Marsa Matruh", "hurghada",
            "Luxor", "Alexandria"};


    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View gridView = view;
        if (gridView == null) {
            gridView = LayoutInflater.from(mContext).inflate(
                    R.layout.content_item, viewGroup, false);

        }

        ImageView imageView = gridView.findViewById(R.id.image_view);
        TextView textView = gridView.findViewById(R.id.food_name);
        textView.setText(mCities[i]);
        imageView.setImageResource(mThumbIds[i]);
        return gridView;
    }


}
