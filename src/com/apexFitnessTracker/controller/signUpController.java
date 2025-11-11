package com.apexFitnessTracker.controller;

import com.apexFitnessTracker.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class signUpController {

    @FXML
    private TextField emailTxtFld;

    @FXML
    private Hyperlink logInLnk;

    @FXML
    private TextField passwordTxtFld;

    @FXML
    private Button signUpBtn;

    private SceneSwitcher switcher;

    @FXML
    void onEmailTxtFld(ActionEvent event) {
    	System.out.println("email txtfld works");
    }

    @FXML
    void onLogInLnk(ActionEvent event) {
    	String path = "gui/logInUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onPasswordTxtFld(ActionEvent event) {
    	System.out.println("pass txtfld works");
    }

    @FXML
    void onSignUpBtn(ActionEvent event) {
    	System.out.println("Account successfully created."); 
    	String path = "gui/logInUI.fxml";
    	switchScene(event, path);
    }

    void switchScene(ActionEvent event, String path) {
    	switcher = new SceneSwitcher();
    	switcher.load(event, path);
    }

}
