package com.ApexFitnessTracker.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Workout {
	
	private final UUID id;
	private String name;
	private List<LoggedExercise> exercises;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	// no-arg constructor
	public Workout() {
		this("Unknown Name", new ArrayList<LoggedExercise>(), LocalDateTime.now(), LocalDateTime.now());
	}

	// default constructor
	public Workout(String name, List<LoggedExercise> exercises, LocalDateTime startTime, LocalDateTime endTime) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.exercises = exercises;
		this.startTime = startTime;
		this.endTime = endTime;
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
	
	//in minutes
	public double getDuration() {
		return 90;
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
			+ "\nTime Completed: " + getEndTime()
			+ "\nTotal Reps: " + getTotalReps()
			+ "\nTotal Sets: " + getTotalSets()
			+ "\nTotal Weight: " + getTotalWeight()
			+ "\nTotal Volume: " + getTotalVolume();
	}

	// getter/setter methods
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LoggedExercise> getExercises() {
		return exercises;
	}

	public void setExercises(ArrayList<LoggedExercise> exercises) {
		this.exercises = exercises;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
}
