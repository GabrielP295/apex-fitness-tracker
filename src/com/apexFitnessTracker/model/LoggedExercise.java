package com.apexFitnessTracker.model;

import java.util.ArrayList;

public class LoggedExercise extends Exercise {
	
	private ArrayList<Set> sets;

	public LoggedExercise() {
		super();
		this.sets = new ArrayList<>();
	}
	
	// copy constructor
	public LoggedExercise(Exercise exercise, ArrayList<Set> sets) {
		super(exercise.getName(), exercise.getTargetMuscle(), exercise.getInstructionsPath(), exercise.getExerciseImgPath(), exercise.getBest1RM());
		this.sets = sets;
	}
	
	// default constructor
	public LoggedExercise(String name, String targetMuscle, String instructionsPath, String exerciseImgPath, double best1RM, ArrayList<Set> sets) {
		super(name, targetMuscle, instructionsPath, exerciseImgPath, best1RM);
		this.sets = sets;
	}
	
	/* 
	 * METHODS 
	 */

	// returns the set in sets ArrayList with the highest calculated 1RM using Epley formula
	public Set getBestSet() {
		double highest1RM = 0;
		Set bestSet = null;
		
		for (Set set: sets) {
			if (set.get1RM() > highest1RM) {
				highest1RM = set.get1RM();
				bestSet = set;
			}
		}
		
		return bestSet;
	}
	
	// returns 1RM of best performing set
	public double getBestSet1RM() {
		return getBestSet().get1RM();
	}
	
	// returns true if the bestSet1RM for this instance of LoggedExercise beats the current best1RM stored in Exercise
	public boolean hasNewPR() {
		double currentPR = this.getBest1RM();
		double thisSessionPR = getBestSet1RM();
		
		if (currentPR < thisSessionPR) {
			return true;
		}
		
		return false;
	}
	
	// getter/setter methods
	public ArrayList<Set> getSets() {
		return sets;
	}

	public void setSets(ArrayList<Set> sets) {
		this.sets = sets;
	}
	
}
