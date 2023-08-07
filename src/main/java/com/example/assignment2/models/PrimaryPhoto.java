package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimaryPhoto {
    public String __typename;
    public String href;
}
