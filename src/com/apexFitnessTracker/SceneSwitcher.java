package com.apexFitnessTracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitcher {
		
		public void load(ActionEvent event, String fileName) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("gui/" + fileName + ".fxml"));
				Scene scene = new Scene(root);
				
				Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			} catch (Exception e) {
				System.out.println("Error in Scene Switcher");
				e.printStackTrace();
			}
		}

}
