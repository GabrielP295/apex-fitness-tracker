package com.ApexFitnessTracker;

import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage stage) throws Exception {
		stage.setTitle("Apex Fitness Tracker");
		SceneSwitcher.load(stage, View.WORKOUTLOGGER);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
