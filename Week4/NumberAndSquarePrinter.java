/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK4;

/**
 *
 * @author jltabaosares
 */
public class NumberAndSquarePrinter {
    
    public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("       NUMBER & SQUARE PRINTER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Print each number and its square from 1 to 20
        for (int number = 1; number <= 20; number++) {
            System.out.println("Number: " + number
                    + " | Square: " + (number * number));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

