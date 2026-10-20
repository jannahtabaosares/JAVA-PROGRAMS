/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author jltabaosares
 */
public class GrowthTracker {
       public static void main(String[] args) {

        // Set the starting balance
        double balance = 1000.00;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  COMPOUND GROWTH & INCREMENT TRACKER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("Starting Balance: " + balance);

        // Add 500 to the balance
        balance += 500;
        System.out.println("After adding 500: " + balance);

        // Increase the balance by 10 percent
        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        // Add another 200 to the balance
        balance += 200;
        System.out.println("After adding 200: " + balance);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Test postfix increment
        int count = 5;
        System.out.println("Postfix count++: " + count++);
        System.out.println("Count after postfix: " + count);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Reset count to 5 to test prefix increment
        count = 5;
        System.out.println("Prefix ++count: " + ++count);
        System.out.println("Count after prefix: " + count);

        /*
         * With count++, the current value is printed first,
         * then count increases by 1.
         * With ++count, count increases by 1 first,
         * so the new value is printed.
         */

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
 
