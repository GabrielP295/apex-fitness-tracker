package com.apexfitnesstracker.controller;

import com.apexfitnesstracker.navigation.View;
import com.apexfitnesstracker.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProfileController {

	// ----- Navigation Buttons ------
	@FXML private Button bodyBtn;
	@FXML private Button graphBtn;
	@FXML private Button historyBtn;
	@FXML private Button homeBtn;
	@FXML private Button libraryBtn;
	@FXML private Button logOutBtn;

    @FXML
    void onBodyBtn(ActionEvent event) {
    	SceneSwitcher.load(event, View.BODY);
    }

    @FXML
    void onGraphBtn(ActionEvent event) { 
    	SceneSwitcher.load(event, View.GRAPHS); 
    }

    @FXML
    void onHistoryBtn(ActionEvent event) {
    	SceneSwitcher.load(event, View.HISTORY);
    }

    @FXML
    void onLibraryBtn(ActionEvent event) {
    	SceneSwitcher.load(event, View.LIBRARY);
    }

    @FXML
    void onLogWorkoutBtn(ActionEvent event) {
    	SceneSwitcher.load(event, View.WORKOUTLOGGER);
    }

    @FXML
    void onProfileBtn(ActionEvent event) {
    	SceneSwitcher.load(event, View.PROFILE);
    }
}
