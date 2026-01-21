package com.ApexFitnessTracker.controller;

import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class HistoryController {

	// ----- Navigation Buttons -----
	@FXML private Button bodyBtn;
	@FXML private Button graphBtn;
	@FXML private Button homeBtn;
	@FXML private Button libraryBtn;
	@FXML private Button logWorkoutBtn;
	@FXML private Button profileBtn;
	
	// ----- Workout Container UI -----
	@FXML private Label workoutNameLbl;
	@FXML private Label dateTimeLbl;
	@FXML private Label lengthLbl;
	@FXML private Label volumeLbl;
	@FXML private Label prLbl;
	@FXML private TitledPane exerciseTitledPane;
	
	// ----- Other UI -----
	@FXML private DatePicker datePickerFld;
	@FXML private VBox workoutContainer;
	

	@FXML
	void onBodyBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.BODY);
	}

	@FXML
	void onGraphBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.GRAPHS);
	}

	@FXML
	void onHomeBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.HOME);
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
