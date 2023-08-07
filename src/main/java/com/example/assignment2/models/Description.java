package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Description {
    public String __typename;
    public String sub_type;
    public String type;
    public Integer beds;
    public Integer baths;
    public Integer lot_sqft;
    public Integer sqft;
    public Integer beds_max;
    public Integer beds_min;
    public Double sqft_max;
    public Double sqft_min;
    public Integer baths_full;
    public Integer baths_half;
    public Integer baths_min;
    public Integer baths_max;
    public Integer baths_full_calc;
}