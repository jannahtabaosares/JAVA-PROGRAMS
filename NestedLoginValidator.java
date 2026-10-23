/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;
import java.util.Scanner;

/**
 *
 * @author jltabaosares
 */
public class NestedLoginValidator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set the correct login details
        String correctUsername = "kageyamatobio";
        String correctPassword = "mynumber1setter";
        boolean accountLocked = false;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("     NESTED LOGIN VALIDATOR");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Ask the user for their username first
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Check the username before checking the password
        if (username.equals(correctUsername)) {

            System.out.print("Enter password: ");
            String password = input.nextLine();

            // Check the password only if the username is correct
            if (password.equals(correctPassword)) {

                // Check the account status only if both details are correct
                if (!accountLocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Your account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Username not found.");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        input.close();
    }
}

