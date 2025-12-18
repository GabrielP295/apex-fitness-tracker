package com.apexfitnesstracker.model;

import java.util.ArrayList;
import java.util.List;

public class LoggedExercise {
	
	private Exercise exercise;
	private List<WorkoutSet> workoutSets;
	
	// no-arg constructor
	public LoggedExercise() {
		this(new Exercise(), new ArrayList<>());
	}
	
	// default constructor
	public LoggedExercise(Exercise exercise, List<WorkoutSet> workoutSets) {
		this.exercise = exercise;
		this.workoutSets = workoutSets;
	}
	
	/* 
	 * METHODS 
	 */

	// returns the set in sets ArrayList with the highest calculated 1RM using Epley formula
	public WorkoutSet getBestSet() {
		double highest1RM = 0;
		WorkoutSet bestSet = null;
		
		for (WorkoutSet workoutSet: workoutSets) {
			if (workoutSet.get1RM() > highest1RM) {
				highest1RM = workoutSet.get1RM();
				bestSet = workoutSet;
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
		double currentPR = exercise.getBest1RM();
		double thisSessionPR = getBestSet1RM();
		
		if (currentPR < thisSessionPR) {
			return true;
		}
		
		return false;
	}
	
	public void setNewPR() {
		if (hasNewPR()) {
			exercise.setBest1RM(getBestSet1RM());
		}
	}
	
	public int getNumOfSets() {
		return workoutSets.size();
	}
	
	public int getNumOfReps() {
		int reps = 0;
		
		for (WorkoutSet workoutSet : workoutSets) {
			reps += workoutSet.getReps();
		}
		
		return reps;
	}
	
	public double getTotalWeight() {
		double weight = 0;
		
		for (WorkoutSet workoutSet : workoutSets) {
			weight += workoutSet.getWeight();
		}
		
		return weight;
	}
	
	public double getTotalVolume() {
		double volume = 0;
		
		for (WorkoutSet workoutSet : workoutSets) {
			volume += workoutSet.getSetVolume();
		}
		
		return volume;
	}
	
	@Override
	public String toString() {
		return this.exercise.getName();
	}
	
	// getter/setter methods
	public List<WorkoutSet> getSets() {
		return workoutSets;
	}

	public void setSets(ArrayList<WorkoutSet> workoutSets) {
		this.workoutSets = workoutSets;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	
}
