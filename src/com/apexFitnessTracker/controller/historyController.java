package com.apexFitnessTracker.controller;

import com.apexFitnessTracker.SceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class historyController {

    @FXML
    private Button bodyBtn;

    @FXML
    private Button graphBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button libraryBtn;

    @FXML
    private Button logWorkoutBtn;

    @FXML
    private Button profileBtn;

    private SceneSwitcher switcher;

    @FXML
    void onBodyBtn(ActionEvent event) {
    	String path = "gui/bodyUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onGraphBtn(ActionEvent event) {
    	String path = "gui/graphsUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onHomeBtn(ActionEvent event) {
    	String path = "gui/homeUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onLibraryBtn(ActionEvent event) {
    	String path = "gui/libraryUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onLogWorkoutBtn(ActionEvent event) {
    	String path = "gui/workoutLoggerUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onProfileBtn(ActionEvent event) {
    	String path = "gui/profileUI.fxml";
    	switchScene(event, path);
    }
    
    void switchScene(ActionEvent event, String path) {
    	switcher = new SceneSwitcher();
    	switcher.load(event, path);
    }

}
