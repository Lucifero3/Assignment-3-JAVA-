package com.example.assignment2.services;

import com.example.assignment2.models.Schema;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class NetworkManager {
    private static NetworkManager instance;

    private NetworkManager() {
        Unirest.setObjectMapper(new ObjectMapper() {
            com.fasterxml.jackson.databind.ObjectMapper mapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();
            public String writeValue(Object value) {
                try {
                    return mapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return mapper.readValue(value, valueType);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static NetworkManager getInstance() {
        if (instance == null) {
            instance = new NetworkManager();
        }

        return instance;
    }

    public Schema getPropertyForSale(int postalCode) throws UnirestException {
        return Unirest.post("https://realty-in-us.p.rapidapi.com/properties/v3/list")
                .header("content-type", "application/json")
                .header("X-RapidAPI-Key", "41b38a977emshb3359eac5d31b24p1867dajsna2b25520b5bb")
                .header("X-RapidAPI-Host", "realty-in-us.p.rapidapi.com")
                .body("{\n    \"limit\": 200,\n    \"offset\": 0,\n    \"postal_code\": \""+ String.valueOf(postalCode) +"\",\n    \"status\": [\n        \"for_sale\",\n        \"ready_to_build\"\n    ],\n    \"sort\": {\n        \"direction\": \"desc\",\n        \"field\": \"list_date\"\n    }\n}")
                .asObject(Schema.class)
                .getBody();
    }
}
