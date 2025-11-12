package com.apexFitnessTracker.model;

public class Exercise {
	
	private String name;
	private String targetMuscle;
	private String instructionsPath;
	private String exerciseImgPath;
	private double best1RM;
	
	public Exercise() {
		this("Unknown Exercise", "Unknown Muscle", "N/A", "N/A", -1);
	}

	public Exercise(String name, String targetMuscle, String instructionsPath, String exerciseImgPath, double best1RM) {
		this.name = name;
		this.targetMuscle = targetMuscle;
		this.instructionsPath = instructionsPath;
		this.exerciseImgPath = exerciseImgPath;
		this.best1RM = best1RM;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTargetMuscle() {
		return targetMuscle;
	}

	public void setTargetMuscle(String targetMuscle) {
		this.targetMuscle = targetMuscle;
	}

	public String getInstructionsPath() {
		return instructionsPath;
	}

	public void setInstructionsPath(String instructionsPath) {
		this.instructionsPath = instructionsPath;
	}

	public String getExerciseImgPath() {
		return exerciseImgPath;
	}

	public void setExerciseImgPath(String exerciseImgPath) {
		this.exerciseImgPath = exerciseImgPath;
	}

	public double getBest1RM() {
		return best1RM;
	}

	public void setBest1RM(double best1rm) {
		best1RM = best1rm;
	}
	
	
	
}
