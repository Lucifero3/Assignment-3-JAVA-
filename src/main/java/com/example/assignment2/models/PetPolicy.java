package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetPolicy {
    public String __typename;
    public Boolean cats;
    public Boolean dogs;
}
