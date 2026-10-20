/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author jltabaosares
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {

        // Set the student's average grade and number of absences
        double average = 88;
        int absences = 2;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("     GRADE THRESHOLD CHECKER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        // Check if the student meets either passing condition
        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Display the result and explain why the student passed or failed
        if (passed) {
            System.out.println("Result: PASS");

            if (average >= 90) {
                System.out.println("Reason: The average grade is 90 or higher.");
            } else {
                System.out.println("Reason: The average is at least 75 and absences are not more than 3.");
            }
        } else {
            System.out.println("Result: FAIL");

            if (average < 75) {
                System.out.println("Reason: The average grade is below 75.");
            }

            if (absences > 3) {
                System.out.println("Reason: The student has more than 3 absences.");
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

