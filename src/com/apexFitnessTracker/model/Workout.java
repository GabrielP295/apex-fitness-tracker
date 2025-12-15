package com.apexfitnesstracker.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Workout {
	
	private String name;
	private ArrayList<LoggedExercise> exercises;
	private LocalDateTime dateTime;
	private double duration; //in minutes
	
	// no-arg constructor
	public Workout() {
		this("Unknown Name", new ArrayList<LoggedExercise>(), LocalDateTime.now(), 0);
	}

	// default constructor
	public Workout(String name, ArrayList<LoggedExercise> exercises, LocalDateTime dateTime, double duration) {
		this.name = name;
		this.exercises = exercises;
		this.dateTime = dateTime;
		this.duration = duration;
	}
	
	/* 
	 * ----------------METHODS----------------
	 */
	
	public int getNumOfPR() {
		int prCount = 0;
		
		for (LoggedExercise le : exercises) {
			if (le.hasNewPR()) {
				prCount++;
			}
		}
		
		return prCount;
	}
	
	public int getTotalSets() {
		int totalSets = 0;
		
		for (LoggedExercise le : exercises) {
			totalSets += le.getNumOfSets();	
		}
		
		return totalSets;
	}
	
	public int getTotalReps() {
		int totalReps = 0;
		
		for (LoggedExercise le : exercises) {
			totalReps += le.getNumOfReps();	
		}
		
		return totalReps;
	}
	
	public double getTotalWeight() {
		double totalWeight = 0;
		
		for (LoggedExercise le : exercises) {
			totalWeight += le.getTotalWeight();	
		}
		
		return totalWeight;
	}
	
	public double getTotalVolume() {
		double volume = 0;
		
		for (LoggedExercise le : exercises) {
			volume += le.getTotalVolume();
		}
		
		return volume;
	}
	
	public void printSummary() {
	    for (LoggedExercise le : exercises) {
	        System.out.println(le.getExercise().getName() + 
	            " | Best 1RM: " + le.getBestSet1RM() +
	            " | New PR: " + le.hasNewPR());
	    }
	}
	
	@Override
	public String toString() {
		return "Workout Name: " + getName()
			+ "\nDuration: " + getDuration() + " mins"
			+ "\nTime Completed: " + getDateTime()
			+ "\nTotal Reps: " + getTotalReps()
			+ "\nTotal Sets: " + getTotalSets()
			+ "\nTotal Weight: " + getTotalWeight()
			+ "\nTotal Volume: " + getTotalVolume();
	}

	// getter/setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<LoggedExercise> getExercises() {
		return exercises;
	}

	public void setExercises(ArrayList<LoggedExercise> exercises) {
		this.exercises = exercises;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
	
}
