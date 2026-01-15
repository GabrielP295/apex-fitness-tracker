package com.ApexFitnessTracker.navigation;

public enum View {
	HOME("/com/ApexFitnessTracker/view/HomeView.fxml"),
	WORKOUTLOGGER("/com/ApexFitnessTracker/view/WorkoutLoggerView.fxml"),
	BODY("/com/ApexFitnessTracker/view/BodyView.fxml"),
	GRAPHS("/com/ApexFitnessTracker/view/GraphsView.fxml"),
	HISTORY("/com/ApexFitnessTracker/view/HistoryView.fxml"),
	LIBRARY("/com/ApexFitnessTracker/view/LibraryView.fxml"),
	LOGIN("/com/ApexFitnessTracker/view/LogInView.fxml"),
	SIGNUP("/com/ApexFitnessTracker/view/SignUpView.fxml"),
	PROFILE("/com/ApexFitnessTracker/view/ProfileView.fxml");
	
	private final String fxmlPath;
	
	View(String fxmlPath) {
		this.fxmlPath = fxmlPath;
	}

	public String getFxmlPath() {
		return fxmlPath;
	}
}
