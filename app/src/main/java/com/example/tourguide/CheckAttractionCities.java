package com.example.tourguide;

import android.util.Log;

import java.util.ArrayList;

public class CheckAttractionCities {


    public ArrayList<PlacesModel> checkCities(int i) {
        ArrayList<PlacesModel> placesModels=new ArrayList<>();

        if (i == 0) {
           placesModels.add(new PlacesModel("Egyptian Museum",
                    "The Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities.",
                    "geo:30.0470,31.2336?q=30.0470,31.2336+Egyptian Museum",R.drawable.museum));
            placesModels.add(new PlacesModel("Cairo Citadel",
                    "he Saladin Citadel of Cairo is a medieval Islamic fortification in Cairo, Egypt. The location, on Mokattam hill near the center of Cairo, was once famous for its fresh breeze and grand views of the city.",
                    "geo:30.0299,31.2611?q=30.0299,31.2611+Cairo Citadel",R.drawable.mohamed_ali));
            placesModels.add(new PlacesModel("Khan el-Khalili",
                    "Khan el-Khalili is a major souk in the historic center of Islamic Cairo. The bazaar district is one of Cairo's main attractions for tourists and Egyptians alike.",
                    "geo:30.0477,31.2622?q=30.0477,31.2622+Khan el-Khalili",R.drawable.khan));
            placesModels.add(new PlacesModel("Cairo Tower",
                    "The Cairo Tower is a free-standing concrete tower in Cairo, Egypt. At 187 m, it has been the tallest structure in Egypt and North Africa for about 50 years.",
                    "geo:30.0459,31.2221?q=30.0459,31.2221+Cairo Tower",R.drawable.cairo_tower));
            placesModels.add(new PlacesModel("Al-Azhar Park",
                    "Al-Azhar Park is a public park located in Cairo, Egypt. Among several honors, this park is listed as one of the world's sixty great public spaces by the Project for Public Spaces.",
                    "geo:30.0470,31.2336?q=30.0470,31.2336+Egyptian Museum",R.drawable.azhar_park));
            return placesModels;
        }
        else if (i == 1) {
            placesModels.add(new PlacesModel("Giza Museum Attraction",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Giza Museum Attraction",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Giza Museum Attraction",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Giza Museum Attraction",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Giza Museum Attraction",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 2) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 3) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 4) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 5) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 6) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else if (i == 7) {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }
        else  {
            placesModels.add(new PlacesModel("Egyptian Museum1",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum2",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum3",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum4",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            placesModels.add(new PlacesModel("Egyptian Museum5",
                    "he Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or " +
                            "Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities",
                    "google.streetview:cbll=46.414382,10.013988",R.drawable.number_one));
            return placesModels;
        }

    }

}

