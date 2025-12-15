package com.apexfitnesstracker.model;

import java.util.ArrayList;

public class LoggedExercise {
	
	private Exercise exercise;
	private ArrayList<Set> sets;
	
	// no-arg constructor
	public LoggedExercise() {
		this(new Exercise(), new ArrayList<>());
	}
	
	// default constructor
	public LoggedExercise(Exercise exercise, ArrayList<Set> sets) {
		this.exercise = exercise;
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
		return sets.size();
	}
	
	public int getNumOfReps() {
		int reps = 0;
		
		for (Set set : sets) {
			reps += set.getReps();
		}
		
		return reps;
	}
	
	public double getTotalWeight() {
		double weight = 0;
		
		for (Set set : sets) {
			weight += set.getWeight();
		}
		
		return weight;
	}
	
	public double getTotalVolume() {
		double volume = 0;
		
		for (Set set : sets) {
			volume += set.getSetVolume();
		}
		
		return volume;
	}
	
	// getter/setter methods
	public ArrayList<Set> getSets() {
		return sets;
	}

	public void setSets(ArrayList<Set> sets) {
		this.sets = sets;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	
}
