package com.ApexFitnessTracker.controller;

import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class SignUpController {

	// ----- Navigation Input Fields -----
	@FXML private TextField emailTxtFld;
	@FXML private TextField passwordTxtFld;

	// ----- Sign Up Input Fields -----
	@FXML private Hyperlink logInLnk;
	@FXML private Button signUpBtn;

	// ----- Navigation Button Event Handlers ------
	@FXML
	void onLogInLnk(ActionEvent event) {
		SceneSwitcher.load(event, View.LOGIN);
	}

	@FXML
	void onSignUpBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.SIGNUP);
	}
}
