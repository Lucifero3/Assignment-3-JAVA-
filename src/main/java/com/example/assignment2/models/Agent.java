package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent {
    public String __typename;
    public String id;
    public String agent_id;
    public String agent_name;
    public String office_id;
    public String office_name;
}
