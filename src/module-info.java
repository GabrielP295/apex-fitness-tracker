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

	opens com.apexfitnesstracker to javafx.graphics, javafx.fxml; 
	opens com.apexfitnesstracker.controller to javafx.graphics, javafx.fxml, javafx.base; 
	opens com.apexfitnesstracker.model to javafx.base;
}