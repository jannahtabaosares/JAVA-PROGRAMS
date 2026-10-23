/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author jltabaosares
 */
public class SimpleGradeClassifier {
        public static void main(String[] args) {

        int score = 85;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("       SIMPLE GRADE CLASSIFIER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("Score: " + score);
        //Score: 55, Result will be FAILED

        if (score >= 60) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
    }
}



