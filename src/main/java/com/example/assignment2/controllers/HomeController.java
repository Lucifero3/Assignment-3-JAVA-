package com.example.assignment2.controllers;

import com.example.assignment2.models.MProperty;
import com.example.assignment2.models.Result;
import com.example.assignment2.models.Schema;
import com.example.assignment2.services.NetworkManager;
import com.mashape.unirest.http.exceptions.UnirestException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    public TextField postalCodeField;

    @FXML
    public Label resultCount;

    @FXML
    public Button searchButton;

    @FXML
    public TableView<MProperty> tableView;

    @FXML
    public TableColumn propertyID;

    @FXML
    public TableColumn lane;

    @FXML
    public TableColumn city;

    @FXML
    public TableColumn country;

    @FXML
    public TableColumn cats;

    @FXML
    public TableColumn dogs;

    @FXML
    public TableColumn listedPrice;

    @FXML
    public TableColumn estimatedPrice;

    @FXML
    public TableColumn soldPrice;

    ObservableList<MProperty> properties = null;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        propertyID.setCellValueFactory(new PropertyValueFactory<>("id"));
        lane.setCellValueFactory(new PropertyValueFactory<>("lane"));
        city.setCellValueFactory(new PropertyValueFactory<>("city"));
        country.setCellValueFactory(new PropertyValueFactory<>("country"));
        cats.setCellValueFactory(new PropertyValueFactory<>("cats"));
        dogs.setCellValueFactory(new PropertyValueFactory<>("dogs"));
        listedPrice.setCellValueFactory(new PropertyValueFactory<>("listedPrice"));
        estimatedPrice.setCellValueFactory(new PropertyValueFactory<>("estimatedPrice"));
        soldPrice.setCellValueFactory(new PropertyValueFactory<>("soldPrice"));
    }

    @FXML
    public void onSearchClicked(ActionEvent event) {
        int postalCode = 0;
        try {
            postalCode = Integer.parseInt(postalCodeField.getText());
            Schema schema = NetworkManager
                    .getInstance()
                    .getPropertyForSale(postalCode);

            if (schema == null) {
                resultCount.setText("0");
                postalCodeField.setText("");
                Alert errorAlert = new Alert(Alert.AlertType.INFORMATION);
                errorAlert.setContentText("Unable to get data");
                errorAlert.showAndWait();
            } else {
                ArrayList<MProperty> mappedProperties = new ArrayList<>();

                for (Result result: schema.data.home_search.results) {
                    mappedProperties.add(new MProperty(
                            result.property_id,
                            result.location.address.line,
                            result.location.address.city,
                            result.location.address.country,
                            result.pet_policy == null ? false : result.pet_policy.cats,
                            result.pet_policy == null ? false : result.pet_policy.dogs,
                            result.list_price,
                            result.estimate == null ? 0 : result.estimate.estimate,
                            result.last_sold_price == null ? 0 : result.last_sold_price
                    ));
                }

                properties = FXCollections.observableList(mappedProperties);
                tableView.setItems(properties);
                postalCodeField.setText("");
                resultCount.setText(schema.data.home_search.count.toString());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            searchButton.setDisable(false);
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Error");
            errorAlert.setContentText("Please enter valid Postal code");
            errorAlert.showAndWait();
        } catch (UnirestException e) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Error");
            errorAlert.setContentText("Error occured in request.");
            errorAlert.showAndWait();
            throw new RuntimeException(e);
        }
    }
}
