/**
 * 
 */
/**
 * 
 */
module apexFitnessTracker {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires javafx.base;
	requires javafx.graphics;
	requires java.sql;
	requires java.desktop;

	opens com.apexFitnessTracker to javafx.graphics, javafx.fxml; 
}