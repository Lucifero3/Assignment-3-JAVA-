package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coordinate {
    public String __typename;
    public Double lat;
    public Double lon;
    public Double accuracy;
}