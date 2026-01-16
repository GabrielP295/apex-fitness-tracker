package com.ApexFitnessTracker.controller;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;

import com.ApexFitnessTracker.model.Exercise;
import com.ApexFitnessTracker.model.LoggedExercise;
import com.ApexFitnessTracker.model.Workout;
import com.ApexFitnessTracker.model.WorkoutSet;
import com.ApexFitnessTracker.navigation.View;
import com.ApexFitnessTracker.util.SceneSwitcher;

import javafx.beans.binding.Bindings;
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
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class WorkoutLoggerController implements Initializable {

	// ----- Navigation Buttons -----
	@FXML private Button graphBtn;
	@FXML private Button historyBtn;
	@FXML private Button homeBtn;
	@FXML private Button libraryBtn;
	@FXML private Button profileBtn;
	@FXML private Button bodyBtn;

	// ----- Quick Workout Input Fields/Buttons -----
	@FXML private Button addWorkoutBtn;
	@FXML private Button addSetBtn;
	@FXML private Button removeSetBtn;
	@FXML private ComboBox<LoggedExercise> chooseExercise;
	@FXML private TextField dateFld;
	@FXML private TextField startTimeFld;
	@FXML private TextField endTimeFld;
	@FXML private TextField nameFld;

	// ----- Exercise/Sets Main Table View -----
	@FXML private TableView<WorkoutSet> exerciseTable;
	@FXML private TableColumn<WorkoutSet, Double> weightCol;
	@FXML private TableColumn<WorkoutSet, Integer> repsCol;

	private ObservableList<WorkoutSet> currentSetsList = FXCollections.observableArrayList();
	private HashSet<LoggedExercise> usedExercises = new HashSet<>();
	LoggedExercise activeExercise;
	
	LoggedExercise benchPress = new LoggedExercise(new Exercise("Bench Press", "Chest", "Instructions", "Image", 270.0), new ArrayList<WorkoutSet>());
	LoggedExercise squat = new LoggedExercise(new Exercise("Squat", "Quads", "Instructions", "Image", 320.0), new ArrayList<WorkoutSet>());
	LoggedExercise deadlift = new LoggedExercise(new Exercise("Deadlift", "Hamstrings", "Instructions", "Image", 450.0), new ArrayList<WorkoutSet>());
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// binds column to be able to retrieve data from Set object
		weightCol.setCellValueFactory(new PropertyValueFactory<WorkoutSet, Double>("weight"));
		repsCol.setCellValueFactory(new PropertyValueFactory<WorkoutSet, Integer>("reps"));

		// makes TableView editable and updates the Set object data directly
		weightCol.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
		weightCol.setOnEditCommit(e -> {
			e.getRowValue().setWeight(e.getNewValue());
		});
		repsCol.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		repsCol.setOnEditCommit(e -> {
			e.getRowValue().setReps(e.getNewValue());
		});

		// binds TableView UI to observable arraylist
		exerciseTable.setItems(currentSetsList);

		// populate Combobox with demo data
		chooseExercise.getItems().setAll(benchPress, deadlift, squat);
		
		/*
		 * sets String converter for exercise comboBox
		 * toString overriden to display exercise name of LoggedExercise object in combobox
		 * fromString overridden to convert String in comboBox back into a LoggedExercise object, currently not in use, may be needed later for search filtering combobox
		 */
		chooseExercise.setConverter(new StringConverter<LoggedExercise>() {
		    @Override
		    public String toString(LoggedExercise le) {
		        return le == null ? "" : le.getExercise().getName();
		    }

		    @Override
		    public LoggedExercise fromString(String string) {
		        return null;
		    }
		});

		/* 
		 * bind tableview UI height to be dependent on the amount of sets that a user adds per exercise, capped at 10
		 * 24 is the height of a row, and 28 is the height of the header
		 */
		
		//TODO change main tableview to always have at minimum one row showing, and at max 10
		
	}

	// Quick Workout Field/Button Handlers
	@FXML
	void onAddSet(ActionEvent event) {
		// retrieves the set that is currently selected and adds it to both the LE obj WorkoutSet list and controller observable list
		WorkoutSet setToAdd = new WorkoutSet("Normal", 0, 0, 0);
		activeExercise.getSets().add(setToAdd);
		currentSetsList.add(setToAdd);
		//TODO add alert for if the user tries to add set when combo box has no value selected
		updateUsedExercises();
	}

	@FXML
	void onRemoveSet(ActionEvent event) {
		//retrieves the set that is currently selected and removes it from both the LE obj WorkoutSet list and controller observable list
		WorkoutSet setToRemove = exerciseTable.getSelectionModel().getSelectedItem();
		activeExercise.getSets().remove(setToRemove);
		currentSetsList.remove(setToRemove);
		//TODO add alert for if the user tries to remove set without having a set selected from the table view
		updateUsedExercises();
	}

	@FXML
	void onAddWorkout(ActionEvent event) {
		String name = nameFld.getText().trim();
		List<LoggedExercise> exercises = new ArrayList<>(usedExercises);
		//TODO input field checking and converting to LocalDateTime values from text fields
		LocalDateTime dateTime = LocalDateTime.now();
		//TODO calculate duration from LocalDateTime values
		
		Workout workout = new Workout(name, exercises, dateTime, dateTime);
		System.out.println(workout);
	}

	//sets table view ui to corresponding exercise by changing the values in currentSetsList(Observable) to WorkoutSet list within LE object
	@FXML
	void onChooseExercise(ActionEvent event) {
		activeExercise = chooseExercise.getValue();
		currentSetsList.setAll(activeExercise.getSets());
		exerciseTable.setItems(currentSetsList);
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

	// Private helper methods

	/*
	 * checks if current exercise selected has one or more sets added for tracking
	 * what exercises should be added to the workout onAddWorkout 
	 */
	private void updateUsedExercises() {
		LoggedExercise toChange = chooseExercise.getValue();
		if (currentSetsList.size() == 1) {
			usedExercises.add(toChange);
		}
		if (currentSetsList.isEmpty()) {
			usedExercises.remove(toChange);
		}
	}
}
