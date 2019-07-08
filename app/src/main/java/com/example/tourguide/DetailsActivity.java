package com.example.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent=getIntent();
        int position=intent.getExtras().getInt("id");
        ImageView imageView=findViewById(R.id.Image_view_details);
        ImageAdapter imageAdapter=new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
}
