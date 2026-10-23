/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author jltabaosares
 */
public class ClassStatisticsCalculator {
    
    public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("       CLASS STATISTICS CALCULATOR");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Store the scores of 8 students in an array
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 84};

        // Initialize the variables for the statistics
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Calculate the sum, highest, and lowest scores using a loop
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // Calculate the average score
        double average = (double) sum / scores.length;

        // Display the statistics
        System.out.println();
        System.out.println("Total Sum: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

 
