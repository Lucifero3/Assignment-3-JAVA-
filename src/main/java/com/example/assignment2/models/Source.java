package com.example.assignment2.models;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {
    public String __typename;
    public ArrayList<Agent> agents;
    public String id;
    public String type;
    public Integer spec_id;
    public Integer plan_id;
    public String listing_href;
    public String listing_id;
}
