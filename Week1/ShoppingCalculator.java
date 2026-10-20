/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author jltabaosares
 */
public class ShoppingCalculator {
        
    public static void main(String[] args) {
        
        //The name of my restaurant
        String storeName = "Unraveled Resto";
        //I have declared the given quantity and unit price
        int quantity = 5;
        double unitPrice = 14.99;
        //I first declared the total, before inputting the formula
        double total;
        total = (quantity * unitPrice);
        
        //This will be the output of the Program
        //Everything that i have declared will be shown here, i also added some designs hehehe:3
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println( "         " +  storeName );
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Quantity of Product:  " + quantity );
        System.out.println("Unit Price:           " + unitPrice );
        System.out.println("Total:                " + total );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

