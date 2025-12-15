package com.apexfitnesstracker.util;

import com.apexfitnesstracker.navigation.View;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitcher {
	//for buttons/controllers
	public static void load(ActionEvent event, View view) {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		load(stage, view);
	}
		
	//Stage based loader, also used directly in main
	public static void load(Stage stage, View view) {
		try {
			Parent root = FXMLLoader.load(SceneSwitcher.class.getResource(view.getFxmlPath()));
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			System.out.println("Error in Scene Switcher");
			e.printStackTrace();
		}
	}
}
