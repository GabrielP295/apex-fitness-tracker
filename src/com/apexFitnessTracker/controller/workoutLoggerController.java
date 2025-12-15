package com.apexfitnesstracker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.apexfitnesstracker.model.Set;
import com.apexfitnesstracker.navigation.View;
import com.apexfitnesstracker.util.SceneSwitcher;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class WorkoutLoggerController implements Initializable{

	// ----- Navigation Buttons -----
	@FXML private Button graphBtn;
	@FXML private Button historyBtn;
	@FXML private Button homeBtn;
	@FXML private Button libraryBtn;
	@FXML private Button profileBtn;
	@FXML private Button bodyBtn;

	// ----- Quick Workout Input Fields -----
	@FXML private Button addWorkoutBtn;
	@FXML private ComboBox<?> chooseExercise;
	@FXML private TextField dateTxtFld;
	@FXML private TextField timeTxtFld;

	// ----- Exercise/Sets Main Table View -----
	@FXML private TableView<Set> exerciseTable;
	@FXML private TableColumn<Set, Double> weightCol;
	@FXML private TableColumn<Set, Integer> repsCol;
	
	private ObservableList<Set> setsList = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// initialize exercise columns
		weightCol.setCellValueFactory(new PropertyValueFactory<Set, Double>("weight"));
		repsCol.setCellValueFactory(new PropertyValueFactory<Set, Integer>("reps"));
		weightCol.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		repsCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

		setsList.add(new Set("Normal", 50, 8, 10));
		exerciseTable.setItems(setsList);
	}

	// Quick Workout Field/Button Handlers
	@FXML
	void onAddWorkout(ActionEvent event) {

	}

	@FXML
	void onChooseExercise(ActionEvent event) {

	}

	@FXML
	void onDate(ActionEvent event) {

	}

	@FXML
	void onTime(ActionEvent event) {

	}

	// menu navigator button event handlers
	@FXML
	void onBodyBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.BODY);
	}

	@FXML
	void onGraphBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.GRAPHS);
	}

	@FXML
	void onHistoryBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.HISTORY);
	}

	@FXML
	void onLibraryBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.LIBRARY);
	}

	@FXML
	void onHomeBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.HOME);
	}

	@FXML
	void onProfileBtn(ActionEvent event) {
		SceneSwitcher.load(event, View.PROFILE);
	}
}
