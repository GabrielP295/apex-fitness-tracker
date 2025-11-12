package com.apexFitnessTracker.model;

import java.util.ArrayList;

public class ExerciseTester {

	public static void main(String[] args) {
		Exercise benchPress = new Exercise("Bench Press", "Chest", "Instructions", "Image", 270);
		
		System.out.println("Bench Press Old 1RM: ");
		System.out.println(benchPress.getBest1RM());
		
		Set set = new Set();
		Set set1 = new Set();
		Set set2 = new Set();
		Set set3 = new Set();
		
		set.setWeight(200);
		set.setReps(8);
		set.setRPE(4);
		
		set1.setWeight(200);
		set1.setReps(9);
		
		set2.setWeight(190);
		set2.setReps(9);
		
		set3.setWeight(220);
		set3.setReps(5);
		
		ArrayList<Set> sets = new ArrayList<Set>();
		sets.add(set);
		sets.add(set1);
		sets.add(set2);
		sets.add(set3);
		
		LoggedExercise loggedBenchPress = new LoggedExercise(benchPress, sets);
		
		System.out.println("Set 1:");
		System.out.println(set.get1RM());
		System.out.println(set.convertToRIR() + "\n");
		System.out.println("Set 2:");
		System.out.println(set1.get1RM());
		System.out.println(set1.convertToRIR() + "\n");
		System.out.println("Set 3:");
		System.out.println(set2.get1RM());
		System.out.println(set2.convertToRIR() + "\n");
		System.out.println("Set 4:");
		System.out.println(set3.get1RM());
		System.out.println(set3.convertToRIR() + "\n");
		
		System.out.println("Bench Press:");
		System.out.println("New PR? " + loggedBenchPress.hasNewPR());
		System.out.println("Best Set? " + (sets.indexOf(loggedBenchPress.getBestSet()) + 1));
		System.out.println("Best Set 1RM? " + loggedBenchPress.getBestSet1RM());
		
		System.out.println("Bench Press Old 1RM: ");
		System.out.println(benchPress.getBest1RM());
		
		if (loggedBenchPress.getBestSet1RM() > benchPress.getBest1RM()) {
			benchPress.setBest1RM(loggedBenchPress.getBestSet1RM());
		}
		
		System.out.println("Bench Press New 1RM: ");
		System.out.println(benchPress.getBest1RM());
		
	}

}
