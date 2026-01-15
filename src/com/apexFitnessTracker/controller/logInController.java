package com.ApexFitnessTracker.controller;

import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class LogInController {

	// ----- Navigation Buttons -----
	@FXML private Button logInBtn;
	@FXML private Hyperlink signUpLnk;
	
	// ----- Log In Input Fields -----
	@FXML private TextField emailTxtFld;
	@FXML private TextField passwordTxtFld;

	// ----- Navigation Button Event Handlers -----
	@FXML
	void onLogInBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.HOME);
	}

	@FXML
	void onSignUpLnk(ActionEvent event) {
		SceneSwitcher.load(event, View.SIGNUP);
	}
}
