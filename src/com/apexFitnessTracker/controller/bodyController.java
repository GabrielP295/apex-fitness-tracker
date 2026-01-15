package com.ApexFitnessTracker.controller;

import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BodyController {

	// ----- Navigation Buttons -----
	@FXML private Button graphBtn;
	@FXML private Button historyBtn;
	@FXML private Button homeBtn;
	@FXML private Button libraryBtn;
	@FXML private Button logWorkoutBtn;
	@FXML private Button profileBtn;

	@FXML
	void onHomeBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.HOME);
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
