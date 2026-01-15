/**
 * 
 */
/**
 * 
 */
module apexfitnesstracker {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;
	requires java.desktop;

	opens com.ApexFitnessTracker to javafx.graphics, javafx.fxml; 
	opens com.ApexFitnessTracker.controller to javafx.graphics, javafx.fxml, javafx.base; 
	opens com.ApexFitnessTracker.model to javafx.base;
}