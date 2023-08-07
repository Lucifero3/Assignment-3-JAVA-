package com.example.assignment2.models;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {
    public String __typename;
    public String brand_name;
    public ArrayList<String> products;
}
