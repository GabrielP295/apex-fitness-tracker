package com.apexFitnessTracker.controller;

import com.apexFitnessTracker.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class logInController {

    @FXML
    private TextField emailTxtFld;

    @FXML
    private Button logInBtn;

    @FXML
    private TextField passwordTxtFld;

    @FXML
    private Hyperlink signUpLnk;
    
    private SceneSwitcher switcher;

    @FXML
    void onEmailTxtFld(ActionEvent event) {
    	System.out.println("email txtfld works");
    }

    @FXML
    void onLogInBtn(ActionEvent event) {
    	String path = "gui/homeUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onPasswordTxtFld(ActionEvent event) {
    	System.out.println("pass txtfld works");
    }

    @FXML
    void onSignUpLnk(ActionEvent event) {
    	String path = "gui/signUpUI.fxml";
    	switchScene(event, path);
    }

    void switchScene(ActionEvent event, String path) {
    	switcher = new SceneSwitcher();
    	switcher.load(event, path);
    }

}
