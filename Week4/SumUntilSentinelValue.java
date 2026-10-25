/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;
import java.util.Scanner;

/**
 *
 * @author jltabaosares
 */
public class SumUntilSentinelValue {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            int total = 0;
            
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("       SUM UNTIL SENTINEL VALUE");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Enter integers to add (-1 to stop).");
            
            // Read the first number
            System.out.print("Enter number: ");
            number = input.nextInt();
            
            // Keep adding numbers until -1 is entered
            while (number != -1) {
                total += number;
                
                System.out.print("Enter number: ");
                number = input.nextInt();
            }
            
            // Display the total after the loop ends
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Final Total: " + total);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}


