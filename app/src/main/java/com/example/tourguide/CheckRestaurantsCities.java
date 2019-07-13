package com.example.tourguide;

import android.util.Log;

import java.util.ArrayList;

public class CheckRestaurantsCities{


    public ArrayList<PlacesModel> checkCities(int i) {
        ArrayList<PlacesModel> placesModels = new ArrayList<>();

        if (i == 0) {//cairo
            placesModels.add(new PlacesModel("The Osmanly Restaurant",
                    "Address: Kempinski Nile Hotel, Corniche El Nil, 12 Ahmed Raghab Street, 11519, Garden City, Cairo\n" +
                            "Hours: \n" +
                            "Open ⋅ Closes 12PM ⋅ Reopens 6PM" +
                            "\n" +
                            "Phone: 02 27980000",
                    "geo:30.0386,31.2281?q=The Osmanly Restaurant", R.drawable.the_osmanly_restaurant));
            placesModels.add(new PlacesModel("Le Deck - By Laurent Peugeot",
                    "Address: 3 El Thawra Council St Zamalek, Downtown, CAIRO, Cairo Governorate 11518" +
                            "Hours:Opens 5PM" +
                            "\n" +
                            "Phone: 02 27373737",
                    "geo:30.0389,31.2227?q=The Osmanly Restaurant", R.drawable.le_deck));

            return placesModels;
        } else if (i == 1) {//giza
            placesModels.add(new PlacesModel("Reydan Resturant",
                    "Hours:" +" Opens 11AM" +
                            "\n" +
                            "Phone: 0122 267 7770",
                    "geo:29.9744,30.9461?q=Reydan Resturant", R.drawable.reydan_resturant));

            placesModels.add(new PlacesModel("La Gourmandise",
                    "Address: 35 Giza St, Ad Doqi A, Dokki, Giza Governorate 12311\n" +
                            "Hours:  Opens 8AM" +
                            "\n" +
                            "Phone: 02 35672090",
                    "geo:30.0353,31.2159?q=La Gourmandise", R.drawable.la_gourmandise));
            return placesModels;
        } else if (i == 2) {//dahb
            placesModels.add(new PlacesModel("Shark Restaurant",
                    "Address: Qesm Saint Katrin, South Sinai Governorate\n" +
                            "Hours: Opens 8AM" +
                            "\n" +
                            "Phone: 0101 313 3348",
                    "geo:28.4982,34.5156?q=Shark Restaurant", R.drawable.shark_restaurant));
            placesModels.add(new PlacesModel("King Chicken",
                    "Address: 46617, Qesm Saint Katrin, South Sinai Governorate 46617\n" +
                            "Hours: Opens 10AM" +
                            "\n" +
                            "Phone: 0100 909 0628",
                    "geo:28.4929,34.5137?q=King Chicken", R.drawable.king_chicken1));

            return placesModels;
        } else if (i == 3) {//awsan
            placesModels.add(new PlacesModel("Al Dokka",
                    "Address: Hessa Island, Kornish Al Nile, Qism Aswan, Aswan Governorate" +
                            "Hours: Opens 11AM" +
                            "\n" +
                            "Phone: 0122 216 2379",
                    "geo:224.0826,32.8823?q=Al Dokka", R.drawable.aldokka));
            placesModels.add(new PlacesModel("Nubian Dream Restaurant",
                    "Address: elephantine island near the ferry boat، Qism Aswan, Aswan Governorate 81111" +
                            "Hours: Opens 8AM" +
                            "\n" +
                            "Phone: 0127 622 0488",
                    "geo:24.0892,32.8885?q=Nubian Dream Restaurant", R.drawable.nubian_dream_restaurant));

            return placesModels;
        } else if (i == 4) {//ain sokhna
            placesModels.add(new PlacesModel("Abu Ali Fish",
                    "Address: Hurgada - Al Ismaileya, Ataqah, Suez Governorate" +
                            "Hours: 24 hours" +
                            "\n" +
                            "Phone: 0100 112 4400",
                    "geo:29.6946,32.3389?q=Abu Ali Fish", R.drawable.abu_ali_fish));
            placesModels.add(new PlacesModel("Ponte Vecchio",
                    "Address: Hurghada Suez Rd.، EL AIN EL SOKHNA، Suez Governorate\n" +
                            "Phone: 062 3250100",
                    "geo:29.6716,32.3546?q=Ponte Vecchio", R.drawable.ponte_vecchio));

            return placesModels;
        } else if (i == 5) {//sharm elshiekh
            placesModels.add(new PlacesModel("Rangoli",
                    "Address: Qesm Sharm Ash Sheikh, South Sinai Governorate\n" +
                            "Hours:  Opens 6:30PM" +
                            "\n" +
                            "Phone: 069 3600081",
                    "geo:27.9135,34.3387?q=Rangoli", R.drawable.rangoli));
            placesModels.add(new PlacesModel("Fish Market Kan Zaman",
                    "Address: .، NAAMA BAY، SHARM EL SHEIKH، South Sinai Governorate\n" +
                            "Hours:  Opens 6PM" +
                            "\n" +
                            "Phone: 069 3603877",
                    "geo:27.9104,34.3209?q=Fish Market Kan Zaman", R.drawable.fish_market_kan_zaman));

            return placesModels;
        } else if (i == 6) {//marsa Matroh
            placesModels.add(new PlacesModel("Abdo Kofta",
                    "Address: El-Tahrir, Qism Moursy Matrouh, Matrouh Governorate\n" +
                            "Hours: 24 hours" +
                            "\n" +
                            "Phone: 0111 772 4888",
                    "geo:31.3547,27.2409?q=Abdo Kofta", R.drawable.abdo_kofta));
            placesModels.add(new PlacesModel("Koko Restaurant",
                    "Address: El-Tahrir, Qism Moursy Matrouh, Matrouh Governorate\n" +
                            "Hours: Closes 5AM ⋅ Reopens 1PM" +
                            "\n" +
                            "Phone: 0109 111 9058",
                    "geo:31.3546,27.2422?q=Koko Restaurant", R.drawable.koko_restaurant));

            return placesModels;
        } else if (i == 7) {//hurghada
            placesModels.add(new PlacesModel("Starfish Seafood Resturant",
                    "Address: Sheraton Rd, Hurghada, Red Sea Governorate\n" +
                            "Hours: Opens 11AM" +
                            "\n" +
                            "Phone: 065 3443751",
                    "geo:27.2259,33.8354?q=Starfish Seafood Resturant", R.drawable.starfish_seafood));
            placesModels.add(new PlacesModel("Amaya Restaurant",
                    "Address: Madinat Makadi, Makadi Bay, Safaga Road, Hurghada, Red Sea Governorate 84511\n" +
                            "Phone: 065 3590580",
                    "geo:26.9884,33.8932?q=Amaya Restaurant", R.drawable.amaya_restaurant));

            return placesModels;
        } else if (i == 7) {//luxor
            placesModels.add(new PlacesModel("Sofra",
                    "Address: 90 Mohamed Farid St، Luxor City, Luxor, Luxor Governorate" +
                            "Hours: Opens 11AM" +
                            "\n" +
                            "Phone: 095 2359752",
                    "geo:25.6948,32.6402?q=Sofra", R.drawable.sofra));
            placesModels.add(new PlacesModel("Al- Sahaby Lane",
                    "Address: El Sahabi Street، Luxor City, Luxor, Luxor Governorate\n" +
                            "Hours:  Opens 11AM" +
                            "\n" +
                            "Phone: 095 2256086",
                    "geo:25.7016124,32.639989?q=Al- Sahaby Lane", R.drawable.sahaby_lane));

            return placesModels;
        }else {
            placesModels.add(new PlacesModel("Byblos",
                    "Located in: San Stefano Grand Plaza\n" +
                            "Address: El-Gaish Rd, San Stifano, Qism El-Raml, Alexandria Governorate 21599\n" +
                            "Hours: Opens 1PM" +
                            "\n" +
                            "Phone: 03 5818000",
                    "geo:31.245729,29.9636923?q=Byblos", R.drawable.byblos));
            placesModels.add(new PlacesModel("Fish Market",
                    "Address: El-Gaish Rd, Al Mazar, Qesm Al Gomrok, Alexandria Governorate\n" +
                            "Hours:  Opens 12PM" +
                            "\n" +
                            "Phone: 03 4815512",
                    "geo:31.2053787,29.8502367?q=Fish Market", R.drawable.fish_market));

            return placesModels;
        }

    }
}
