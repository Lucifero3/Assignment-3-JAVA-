package com.example.assignment2.models;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenHouse {
    public String __typename;
    public Date start_date;
    public Date end_date;
    public String description;
    public String time_zone;
}