package com.apexfitnesstracker.navigation;

public enum View {
	HOME("/com/apexfitnesstracker/view/HomeView.fxml"),
	WORKOUTLOGGER("/com/apexfitnesstracker/view/WorkoutLoggerView.fxml"),
	BODY("/com/apexfitnesstracker/view/BodyView.fxml"),
	GRAPHS("/com/apexfitnesstracker/view/GraphsView.fxml"),
	HISTORY("/com/apexfitnesstracker/view/HistoryView.fxml"),
	LIBRARY("/com/apexfitnesstracker/view/LibraryView.fxml"),
	LOGIN("/com/apexfitnesstracker/view/LogInView.fxml"),
	SIGNUP("/com/apexfitnesstracker/view/SignUpView.fxml"),
	PROFILE("/com/apexfitnesstracker/view/ProfileView.fxml");
	
	private final String fxmlPath;
	
	View(String fxmlPath) {
		this.fxmlPath = fxmlPath;
	}
	
	public String getFxmlPath() {
		return fxmlPath;
	}
}
