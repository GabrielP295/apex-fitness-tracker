package com.ApexFitnessTracker.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ExerciseTester {

	public static void main(String[] args) {
//	Exercise benchPress = new Exercise("Bench Press", "Chest", "Instructions", "Image", 270);
//	Exercise squat = new Exercise("Squat", "Quads", "Instructions", "Image", 320);
//	Exercise deadlift = new Exercise("Deadlift", "Hamstrings", "Instructions", "Image", 450);
//	
//	System.out.println("Bench Press Old 1RM: ");
//	System.out.println(benchPress.getBest1RM());
//	
//	Set set = new Set();
//	Set set1 = new Set();
//	Set set2 = new Set();
//	Set set3 = new Set();
//	
//	set.setWeight(200);
//	set.setReps(8);
//	set.setRPE(4);
//	
//	set1.setWeight(200);
//	set1.setReps(9);
//	
//	set2.setWeight(190);
//	set2.setReps(9);
//	
//	set3.setWeight(220);
//	set3.setReps(5);
//	
//	ArrayList<Set> sets = new ArrayList<Set>();
//	sets.add(set);
//	sets.add(set1);
//	sets.add(set2);
//	sets.add(set3);
//	
//	LoggedExercise loggedBenchPress = new LoggedExercise(benchPress, sets);
//	
//	System.out.println("Set 1:");
//	System.out.println(set.get1RM());
//	System.out.println(set.convertToRIR() + "\n");
//	System.out.println("Set 2:");
//	System.out.println(set1.get1RM());
//	System.out.println(set1.convertToRIR() + "\n");
//	System.out.println("Set 3:");
//	System.out.println(set2.get1RM());
//	System.out.println(set2.convertToRIR() + "\n");
//	System.out.println("Set 4:");
//	System.out.println(set3.get1RM());
//	System.out.println(set3.convertToRIR() + "\n");
//	
//	System.out.println("Bench Press:");
//	System.out.println("New PR? " + loggedBenchPress.hasNewPR());
//	System.out.println("Best Set? " + (sets.indexOf(loggedBenchPress.getBestSet()) + 1));
//	System.out.println("Best Set 1RM? " + loggedBenchPress.getBestSet1RM());
//	
//	System.out.println("Bench Press Old 1RM: ");
//	System.out.println(benchPress.getBest1RM());
//	
//	if (loggedBenchPress.getBestSet1RM() > benchPress.getBest1RM()) {
//		benchPress.setBest1RM(loggedBenchPress.getBestSet1RM());
//	}
//	
//	System.out.println("Bench Press New 1RM: ");
//	System.out.println(benchPress.getBest1RM());
//	
//	ArrayList<LoggedExercise> loggedExercises1 = new ArrayList<>(); 
//	
//	Workout workout1 = new Workout();
			
		// ---------- Base Exercises ----------
        Exercise benchPress = new Exercise("Bench Press", "Chest", "Instructions", "Image", 270.0);
        Exercise squat = new Exercise("Squat", "Quads", "Instructions", "Image", 320.0);
        Exercise deadlift = new Exercise("Deadlift", "Hamstrings", "Instructions", "Image", 450.0);

        System.out.println("Initial Bench Press 1RM: " + benchPress.getBest1RM());
        System.out.println("Initial Squat 1RM: " + squat.getBest1RM());
        System.out.println("Initial Deadlift 1RM: " + deadlift.getBest1RM());
        System.out.println("====================================\n");

        // ---------- Workout 1 ----------
        ArrayList<WorkoutSet> benchSets1 = new ArrayList<>();
        benchSets1.add(new WorkoutSet("Working", 200, 8, 8));
        benchSets1.add(new WorkoutSet("Working", 210, 6, 9));
        benchSets1.add(new WorkoutSet("Top", 225, 3, 10));

        ArrayList<WorkoutSet> squatSets1 = new ArrayList<>();
        squatSets1.add(new WorkoutSet("Working", 250, 8, 8));
        squatSets1.add(new WorkoutSet("Working", 260, 5, 9));
        squatSets1.add(new WorkoutSet("Top", 275, 3, 10));

        ArrayList<WorkoutSet> deadliftSets1 = new ArrayList<>();
        deadliftSets1.add(new WorkoutSet("Working", 315, 5, 8));
        deadliftSets1.add(new WorkoutSet("Top", 335, 3, 9));

        LoggedExercise loggedBench1 = new LoggedExercise(benchPress, benchSets1);
        LoggedExercise loggedSquat1 = new LoggedExercise(squat, squatSets1);
        LoggedExercise loggedDead1 = new LoggedExercise(deadlift, deadliftSets1);

        ArrayList<LoggedExercise> loggedExercises1 = new ArrayList<>();
        loggedExercises1.add(loggedBench1);
        loggedExercises1.add(loggedSquat1);
        loggedExercises1.add(loggedDead1);

        Workout workout1 = new Workout("Workout 1", loggedExercises1, LocalDateTime.now(), LocalDateTime.now());

        System.out.println(workout1);
        System.out.println("Workout 1 summary:");
        workout1.printSummary();
        System.out.println("====================================\n");

        // ---------- Workout 2 ----------
        ArrayList<WorkoutSet> benchSets2 = new ArrayList<>();
        benchSets2.add(new WorkoutSet("Working", 205, 8, 8));
        benchSets2.add(new WorkoutSet("Working", 215, 6, 9));
        benchSets2.add(new WorkoutSet("Top", 235, 3, 10));

        ArrayList<WorkoutSet> squatSets2 = new ArrayList<>();
        squatSets2.add(new WorkoutSet("Working", 255, 8, 8));
        squatSets2.add(new WorkoutSet("Working", 265, 5, 9));
        squatSets2.add(new WorkoutSet("Top", 285, 3, 10));

        ArrayList<WorkoutSet> deadliftSets2 = new ArrayList<>();
        deadliftSets2.add(new WorkoutSet("Working", 325, 5, 8));
        deadliftSets2.add(new WorkoutSet("Top", 345, 3, 9));

        LoggedExercise loggedBench2 = new LoggedExercise(benchPress, benchSets2);
        LoggedExercise loggedSquat2 = new LoggedExercise(squat, squatSets2);
        LoggedExercise loggedDead2 = new LoggedExercise(deadlift, deadliftSets2);

        ArrayList<LoggedExercise> loggedExercises2 = new ArrayList<>();
        loggedExercises2.add(loggedBench2);
        loggedExercises2.add(loggedSquat2);
        loggedExercises2.add(loggedDead2);

        Workout workout2 = new Workout("Workout 2", loggedExercises2, LocalDateTime.now(), LocalDateTime.now());

        System.out.println(workout2);
        System.out.println("Workout 2 summary:");
        workout2.printSummary();
        System.out.println("====================================\n");

        // ---------- Workout 3 ----------
        ArrayList<WorkoutSet> benchSets3 = new ArrayList<>();
        benchSets3.add(new WorkoutSet("Working", 210, 8, 8));
        benchSets3.add(new WorkoutSet("Working", 220, 6, 9));
        benchSets3.add(new WorkoutSet("Top", 240, 3, 10));

        ArrayList<WorkoutSet> squatSets3 = new ArrayList<>();
        squatSets3.add(new WorkoutSet("Working", 260, 8, 8));
        squatSets3.add(new WorkoutSet("Working", 275, 5, 9));
        squatSets3.add(new WorkoutSet("Top", 295, 3, 10));

        ArrayList<WorkoutSet> deadliftSets3 = new ArrayList<>();
        deadliftSets3.add(new WorkoutSet("Working", 330, 5, 8));
        deadliftSets3.add(new WorkoutSet("Top", 355, 3, 9));

        LoggedExercise loggedBench3 = new LoggedExercise(benchPress, benchSets3);
        LoggedExercise loggedSquat3 = new LoggedExercise(squat, squatSets3);
        LoggedExercise loggedDead3 = new LoggedExercise(deadlift, deadliftSets3);
        
        ArrayList<LoggedExercise> loggedExercises3 = new ArrayList<>();
        loggedExercises3.add(loggedBench3);
        loggedExercises3.add(loggedSquat3);
        loggedExercises3.add(loggedDead3);

        Workout workout3 = new Workout("Workout 3", loggedExercises3, LocalDateTime.now(), LocalDateTime.now());
        
        System.out.println(workout3);
        System.out.println("Workout 3 summary:");
        workout3.printSummary();
        System.out.println("====================================\n");
        
        loggedBench3.setNewPR();
        loggedSquat3.setNewPR();
        loggedDead3.setNewPR();

        // ---------- Final PR Check ----------
        System.out.println("Bench Press final recorded 1RM: " + benchPress.getBest1RM());
        System.out.println("Squat final recorded 1RM: " + squat.getBest1RM());
        System.out.println("Deadlift final recorded 1RM: " + deadlift.getBest1RM());
        
	}
	
}
