package com.apexFitnessTracker.model;

public class Set {
	
	private String setType;
	private double weight;
	private int reps; 
	private int RPE;
	
	public Set() {
		this("Unknown set type", -1, -1, -1);
	}

	public Set(String setType, double weight, int reps, int RPE) {
		this.setType = setType;
		this.weight = weight;
		this.reps = reps;
		this.RPE = RPE;
	}
	
	public int convertToRIR() {
		return 10 - RPE;
	}
	
	public double get1RM() {
		return weight * (1 + (reps/30.0));
	}
	
	@Override
	public String toString() {
		return get1RM() + "";
	}

	// getters/setter methods
	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getRPE() {
		return RPE;
	}

	public void setRPE(int rPE) {
		RPE = rPE;
	}
	
	
}
