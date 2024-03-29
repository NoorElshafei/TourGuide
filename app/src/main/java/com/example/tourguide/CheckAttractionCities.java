package com.example.tourguide;

import android.util.Log;

import java.util.ArrayList;

public class CheckAttractionCities {


    public ArrayList<PlacesModel> checkCities(int i) {
        ArrayList<PlacesModel> placesModels = new ArrayList<>();

        if (i == 0) {
            placesModels.add(new PlacesModel("Egyptian Museum",
                    "The Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities.",
                    "geo:30.0470,31.2336?q=30.0470,31.2336+Egyptian Museum", R.drawable.museum));
            placesModels.add(new PlacesModel("Cairo Citadel",
                    "he Saladin Citadel of Cairo is a medieval Islamic fortification in Cairo, Egypt. The location, on Mokattam hill near the center of Cairo, was once famous for its fresh breeze and grand views of the city.",
                    "geo:30.0299,31.2611?q=30.0299,31.2611+Cairo Citadel", R.drawable.mohamed_ali));
            placesModels.add(new PlacesModel("Khan el-Khalili",
                    "Khan el-Khalili is a major souk in the historic center of Islamic Cairo. The bazaar district is one of Cairo's main attractions for tourists and Egyptians alike.",
                    "geo:30.0477,31.2622?q=30.0477,31.2622+Khan el-Khalili", R.drawable.khan));
            placesModels.add(new PlacesModel("Cairo Tower",
                    "The Cairo Tower is a free-standing concrete tower in Cairo, Egypt. At 187 m, it has been the tallest structure in Egypt and North Africa for about 50 years.",
                    "geo:30.0459,31.2221?q=30.0459,31.2221+Cairo Tower", R.drawable.cairo_tower));
            placesModels.add(new PlacesModel("Al-Azhar Park",
                    "Al-Azhar Park is a public park located in Cairo, Egypt. Among several honors, this park is listed as one of the world's sixty great public spaces by the Project for Public Spaces.",
                    "geo:30.0406,31.2625?q=30.04063,31.2625+Al-Azhar Park", R.drawable.azhar_park));
            return placesModels;
        } else if (i == 1) {
            placesModels.add(new PlacesModel("Giza Necropolis",
                    "The Giza pyramid complex, also called the Giza Necropolis, is the site on the Giza Plateau in Egypt that includes the Great Pyramid of Giza, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx of Giza.",
                    "geo:29.9773,31.1303?q=Giza Necropolis", R.drawable.giza_necropolis));
            placesModels.add(new PlacesModel("Great Sphinx of Giza",
                    "The Great Sphinx of Giza, commonly referred to as the Sphinx of Giza or just the Sphinx, is a limestone statue of a reclining sphinx, a mythical creature with the body of a lion and the head of a human. ",
                    "geo:29.9753,31.1376?q=Great Sphinx of Giza", R.drawable.great_sphinx));
            placesModels.add(new PlacesModel("Manial Palace",
                    "The Manial Palace and Museum, is a former Alawiyya dynasty era palace and grounds on Rhoda Island on the Nile. It is located in the Sharia Al-Saray area in the El-Manial district of southern Cairo, Egypt.",
                    "geo:30.0274,31.2268?q=Manial Palace", R.drawable.manial_palace));
            placesModels.add(new PlacesModel("Giza Zoo",
                    "The Giza Zoo is a zoological garden in Giza, Egypt. It is one of the few green areas in the city, and includes Giza's largest park. The zoo covers about 80 acres, and is home to many endangered species, as well as a selection of endemic fauna.",
                    "geo:30.0279,31.2138?q=Giza Zoo", R.drawable.giza_zoo));
            placesModels.add(new PlacesModel("Mosque of Amr ibn al-As",
                    "The Mosque of Amr ibn al-As, also called the Mosque of Amr, was originally built in 641–642 AD, as the center of the newly founded capital of Egypt, Fustat. The original structure was the first mosque ever built in Egypt and the whole of Africa.",
                    "geo:30.0101,31.2309?q=Mosque of Amr ibn al-As", R.drawable.mosque_of_amr));
            return placesModels;
        } else if (i == 2) {
            placesModels.add(new PlacesModel("Blue Hole",
                    "The Blue Hole is a diving location on the southeast Sinai, a few kilometres north of Dahab, Egypt on the coast of the Red Sea. The Blue Hole is a submarine sinkhole, with a maximum depth within the hole of just over 100 m.",
                    "geo:28.5722,34.5351?q=28.5722,34.5351+Blue Hole", R.drawable.blue_hole));
            placesModels.add(new PlacesModel("Lagon Beach",
                    "diving location on the southeast Sinai.",
                    "geo:28.4732,34.5048?q=Lagon Beach", R.drawable.lagon));
            return placesModels;
        } else if (i == 3) {
            placesModels.add(new PlacesModel("Nubian Museum",
                    "The Nubian Museum is an archaeological museum located in Aswan, Upper Egypt. It was built to a design by architect Mahmoud El-Hakim for an estimated construction cost of LE 75 million.",
                    "geo:28.4732,34.5048?q=Nubian Museum", R.drawable.nubian_museum));
            placesModels.add(new PlacesModel("El Nabatat Island",
                    "El Nabatat Island or Kitchener's Island, is a small, oval-shaped island in the Nile at Aswan, Egypt. It is less than a kilometer long and its width is less than ½ a kilometer. The Aswan Botanical Garden is located on the island.",
                    "geo:24.0999,32.8745?q=El Nabatat Island", R.drawable.nabatat));
            placesModels.add(new PlacesModel("Aswan Museum",
                    "Aswan Museum is a museum in Elephantine, located on the south-eastern side of Aswan, Egypt. It opened to the public in 1912. The museum features artefacts from Nubia, which were housed there during the construction of the Aswan Dam.",
                    "geo:24.0850,32.8847?q=Aswan Museum", R.drawable.aswan_temple));
            placesModels.add(new PlacesModel("Philae",
                    "Philae is an island in the reservoir of the Aswan Low Dam, downstream of the Aswan Dam and Lake Nasser, Egypt. Philae was originally located near the expansive First Cataract of the Nile in Upper Egypt and was the site of an Egyptian temple complex.",
                    "geo:24.0133,32.8678?q=Philae", R.drawable.phiala));
            placesModels.add(new PlacesModel("Agilkia Island",
                    "Agilkia Island is an island in the reservoir of the Old Aswan Dam along the Nile River in southern Egypt; it is the present site of the relocated Ancient Egyptian temple complex of Philae.",
                    "geo:24.0254,32.8830?q=Agilkia Island", R.drawable.agikia));
            return placesModels;
        } else if (i == 4) {
            placesModels.add(new PlacesModel("Golden Coast Resort",
                    "",
                    "geo:29.5059,32.4044?q=Golden Coast Resort", R.drawable.golden_coast_resort));
            return placesModels;
        } else if (i == 5) {
            placesModels.add(new PlacesModel("Naama Bay",
                    "Naama Bay is a natural bay in Sharm El Sheikh resort and is considered the main hub for tourists in the city, as it is famous for its cafes, restaurants, hotels, and bazaars.",
                    "geo:27.9103,34.3288?q=Naama Bay", R.drawable.naama));
            placesModels.add(new PlacesModel("Ras Muhammad National Park",
                    "Ras Mohammad is a national park in Egypt at the southern extreme of the Sinai Peninsula, overlooking the Gulf of Suez on the west and the Gulf of Aqaba to the east.",
                    "geo:27.7420,34.2325?q=Ras Muhammad National Park", R.drawable.ras_muhammad));
            placesModels.add(new PlacesModel("Tiran Island",
                    "Tiran and Yotvat Island, is an island within the maritime borders of Saudi Arabia that was administered by Egypt in the past. However, sovereignty of the two Red Sea islands, Tiran and Sanafir, was ceded officially to Saudi Arabia as part of a maritime borders agreement between Egypt and Saudi Arabia.",
                    "geo:27.9628,34.4889?q=Tiran Island", R.drawable.tiran_island));
            placesModels.add(new PlacesModel("Nabq Protected Area",
                    "NABQ Protected Area is a 600 km² protected area located in the Egypt, South Sinai Governorate.",
                    "geo:28.1200,34.4404?q=Nabq Protected Area", R.drawable.nabq_protected));
            placesModels.add(new PlacesModel("Mount Sinai",
                    "Mount Sinai, also known as Mount Horeb and Mountain of Moses, is a mountain in the Sinai Peninsula of Egypt that is a possible location of the biblical Mount Sinai, which is considered a holy site by the Abrahamic religions.",
                    "geo:28.5395,33.9709?q=Mount Sinai", R.drawable.mount_sinai));
            return placesModels;
        } else if (i == 6) {
            placesModels.add(new PlacesModel("Rommel Beach",
                    "",
                    "geo:31.3656,27.2444?q=Rommel Beach", R.drawable.rommel_beach));
            placesModels.add(new PlacesModel("El Gharam Beach",
                    "",
                    "geo:31.3683,27.2199?q=El Gharam Beach", R.drawable.gharam_beach));
            placesModels.add(new PlacesModel("Cleopatra Beach",
                    "",
                    "geo:31.3722,27.1944?q=Cleopatra Beach", R.drawable.cleopatra_beach));
            placesModels.add(new PlacesModel("Andalosia Village",
                    "",
                    "geo:31.3627,27.2860?q=Andalosia Village", R.drawable.andalosia_village));
            placesModels.add(new PlacesModel("Al Awam Beach",
                    "",
                    "geo:31.3576,27.2282?q=Al Awam Beach", R.drawable.al_awam_beach));
            return placesModels;
        } else if (i == 7) {
            placesModels.add(new PlacesModel("Hurghada Grand Aquarium",
                    "Hurghada Aquarium is an aquarium located in Hurghada, Red Sea Governorate, Egypt. It opened in January 2015, and contains nearly 1 million gallons in tank space. It is home to over 1200 individual animals, and 100 species.",
                    "geo:27.1343,33.8199?q=Hurghada Grand Aquarium", R.drawable.hurghada_grand));
            placesModels.add(new PlacesModel("Sand City Hurghada",
                    "Open-air museum featuring numerous historical & imaginative sand sculptures by global artists.",
                    "geo:27.0993,33.8208?q=Sand City Hurghada", R.drawable.sand_city_hurghada));
            placesModels.add(new PlacesModel("Giftun Island",
                    "Island with white sandy beaches surrounded by coral reefs known for snorkeling & dolphin spotting.",
                    "geo:27.2237,33.8580?q=Giftun Island", R.drawable.giftun_island));
            placesModels.add(new PlacesModel("Dolphin World",
                    " Visitors can see choreographed shows & swim with dolphins at this modern attraction.",
                    "geo:26.9776,33.8437?q=Dolphin World", R.drawable.dolphin_world));

           return placesModels;
        }else if (i == 8) {
            placesModels.add(new PlacesModel("Medinet Habu",
                    "The Mortuary Temple of Ramesses III at Medinet Habu was an important New Kingdom period temple structure in the West Bank of Luxor in Egypt.",
                    "geo:25.7193,32.5991?q=Medinet Habu", R.drawable.habu_temple));
            placesModels.add(new PlacesModel("Karnak",
                    "The Karnak Temple Complex, commonly known as Karnak, comprises a vast mix of decayed temples, chapels, pylons, and other buildings near Luxor, in Egypt.",
                    "geo:25.7192,32.5312?q=Karnak", R.drawable.karnak));
            placesModels.add(new PlacesModel("Valley of the Kings",
                    "The Valley of the Kings, also known as the Valley of the Gates of the Kings, is a valley in Egypt where, for a period of nearly 500 years from the 16th to 11th century BC, rock cut tombs were excavated for the pharaohs and powerful nobles of the New Kingdom.",
                    "geo:25.7425,32.5972?q=Valley of the Kings", R.drawable.vally_of_kings));
            placesModels.add(new PlacesModel("Luxor Temple",
                    "Luxor Temple is a large Ancient Egyptian temple complex located on the east bank of the Nile River in the city today known as Luxor and was constructed approximately 1400 BCE. In the Egyptian language it is known as ipet resyt, \"the southern sanctuary",
                    "geo:25.6995,32.6368?q=Luxor Temple", R.drawable.luxor_temple));
            placesModels.add(new PlacesModel("Temple of Hatshepsut",
                    "The Mortuary Temple of Hatshepsut, also known as the Djeser-Djeseru, is a mortuary temple of Ancient Egypt located in Upper Egypt. Built for the Eighteenth Dynasty pharaoh Hatshepsut, it is located beneath the cliffs at Deir el-Bahari on the west bank of the Nile near the Valley of the Kings.",
                    "geo:25.7379,32.6063?q=Mortuary Temple of Hatshepsut", R.drawable.temple_of_hatshepsut));
            return placesModels;
        } else {
            placesModels.add(new PlacesModel("Citadel of Qaitbay",
                    "The Citadel of Qaitbay is a 15th-century defensive fortress located on the Mediterranean sea coast, in Alexandria, Egypt. It was established in 1477 AD by Sultan Al-Ashraf Sayf al-Din Qa'it Bay. ",
                    "geo:31.2140,29.8834?q=Citadel of Qaitbay", R.drawable.citadel_of_qaitbay));
            placesModels.add(new PlacesModel("Montaza Palace",
                    "Montaza Palace is a palace, museum and extensive gardens in the Montaza district of Alexandria, Egypt. It was built on a low plateau east of central Alexandria overlooking a beach on the Mediterranean Sea.",
                    "geo:31.2884,30.0137?q=Montaza Palace", R.drawable.montaza_palace));
            placesModels.add(new PlacesModel("Alexandria National Museum",
                    "The Alexandria National Museum is a museum in Alexandria, Egypt. it is located in a renovated Italian style palace in Tariq Al-Horreya Street. The building used to be home to the United States consulate.",
                    "geo:31.2006,29.9110?q=Alexandria National Museum", R.drawable.alexandria_national_museum));
            placesModels.add(new PlacesModel("Alexandria Port",
                    "The Port of Alexandria is on the West Verge of the Nile Delta between the Mediterranean Sea and Mariut Lake in Alexandria, Egypt and is considered the second most important city and the main port in Egypt. ",
                    "geo:31.1745,29.8466?q=Alexandria Port", R.drawable.alexandria_port));
            placesModels.add(new PlacesModel("Corniche",
                    "The Corniche is a waterfront promenade corniche in Alexandria, Egypt, running along the Eastern Harbour. It is one of the major corridors for traffic in Alexandria.",
                    "geo:31.2103,29.9022?q=Corniche", R.drawable.corniche));
            return placesModels;
        }

    }

}

