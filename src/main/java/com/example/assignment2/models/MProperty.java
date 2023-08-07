package com.example.assignment2.models;

public class MProperty {
    private String id;

    private String lane;
    private String city;
    private String country;
    private boolean cats;
    private boolean dogs;
    private long listedPrice;
    private long estimatedPrice;
    private long soldPrice;

    public MProperty(String id, String lane, String city, String country, boolean cats, boolean dogs, long listedPrice, long estimatedPrice, long soldPrice) {
        this.id = id;
        this.lane = lane;
        this.city = city;
        this.country = country;
        this.cats = cats;
        this.dogs = dogs;
        this.listedPrice = listedPrice;
        this.estimatedPrice = estimatedPrice;
        this.soldPrice = soldPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isCats() {
        return cats;
    }

    public void setCats(boolean cats) {
        this.cats = cats;
    }

    public boolean isDogs() {
        return dogs;
    }

    public void setDogs(boolean dogs) {
        this.dogs = dogs;
    }

    public long getListedPrice() {
        return listedPrice;
    }

    public void setListedPrice(long listedPrice) {
        this.listedPrice = listedPrice;
    }

    public long getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(long estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public long getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(long soldPrice) {
        this.soldPrice = soldPrice;
    }
}
