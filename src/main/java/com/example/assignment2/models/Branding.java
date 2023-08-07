package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Branding {
    public String __typename;
    public String photo;
    public String name;
    public String phone;
    public String link;
}