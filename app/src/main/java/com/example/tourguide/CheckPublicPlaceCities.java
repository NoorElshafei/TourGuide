package com.example.tourguide;

import android.util.Log;

import java.util.ArrayList;

public class CheckPublicPlaceCities{


    public ArrayList<PlacesModel> checkCities(int i) {
        ArrayList<PlacesModel> placesModels = new ArrayList<>();

        if (i == 0) {
            placesModels.add(new PlacesModel("Steigenberger Hotel",
                    "Offering views of the Nile river, this modern hotel in downtown Cairo is a 5-minute walk from the Egyptian Museum, and a 6-minute walk from Sadat metro station and the landmark Tahrir Square.",
                    "geo:30.0424,31.1708?q=Steigenberger Hotel", R.drawable.steigenberger));
            placesModels.add(new PlacesModel("Ramses Hilton",
                    "Quiet area with El Wekala textiles market & El Masslaa Park, plus embassies & riverfront hotels.",
                    "geo:30.0502,31.2299?q=Ramses Hilton", R.drawable.ramsis_hilton));
            placesModels.add(new PlacesModel("Hotel Novotel",
                    "Island district with the Cairo Opera House, indie art galleries & high-end international eateries.",
                    "geo:30.0446,31.2246?q=Hotel Novotel", R.drawable.novotel));
            placesModels.add(new PlacesModel("The Nile Ritz-Carlton",
                    "Opposite the Nile River, this upscale hotel is 1 km from the Egyptian Museum of Antiquities and the Cairo Opera House.",
                    "geo:30.0458,31.2298?q=The Nile Ritz-Carlton", R.drawable.the_nile_ritz));
            return placesModels;
        } else if (i == 1) {
            placesModels.add(new PlacesModel("Giza Pyramids Inn",
                    "Located across the street from the Pyramids & the Great Sphinx Entrance Gate, Giza Pyramids Inn boasts air-conditioned rooms with free WiFi throughout the property. The hotel has a barbecue and sun terrace, and guests can enjoy a meal at the restaurant.",
                    "geo:29.9753,31.1393?q=Giza Pyramids Inn", R.drawable.giza_pyramids_inn));
            placesModels.add(new PlacesModel("Barceló Pyramids Hotel",
                    "Just a 5-minute drive from the Great Pyramid of Giza and a short distance from Cairo's city centre, this trendy hotel offers spacious and contemporary rooms.",
                    "geo:29.9997,31.1740?q=Barceló Cairo Pyramids Hotel", R.drawable.barcelo_cairo_pyramids_hotel));
            placesModels.add(new PlacesModel("Giza Pyramids View Inn",
                    "Situated 300 m from Great Sphinx, Giza Pyramids View Inn features accommodation with a bar, a shared lounge and a 24-hour front desk for your convenience. Free WiFi is available.",
                    "geo:329.9748749,31.1388264?q=Giza Pyramids View Inn", R.drawable.giza_pyramids_view));
            placesModels.add(new PlacesModel("Le Meridien Pyramids Hotel",
                    "Le Méridien Pyramids Hotel & Spa boasts unparalleled views of the majestic Giza Pyramids, located only 1 km away. It features a large free form outdoor pool with bar island. Free WiFi is available throughout the property.",
                    "geo:29.9891,31.1280?q=Le Meridien Pyramids Hotel", R.drawable.le_meridien_pyramids_hotel));

            return placesModels;
        } else if (i == 2) {
            placesModels.add(new PlacesModel("Monica Hotel",
                    "Providing free WiFi, a sun terrace with a swimming pool, garden and shared lounge, Monica Hotel is located in Dahab. Featuring room service, this property also provides guests with a barbecue. The accommodation provides a 24-hour front desk, a shared kitchen and luggage storage for guests.",
                    "geo:28.4939,34.5126?q=Monica Hotel", R.drawable.monica_hotel));
            placesModels.add(new PlacesModel("Solaris Hotels",
                    "Set in Dahab and with Dive Urge - Dive Centre reachable within 300 metres, Solaris offers a garden, non-smoking rooms, free WiFi and a private beach area. ",
                    "geo:28.4920,34.5146?q=Solaris", R.drawable.solaris));
            placesModels.add(new PlacesModel("Golden Europe Hotel",
                    "Golden Europe Hotel offers beachfront accommodation a few steps from Red Sea Relax Dive Resort and features various facilities, such as a garden, a private beach area and a terrace.",
                    "geo:28.4995,34.5175?q=Golden Europe Hotel", R.drawable.golden_europe_hotel));
            placesModels.add(new PlacesModel("El Primo Hotel Dahab",
                    "Featuring a balcony or terrace overlooking the sea, the bright, air-conditioned rooms are fitted with tiled floors and a wardrobe. Each has a private bathroom. Free Wi-Fi is available in all rooms.",
                    "geo:28.5046,34.5176?q=El Primo Hotel Dahab", R.drawable.primo_hotel_dahab));

            return placesModels;
        } else if (i == 3) {
            placesModels.add(new PlacesModel("Sofitel Legend Old Cataract",
                    "Located in the Nubian Desert on the banks of the Nile, opposite Elephantine Island, Sofitel Legend Old Cataract offers elegant rooms and suites. It features outdoor and indoor pools.",
                    "geo:24.0822,32.8850?q=Sofitel Legend Old Cataract", R.drawable.sofitel_legend));
            placesModels.add(new PlacesModel("Kato Dool Nubian Resort",
                    " Kato Dool Nubian Resort offers beachfront accommodation 18 km from Aga Khan Mausoleum and provides various facilities, such as a garden, a shared lounge and a terrace.",
                    "geo:24.0602,32.8622?q=Kato Dool Nubian Resort", R.drawable.kato_dool_nubian));
            placesModels.add(new PlacesModel("Citymax Hotel Aswan",
                    "Situated in Kornish Al Nile, Citymax Hotel Aswan features an outdoor swimming pool. The 4-star hotel has air-conditioned rooms with a private bathroom and free WiFi.",
                    "geo:24.0974,32.8961?q=Citymax Hotel Aswan", R.drawable.citymax_hotel_aswan));
            placesModels.add(new PlacesModel("Philae Hotel Aswan",
                    "Philae Hotel is located in Aswan. It offers air-conditioned accommodation with balconies overlooking the Nile. It features free Wi-Fi in all area and a restaurant that serves American Breakfast.",
                    "geo:24.0889,32.8921?q=Philae Hotel Aswan", R.drawable.philae_hotel_aswan));

            return placesModels;
        } else if (i == 4) {
            placesModels.add(new PlacesModel("Romance Hotel",
                    "Situated on a private, Gulf of Suez beach, this 4-star hotel offers air-conditioned rooms with a balcony. Its outdoor pool is surrounded by cushioned loungers. Snorkelling is possible at the beach.",
                    "geo:29.2865,32.6011?q=Romance Hotel", R.drawable.romance_hotel));
            placesModels.add(new PlacesModel("Elite Residence",
                    " Elite Residence & Aqua Park boasts a restaurant. The hotel has an outdoor pool, and indoor heated swimming pool and a private beach area, and guests can enjoy a meal at the restaurant or a drink at the bar. Free private parking is available on site.",
                    "geo:29.7285,32.3906?q=Elite Residence", R.drawable.elite_residence));
            placesModels.add(new PlacesModel("Porto El Jabal Hotel",
                    "Facing the beachfront, Porto El Jabal Hotel offers 4-star accommodation in Ain Sokhna and has an outdoor swimming pool and terrace. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi.",
                    "geo:29.4320,32.4692?q=Porto El Jabal Hotel", R.drawable.porto_el_jabal_hotel));
            placesModels.add(new PlacesModel("New Horizon Elwadi Hotel",
                    "ew Horizon Elwadi Hotel features an outdoor swimming pool, garden, a bar and shared lounge in Ain Sokhna. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. ",
                    "geo:29.6667,32.3545?q=New Horizon Elwadi Hotel", R.drawable.new_horizon_elwadi_hotel));
            return placesModels;
        } else if (i == 5) {
            placesModels.add(new PlacesModel("Xperience Golden Sandy Beach",
                    "Situated in Sharm El Sheikh, Xperience Golden Sandy Beach has a private beach area and a garden. The property is set in Sharm El-Maia.",
                    "geo:27.8572,34.2891?q=Xperience Golden Sandy Beach", R.drawable.xperience_golden_sandy_beach));
            placesModels.add(new PlacesModel("Hotel Novotel Sharm El-Sheikh",
                    "Situated in Sharm El-Sheikh, this hotel is located within Naama Bay. It has a private beach, 5 swimming pools, and offers air-conditioned rooms with satellite TV.",
                    "geo:27.9156,34.3287?q=Hotel Novotel Sharm El-Sheikh", R.drawable.hotel_novotel_sharm));
            placesModels.add(new PlacesModel("Coral Sea Aqua Club Resort",
                    "Coral Sea Aqua Club Resort in Sharm El Sheikh provides accommodation with a fitness centre, a garden and a terrace. This property is situated a short distance from attractions such as International Congress Center - Jolie Ville Hotels and The Heavenly Cathedral.",
                    "geo:28.0404,34.4268?q=Coral Sea Aqua Club Resort", R.drawable.coral_sea_aqua_club_resort));
            placesModels.add(new PlacesModel("Kahramana Hotel Naama Bay",
                    " this beachfront hotel offers a large outdoor pool surrounded by shaded sun loungers.",
                    "geo:27.9113,34.3222?q=Kahramana Hotel Naama Bay", R.drawable.kahramana_hotel_naama_bay));

            return placesModels;
        } else if (i == 6) {
            placesModels.add(new PlacesModel("Adriatica Hotel Marsa Matrouh",
                    "Offering a restaurant, Adriatica Hotel Marsa Matrouh is located in Marsa Matruh. Free WiFi access is available in public areas.",
                    "geo:31.3536,27.2323?q=Adriatica Hotel Marsa Matrouh", R.drawable.adriatica_hotel_marsa));
            placesModels.add(new PlacesModel("Beau Site Hotel",
                    "Featuring a private sandy beach, Beau Site Hotel Marsa Matrouh is a historical hotel located 10 minutes’ walk from City Centre. It boasts air-conditioned accommodation with a balcony, along with 2 restaurants and a garden.",
                    "geo:31.3623,27.2188?q=Beau Site Hotel", R.drawable.beau_site));
            placesModels.add(new PlacesModel("Carols Beau Rivage Matrouh",
                    "Situated on the edge of an aqua oasis, the Carols Beau Rivage Matrouh is embraced by the Pristine Beaches. ",
                    "geo:31.3938,27.0625?q=Carols Beau Rivage Matrouh", R.drawable.carols_beau));
            placesModels.add(new PlacesModel("Las Vegas Marsa Matrouh",
                    "Las Vegas Marsa Matrouh features an outdoor swimming pool, garden, a bar and shared lounge in Marsa Matruh. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. ",
                    "geo:31.3714,27.1915?q=Las Vegas Marsa Matrouh", R.drawable.las_vegas));

            return placesModels;
        } else if (i == 7) {
            placesModels.add(new PlacesModel("Sky View Suites Hotel",
                    "Sky View Suites Hotel has an outdoor swimming pool, garden, a bar and shared lounge in Hurghada. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. All rooms include a balcony with pool views.",
                    "geo:27.2053,33.8437?q=Sky View Suites Hotel", R.drawable.sky_view));
            placesModels.add(new PlacesModel("Mercure Hurghada Hotel",
                    "Featuring a private beach on the Red Sea, this 4-star resort offers air-conditioned accommodation with a satellite TV. It features 2 outdoor pools and a sauna. Water sports are available on site.",
                    "geo:27.1313,33.8261?q=Mercure Hurghada Hotel", R.drawable.mercure));
            placesModels.add(new PlacesModel("Mirag Beach & Aqua Park",
                    "Mirag Beach & Aqua Park features a garden, fitness centre, a bar and shared lounge in Hurghada.",
                    "geo:27.0922,33.8371?q=Mirag Beach & Aqua Park", R.drawable.mirag_beach));
            placesModels.add(new PlacesModel("Tropitel Sahl Hasheesh",
                    "Located in an elegant area of the Red Sea, Tropitel Sahl Hasheesh features magical views of the warm Red Sea and a sandy beach with a private jetty. It includes 3 outdoor swimming pools heated in winter as well as a children's pool.",
                    "geo:27.0208,33.8890?q=Tropitel Sahl Hasheesh", R.drawable.tropitel_sahl));

            return placesModels;
        } else if (i == 8) {
            placesModels.add(new PlacesModel("Pavillon Winter Luxor",
                    "Pavillon Winter Luxor offers 3 restaurants, 2 bars, and warm hospitality in the heart of Luxor city. It overlooks the River Nile and is just 100 m away from the Luxor Temple.",
                    "geo:25.6967,32.6357?q=Pavillon Winter Luxor", R.drawable.pavillon_winter_luxor));
            placesModels.add(new PlacesModel("Al Hambra Hotel",
                    "Located 10 minutes drive from Hatshepsut Temple, Al Hambra Hotel offers air-conditioned accommodation with free Wi-Fi and a balcony. The Nile River is a 5-minute walk away.",
                    "geo:25.7077,32.6285?q=Al Hambra Hotel", R.drawable.al_hambra_hotel));
            placesModels.add(new PlacesModel("Al Moudira Hotel",
                    "Located at the gateway to Luxor, Al Moudira Hotel is the only palace situated on the west bank of the Nile. The domes and the patios ornate with arabesque makes up the oriental décor. It offers an outdoor pool and a spacious terrace.",
                    "geo:25.6844,32.5505?q=Al Moudira Hotel", R.drawable.al_moudira_hotel));
            placesModels.add(new PlacesModel("Sofitel Winter Palace Luxor",
                    "Sofitel Winter Palace Luxor has a history of hosting royalty and celebrities throughout the years. The interior features grand staircases, high ceilings and lounge areas that are appointed with antique furniture and beautiful flower arrangements.",
                    "geo:25.6966,32.6349?q=Sofitel Winter Palace Luxor", R.drawable.sofitel_winter_palace_luxor));
            return placesModels;
        } else {
            placesModels.add(new PlacesModel("Four Seasons Hotel",
                    "Set in an architectural landmark, Hotel San Stefano features a fashionable resort setting with a private sandy beach and overlooking the Mediterranean Sea. It boasts a full-service spa, outdoor pool and restaurants with terraces.",
                    "geo:31.2455,29.9645?q=Four Seasons Hotel Alexandria At San Stefano", R.drawable.four_seasons_hotel));
            placesModels.add(new PlacesModel("Hilton Alexandria",
                    "On site of Green Plaza Mall, this Hilton is only steps away from 370 shops. With two outdoor pools, it also features a sun deck and fitness centre. Alexandria Al Nozha Airport is 10 minutes’ drive away.",
                    "geo:31.2065,29.9633?q=Hilton Alexandria Green Plaza", R.drawable.hilton_alexandria));
            placesModels.add(new PlacesModel("The Grand Plaza Hotel",
                    "he Grand Plaza Hotel is a hotel set in the heart of Alexandria. This hotel offers a 24-hour front desk. Guests can enjoy fee WiFi throughout the property.",
                    "geo:31.2088,29.9582?q=The Grand Plaza Hotel Smouha", R.drawable.the_grand_plaza));
            placesModels.add(new PlacesModel("Royal Crown Hotel",
                    "Set in Alexandria, 4.3 km from Alexandria Zoo, Royal Crown Hotel offers air-conditioned accommodation and a shared lounge. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. ",
                    "geo:31.2242,29.9330?q=Royal Crown Hotel", R.drawable.royal_crown_hotel));

            return placesModels;
        }

    }
}
