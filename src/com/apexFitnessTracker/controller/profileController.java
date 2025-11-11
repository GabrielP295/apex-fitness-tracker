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
    	String path = "gui/bodyUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onGraphBtn(ActionEvent event) {
    	String path = "gui/graphsUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onHistoryBtn(ActionEvent event) {
    	String path = "gui/historyUI.fxml";
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
    void onHomeBtn(ActionEvent event) {
    	String path = "gui/homeUI.fxml";
    	switchScene(event, path);
    }

    @FXML
    void onLogOutBtn(ActionEvent event) {
    	String path = "gui/logInUI.fxml";
    	switchScene(event, path);
    }
    
    void switchScene(ActionEvent event, String path) {
    	switcher = new SceneSwitcher();
    	switcher.load(event, path);
    }

}
