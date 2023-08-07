package com.example.assignment2.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeadAttributes {
    public String __typename;
    public String lead_type;
    public Boolean show_contact_an_agent;
    public OpcityLeadAttributes opcity_lead_attributes;
}
