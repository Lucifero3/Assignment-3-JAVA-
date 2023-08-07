package com.example.assignment2.models;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HomeSearch {

    public String __typename;
    public Integer count;
    public Integer total;
    public ArrayList<Result> results;
}
