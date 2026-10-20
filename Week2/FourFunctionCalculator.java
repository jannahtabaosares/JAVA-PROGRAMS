/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;
import java.util.Scanner;

/**
 *
 * @author jltabaosares
 */
public class FourFunctionCalculator {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("    FOUR-FUNCTION CALCULATOR");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("First number:  " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // Show the results of each arithmetic operation
        System.out.println("Addition:       " + (num1 + num2));
        System.out.println("Subtraction:    " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        // Check if the second number is zero before dividing
        if (num2 != 0) {
            System.out.println("Division:       " + (num1 / num2));
            System.out.println("Remainder:      " + (num1 % num2));
        } else {
            System.out.println("Division:       Undefined (cannot divide by zero)");
            System.out.println("Remainder:      Undefined (cannot divide by zero)");
        }

        // When using negative numbers, division rounds toward zero.
        // The remainder follows the sign of the first number.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        input.close();
    }
}

