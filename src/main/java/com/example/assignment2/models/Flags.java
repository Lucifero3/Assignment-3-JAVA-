package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flags {
    public String __typename;
    public Boolean is_price_reduced;
    public Boolean is_new_construction;
    public Boolean is_foreclosure;
    public Boolean is_plan;
    public Boolean is_new_listing;
    public Boolean is_coming_soon;
    public Boolean is_contingent;
    public Boolean is_pending;
}
