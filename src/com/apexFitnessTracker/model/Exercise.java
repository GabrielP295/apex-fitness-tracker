package com.apexfitnesstracker.model;

public class Exercise {
	
	private final String name;
	private final String targetMuscle;
	private final String instructionsPath;
	private final String exerciseImgPath;
	private Double best1RM;
	
	public Exercise() {
		this("Unknown Exercise", "Unknown Muscle", "N/A", "N/A", null);
	}

	public Exercise(String name, String targetMuscle, String instructionsPath, String exerciseImgPath, Double best1RM) {
		this.name = name;
		this.targetMuscle = targetMuscle;
		this.instructionsPath = instructionsPath;
		this.exerciseImgPath = exerciseImgPath;
		this.best1RM = best1RM;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + targetMuscle + ")";
	}

	// getter methods, only best1RM has setter
	public String getName() {
		return name;
	}

	public String getTargetMuscle() {
		return targetMuscle;
	}

	public String getInstructionsPath() {
		return instructionsPath;
	}

	public String getExerciseImgPath() {
		return exerciseImgPath;
	}

	public double getBest1RM() {
		return best1RM;
	}

	public void setBest1RM(Double best1rm) {
		best1RM = best1rm;
	}
	
	
	
}
