module com.example.assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires com.google.gson;
    requires unirest.java;

    opens com.example.assignment2 to javafx.fxml;
    exports com.example.assignment2;
    exports com.example.assignment2.controllers;
    exports com.example.assignment2.models;
}