package com.apexFitnessTracker.controller;

import com.apexFitnessTracker.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class profileController {

    @FXML
    private Button bodyBtn;

    @FXML
    private Button graphBtn;

    @FXML
    private Button historyBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button libraryBtn;

    @FXML
    private Button logOutBtn;

    private SceneSwitcher switcher;

    @FXML
    void onBodyBtn(ActionEvent event) {
    	String path = "bodyUI";
    	switchScene(event, path);
    }

    @FXML
    void onGraphBtn(ActionEvent event) {
    	String path = "graphsUI";
    	switchScene(event, path);
    }

    @FXML
    void onHistoryBtn(ActionEvent event) {
    	String path = "historyUI";
    	switchScene(event, path);
    }

    @FXML
    void onLibraryBtn(ActionEvent event) {
    	String path = "libraryUI";
    	switchScene(event, path);
    }

    @FXML
    void onLogWorkoutBtn(ActionEvent event) {
    	String path = "workoutLoggerUI";
    	switchScene(event, path);
    }
    
    @FXML
    void onHomeBtn(ActionEvent event) {
    	String path = "homeUI";
    	switchScene(event, path);
    }

    @FXML
    void onLogOutBtn(ActionEvent event) {
    	String path = "logInUI";
    	switchScene(event, path);
    }
    
    void switchScene(ActionEvent event, String path) {
    	switcher = new SceneSwitcher();
    	switcher.load(event, path);
    }

}
