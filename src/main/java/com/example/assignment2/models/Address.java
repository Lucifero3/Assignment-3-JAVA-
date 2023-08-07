package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    public String __typename;
    public String city;
    public String line;
    public String street_name;
    public String street_number;
    public String street_suffix;
    public String country;
    public String postal_code;
    public String state_code;
    public String state;
    public Coordinate coordinate;
}