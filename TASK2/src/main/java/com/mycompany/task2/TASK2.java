/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task2;

/**
 *
 * @author User
 */
    
import java.util.Scanner;
public class TASK2 {



    public static void main(String[] args) {
        try ( // Create a Scanner object to read input
                Scanner scanner = new Scanner(System.in) // Ensure the scanner is closed to prevent resource leak
        ) {
            // Ask the user how many subjects they have
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            // Initialize an array to hold the marks and a variable for the total marks
            int[] marks = new int[numSubjects];
            int totalMarks = 0;

            // Loop to get the marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.printf("Enter marks for subject %d (out of 100): ", i + 1);
                marks[i] = scanner.nextInt();

                // Check if the entered marks are valid
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    i--; // Decrement i to repeat the loop for the same subject
                } else {
                    totalMarks += marks[i];
                }
            }

            // Calculate the average percentage
            double averagePercentage = (double) totalMarks / numSubjects;

            // Determine the grade based on the average percentage
            char grade = calculateGrade(averagePercentage);

            // Display the results
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }

    // Method to calculate grade based on average percentage
    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


