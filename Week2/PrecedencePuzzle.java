/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author jltabaosares
 */
public class PrecedencePuzzle {
        
    public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("      PRECEDENCE PUZZLE SOLVER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        int a = 5;
        int b = 3;
        int count = 4;

        // PREDICTED: true because 5 + 3 is 8, which is greater than 6, and b is less than 5.
        System.out.println("Expression 1: " + ((a + b > 6) && (b < 5)));

        // PREDICTED: 5 because count++ uses the current value before increasing it.
        System.out.println("Expression 2: " + (count++ + 2));
        System.out.println("Count after Expression 2: " + count);

        // PREDICTED: true because count becomes 5 first, then 5 * 2 is greater than 9.
        System.out.println("Expression 3: " + ((++count * 2 > 9) || (a - b < 0)));

        // PREDICTED: true because multiplication happens before addition, so 5 + 3 * 2 = 11.
        System.out.println("Expression 4: " + (a + b * 2 >= 11 && b != 0));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

