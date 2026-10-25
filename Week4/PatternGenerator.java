
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

/**
 *
 * @author jltabaosares
 */
public class PatternGenerator {

    public static void main(String[] args) {

        int size = 5;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PATTERN GENERATOR WITH EARLY EXIT");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Outer loop controls the rows
        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip printing stars on the third row
            if (row == 3) {
                System.out.println();
                continue;
            }

            // Inner loop controls the columns
            for (int col = 1; col <= size; col++) {

                // BREAK: Stop the inner loop when column reaches 4
                if (col == 4) {
                    break;
                }

                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
