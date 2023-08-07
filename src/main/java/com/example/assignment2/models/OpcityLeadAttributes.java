package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpcityLeadAttributes {
    public String __typename;
    public Boolean flip_the_market_enabled;
}
