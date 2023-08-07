package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Advertiser {
    public String __typename;
    public String fulfillment_id;
    public String name;
    public String email;
    public String href;
    public String slogan;
    public String type;
}
