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
                    "geo:29.9772962,31.1303068?q=29.9772962,31.1303068+Giza Necropolis", R.drawable.giza_necropolis));
            placesModels.add(new PlacesModel("Great Sphinx of Giza",
                    "The Great Sphinx of Giza, commonly referred to as the Sphinx of Giza or just the Sphinx, is a limestone statue of a reclining sphinx, a mythical creature with the body of a lion and the head of a human. ",
                    "geo:29.9752687,31.1353787?q=29.9752687,31.1353787+Great Sphinx of Giza", R.drawable.great_sphinx));
            placesModels.add(new PlacesModel("Manial Palace",
                    "The Manial Palace and Museum, is a former Alawiyya dynasty era palace and grounds on Rhoda Island on the Nile. It is located in the Sharia Al-Saray area in the El-Manial district of southern Cairo, Egypt.",
                    "geo:30.0274437,31.2267897?q=30.0274437,31.2267897+Manial Palace", R.drawable.manial_palace));
            placesModels.add(new PlacesModel("Giza Zoo",
                    "The Giza Zoo is a zoological garden in Giza, Egypt. It is one of the few green areas in the city, and includes Giza's largest park. The zoo covers about 80 acres, and is home to many endangered species, as well as a selection of endemic fauna.",
                    "geo:30.02795,31.2137799?q=30.02795,31.2137799+Giza Zoo", R.drawable.giza_zoo));
            placesModels.add(new PlacesModel("Mosque of Amr ibn al-As",
                    "The Mosque of Amr ibn al-As, also called the Mosque of Amr, was originally built in 641–642 AD, as the center of the newly founded capital of Egypt, Fustat. The original structure was the first mosque ever built in Egypt and the whole of Africa.",
                    "geo:30.0101215,31.2309481?q=30.0101215,31.2309481+Mosque of Amr ibn al-As", R.drawable.mosque_of_amr));
            return placesModels;
        } else if (i == 2) {
            placesModels.add(new PlacesModel("Blue Hole",
                    "The Blue Hole is a diving location on the southeast Sinai, a few kilometres north of Dahab, Egypt on the coast of the Red Sea. The Blue Hole is a submarine sinkhole, with a maximum depth within the hole of just over 100 m.",
                    "geo:28.5722676,34.535122?q=28.5722676,34.535122+Blue Hole", R.drawable.blue_hole));
            placesModels.add(new PlacesModel("Lagon Beach",
                    "diving location on the southeast Sinai.",
                    "geo:28.4732417,34.5048403?q=28.4732417,34.5048403+Lagon Beach", R.drawable.lagon));
            return placesModels;
        } else if (i == 3) {
            placesModels.add(new PlacesModel("Nubian Museum",
                    "The Nubian Museum is an archaeological museum located in Aswan, Upper Egypt. It was built to a design by architect Mahmoud El-Hakim for an estimated construction cost of LE 75 million.",
                    "geo:28.4732417,34.5048403?q=28.4732417,34.5048403+Nubian Museum", R.drawable.nubian_museum));
            placesModels.add(new PlacesModel("El Nabatat Island",
                    "El Nabatat Island or Kitchener's Island, is a small, oval-shaped island in the Nile at Aswan, Egypt. It is less than a kilometer long and its width is less than ½ a kilometer. The Aswan Botanical Garden is located on the island.",
                    "geo:24.0999994,32.8745785?q=24.0999994,32.8745785+El Nabatat Island", R.drawable.nabatat));
            placesModels.add(new PlacesModel("Aswan Museum",
                    "Aswan Museum is a museum in Elephantine, located on the south-eastern side of Aswan, Egypt. It opened to the public in 1912. The museum features artefacts from Nubia, which were housed there during the construction of the Aswan Dam.",
                    "geo:24.0850074,32.8847928?q=24.0850074,32.8847928+Aswan Museum", R.drawable.aswan_temple));
            placesModels.add(new PlacesModel("Philae",
                    "Philae is an island in the reservoir of the Aswan Low Dam, downstream of the Aswan Dam and Lake Nasser, Egypt. Philae was originally located near the expansive First Cataract of the Nile in Upper Egypt and was the site of an Egyptian temple complex.",
                    "geo:24.013393,32.8678317?q=24.013393,32.8678317+Philae", R.drawable.phiala));
            placesModels.add(new PlacesModel("Agilkia Island",
                    "Agilkia Island is an island in the reservoir of the Old Aswan Dam along the Nile River in southern Egypt; it is the present site of the relocated Ancient Egyptian temple complex of Philae.",
                    "geo:24.0254387,32.8830913?q=24.0254387,32.8830913+Agilkia Island", R.drawable.agikia));
            return placesModels;
        } else if (i == 4) {
            placesModels.add(new PlacesModel("Golden Coast Resort",
                    "",
                    "geo:29.5059239,32.4044162?q=29.5059239,32.4044162+Golden Coast Resort", R.drawable.golden_coast_resort));
            return placesModels;
        } else if (i == 5) {
            placesModels.add(new PlacesModel("Naama Bay",
                    "Naama Bay is a natural bay in Sharm El Sheikh resort and is considered the main hub for tourists in the city, as it is famous for its cafes, restaurants, hotels, and bazaars.",
                    "geo:27.9103183,34.3288344?q=27.9103183,34.3288344+Naama Bay", R.drawable.naama));
            placesModels.add(new PlacesModel("Ras Muhammad National Park",
                    "Ras Mohammad is a national park in Egypt at the southern extreme of the Sinai Peninsula, overlooking the Gulf of Suez on the west and the Gulf of Aqaba to the east.",
                    "geo:27.7420043,34.2325856?q=27.7420043,34.2325856+Ras Muhammad National Park", R.drawable.ras_muhammad));
            placesModels.add(new PlacesModel("Tiran Island",
                    "Tiran and Yotvat Island, is an island within the maritime borders of Saudi Arabia that was administered by Egypt in the past. However, sovereignty of the two Red Sea islands, Tiran and Sanafir, was ceded officially to Saudi Arabia as part of a maritime borders agreement between Egypt and Saudi Arabia.",
                    "geo:27.962853.4889017?q=27.962853.4889017+Tiran Island", R.drawable.tiran_island));
            placesModels.add(new PlacesModel("Nabq Protected Area",
                    "NABQ Protected Area is a 600 km² protected area located in the Egypt, South Sinai Governorate.",
                    "geo:28.1200661,34.4404821?q=28.1200661,34.4404821+Nabq Protected Area", R.drawable.nabq_protected));
            placesModels.add(new PlacesModel("Mount Sinai",
                    "Mount Sinai, also known as Mount Horeb and Mountain of Moses, is a mountain in the Sinai Peninsula of Egypt that is a possible location of the biblical Mount Sinai, which is considered a holy site by the Abrahamic religions.",
                    "geo:28.5395147,33.9709379?q=28.5395147,33.9709379+Mount Sinai", R.drawable.mount_sinai));
            return placesModels;
        } else if (i == 6) {
            placesModels.add(new PlacesModel("Rommel Beach",
                    "",
                    "geo:31.3656864,27.2444365?q=31.3656864,27.2444365+Rommel Beach", R.drawable.rommel_beach));
            placesModels.add(new PlacesModel("El Gharam Beach",
                    "",
                    "geo:31.3683364,27.2199583?q=31.3683364,27.2199583+El Gharam Beach", R.drawable.gharam_beach));
            placesModels.add(new PlacesModel("Cleopatra Beach",
                    "",
                    "geo:31.3722201,27.1944156?q=31.3722201,27.1944156+Cleopatra Beach", R.drawable.cleopatra_beach));
            placesModels.add(new PlacesModel("Andalosia Village",
                    "",
                    "geo:31.3627357,27.2860879,17?q=31.3627357,27.2860879,17+Andalosia Village", R.drawable.andalosia_village));
            placesModels.add(new PlacesModel("Al Awam Beach",
                    "",
                    "geo:31.3576224,27.2282356?q=31.3576224,27.2282356+Al Awam Beach", R.drawable.al_awam_beach));
            return placesModels;
        } else if (i == 7) {
            placesModels.add(new PlacesModel("Hurghada Grand Aquarium",
                    "Hurghada Aquarium is an aquarium located in Hurghada, Red Sea Governorate, Egypt. It opened in January 2015, and contains nearly 1 million gallons in tank space. It is home to over 1200 individual animals, and 100 species.",
                    "geo:27.1343106,33.8199933?q=27.1343106,33.8199933+Hurghada Grand Aquarium", R.drawable.hurghada_grand));
            placesModels.add(new PlacesModel("Sand City Hurghada",
                    "Open-air museum featuring numerous historical & imaginative sand sculptures by global artists.",
                    "geo:27.0993045,33.8208747?q=27.0993045,33.8208747+Sand City Hurghada", R.drawable.sand_city_hurghada));
            placesModels.add(new PlacesModel("Giftun Island",
                    "Island with white sandy beaches surrounded by coral reefs known for snorkeling & dolphin spotting.",
                    "geo:27.2237062,33.8580323?q=27.2237062,33.8580323+Giftun Island", R.drawable.giftun_island));
            placesModels.add(new PlacesModel("Dolphin World",
                    " Visitors can see choreographed shows & swim with dolphins at this modern attraction.",
                    "geo:26.97761,33.843704?q=26.97761,33.843704+Dolphin World", R.drawable.dolphin_world));

           return placesModels;
        }else if (i == 8) {
            placesModels.add(new PlacesModel("Medinet Habu",
                    "The Mortuary Temple of Ramesses III at Medinet Habu was an important New Kingdom period temple structure in the West Bank of Luxor in Egypt.",
                    "geo:25.7193,32.5991?q=25.7193,32.5991+Medinet Habu", R.drawable.habu_temple));
            placesModels.add(new PlacesModel("Karnak",
                    "The Karnak Temple Complex, commonly known as Karnak, comprises a vast mix of decayed temples, chapels, pylons, and other buildings near Luxor, in Egypt.",
                    "geo:25.7192963,32.5312991?q=25.7192963,32.5312991+Karnak", R.drawable.karnak));
            placesModels.add(new PlacesModel("Valley of the Kings",
                    "The Valley of the Kings, also known as the Valley of the Gates of the Kings, is a valley in Egypt where, for a period of nearly 500 years from the 16th to 11th century BC, rock cut tombs were excavated for the pharaohs and powerful nobles of the New Kingdom.",
                    "geo:25.74258,32.5972163?q=25.74258,32.5972163+Valley of the Kings", R.drawable.vally_of_kings));
            placesModels.add(new PlacesModel("Luxor Temple",
                    "Luxor Temple is a large Ancient Egyptian temple complex located on the east bank of the Nile River in the city today known as Luxor and was constructed approximately 1400 BCE. In the Egyptian language it is known as ipet resyt, \"the southern sanctuary",
                    "geo:25.699502,32.6368622?q=25.699502,32.6368622+Luxor Temple", R.drawable.luxor_temple));
            placesModels.add(new PlacesModel("Temple of Hatshepsut",
                    "The Mortuary Temple of Hatshepsut, also known as the Djeser-Djeseru, is a mortuary temple of Ancient Egypt located in Upper Egypt. Built for the Eighteenth Dynasty pharaoh Hatshepsut, it is located beneath the cliffs at Deir el-Bahari on the west bank of the Nile near the Valley of the Kings.",
                    "geo:25.737976,32.6063226?q=25.737976,32.6063226+Mortuary Temple of Hatshepsut", R.drawable.temple_of_hatshepsut));
            return placesModels;
        } else {
            placesModels.add(new PlacesModel("Citadel of Qaitbay",
                    "The Citadel of Qaitbay is a 15th-century defensive fortress located on the Mediterranean sea coast, in Alexandria, Egypt. It was established in 1477 AD by Sultan Al-Ashraf Sayf al-Din Qa'it Bay. ",
                    "geo:31.214011,29.8834496?q=31.214011,29.8834496+Citadel of Qaitbay", R.drawable.citadel_of_qaitbay));
            placesModels.add(new PlacesModel("Montaza Palace",
                    "Montaza Palace is a palace, museum and extensive gardens in the Montaza district of Alexandria, Egypt. It was built on a low plateau east of central Alexandria overlooking a beach on the Mediterranean Sea.",
                    "geo:31.2884954,30.0137805?q=31.2884954,30.0137805+Montaza Palace", R.drawable.montaza_palace));
            placesModels.add(new PlacesModel("Alexandria National Museum",
                    "The Alexandria National Museum is a museum in Alexandria, Egypt. it is located in a renovated Italian style palace in Tariq Al-Horreya Street. The building used to be home to the United States consulate.",
                    "geo:31.200684,29.911034?q=31.200684,29.911034+Alexandria National Museum", R.drawable.alexandria_national_museum));
            placesModels.add(new PlacesModel("Alexandria Port",
                    "The Port of Alexandria is on the West Verge of the Nile Delta between the Mediterranean Sea and Mariut Lake in Alexandria, Egypt and is considered the second most important city and the main port in Egypt. ",
                    "geo:31.1745136,29.8466527?q=31.1745136,29.8466527,14+Alexandria Port", R.drawable.alexandria_port));
            placesModels.add(new PlacesModel("Corniche",
                    "The Corniche is a waterfront promenade corniche in Alexandria, Egypt, running along the Eastern Harbour. It is one of the major corridors for traffic in Alexandria.",
                    "geo:31.2103627,29.902245?q=25.737976,32.6063226+Corniche", R.drawable.corniche));
            return placesModels;
        }

    }

}

