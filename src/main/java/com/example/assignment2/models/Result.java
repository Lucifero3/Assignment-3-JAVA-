package com.example.assignment2.models;

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    public String __typename;
    public String property_id;
    public String listing_id;
    public Integer plan_id;
    public String status;
    public Integer photo_count;
    public ArrayList<Branding> branding;
    public Location location;
    public ArrayList<OpenHouse> open_houses;
    public Description description;
    public ArrayList<VirtualTour> virtual_tours;
    public Boolean matterport;
    public ArrayList<Advertiser> advertisers;
    public Flags flags;
    public Source source;
    public PetPolicy pet_policy;
    public String community;
    public PrimaryPhoto primary_photo;
    public String href;
    public Integer list_price;
    public Integer list_price_min;
    public Integer list_price_max;
    public Integer price_reduced_amount;
    public Estimate estimate;
    public LeadAttributes lead_attributes;
    public String last_sold_date;
    public Date list_date;
    public Products products;
    public Integer last_sold_price;
}
