package com.example.tourguide;

public class PlacesModel {
    private String nameOfPlace, desc, MapLocation;
    private int imageResource;

    public PlacesModel(String nameOfPlace, String desc, String mapLocation, int imageResource) {
        this.nameOfPlace = nameOfPlace;
        this.desc = desc;
        MapLocation = mapLocation;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public String getDesc() {
        return desc;
    }

    public String getMapLocation() {
        return MapLocation;
    }

    @Override
    public String toString() {
        return "PlacesModel{" +
                "nameOfPlace='" + nameOfPlace + '\'' +
                ", desc='" + desc + '\'' +
                ", MapLocation='" + MapLocation + '\'' +
                '}';
    }
}
