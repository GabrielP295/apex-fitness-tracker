package com.apexfitnesstracker.model;

import java.util.ArrayList;

public class User {

	private String email;
	private String password;
	private int age;
	private ArrayList<Workout> workouts;
	
	public User() {
		this("N/A", "N/A", 0, new ArrayList<>());
	}

	public User(String email, String password, int age, ArrayList<Workout> workouts) {
		this.email = email;
		this.password = password;
		this.age = age;
		this.workouts = workouts;
	}
	
	// getter/setter methods
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Workout> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(ArrayList<Workout> workouts) {
		this.workouts = workouts;
	}
}
