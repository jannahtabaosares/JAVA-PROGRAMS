/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author jltabaosares
 */
public class SearchAndSort {
    
    public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("      SEARCH & SORT MINI-TOOL");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Store the scores from the previous activity
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 84};

        // Set the target score to search for
        int target = 92;
        int foundIndex = -1;

        // Search for the target score using linear search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        // Display the search result
        System.out.println("\n--- LINEAR SEARCH ---");
        System.out.println("Target Score: " + target);

        if (foundIndex != -1) {
            System.out.println("Result: Score found!");
            System.out.println("Index: " + foundIndex);
        } else {
            System.out.println("Result: Score not found.");
        }

        // Sort a copy to keep the original scores unchanged
        // This matters if another part of the program needs the original order
        int[] sortedScores = java.util.Arrays.copyOf(scores, scores.length);
        java.util.Arrays.sort(sortedScores);

        // Display the original and sorted arrays
        System.out.println("\n--- ORIGINAL SCORES ---");
        System.out.println(java.util.Arrays.toString(scores));

        System.out.println("\n--- SORTED SCORES ---");
        System.out.println(java.util.Arrays.toString(sortedScores));

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
