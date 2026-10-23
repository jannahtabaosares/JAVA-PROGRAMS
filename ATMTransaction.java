/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author jltabaosares
 */
public class ATMTransaction {
    
 public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("        ATM TRANSACTION AUTHORIZER");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Account information
        String username = "bananabeanm";
        String enteredUsername = "bananabeanm";

        int correctPIN = 1234;
        int enteredPIN = 1234;

        double balance = 25000.00;
        double withdrawalAmount = 5000.00;

        System.out.println("Username: " + enteredUsername);
        System.out.println("Account Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("--------------------------------------");

        // Check username and PIN using nested if statements
        if (enteredUsername.equals(username)) {
            if (enteredPIN == correctPIN
                    && enteredPIN >= 1000 && enteredPIN <= 9999) {

                System.out.println("Authentication: SUCCESS");

                // Determine account tier using an else-if ladder
                String tier;

                if (balance < 10000) {
                    tier = "Bronze";
                } else if (balance < 50000) {
                    tier = "Silver";
                } else if (balance < 100000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }

                System.out.println("Account Tier: " + tier);

                // Set daily withdrawal limit based on account tier
                double dailyLimit;

                if (tier.equals("Bronze")) {
                    dailyLimit = 5000;
                } else if (tier.equals("Silver")) {
                    dailyLimit = 15000;
                } else if (tier.equals("Gold")) {
                    dailyLimit = 30000;
                } else {
                    dailyLimit = 50000;
                }

                // Select transaction fee percentage using switch
                double feeRate;

                switch (tier) {
                    case "Bronze":
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        feeRate = 0.015;
                        break;
                    case "Gold":
                        feeRate = 0.01;
                        break;
                    case "Platinum":
                        feeRate = 0.005;
                        break;
                    default:
                        feeRate = 0.03;
                        break;
                }

                // Check withdrawal conditions using nested if statements
                if (withdrawalAmount > 0) {
                    if (withdrawalAmount <= balance) {
                        if (withdrawalAmount <= dailyLimit) {

                            double fee = withdrawalAmount * feeRate;
                            double totalDeduction = withdrawalAmount + fee;

                            // Approve only if the balance covers the withdrawal and fee
                            if (totalDeduction <= balance) {
                                System.out.println("--------------------------------------");
                                System.out.println("Transaction Status: APPROVED");
                                System.out.printf("Withdrawal Amount: ₱%.2f%n",
                                        withdrawalAmount);
                                System.out.printf("Transaction Fee: ₱%.2f%n", fee);
                                System.out.printf("Total Deduction: ₱%.2f%n",
                                        totalDeduction);
                                System.out.printf("Remaining Balance: ₱%.2f%n",
                                        balance - totalDeduction);
                            } else {
                                System.out.println("Transaction Status: DENIED");
                                System.out.println(
                                        "Reason: Insufficient balance to cover the withdrawal and transaction fee.");
                            }

                        } else {
                            System.out.println("Transaction Status: DENIED");
                            System.out.printf(
                                    "Reason: Withdrawal exceeds the %s daily limit of ₱%.2f.%n",
                                    tier, dailyLimit);
                        }
                    } else {
                        System.out.println("Transaction Status: DENIED");
                        System.out.println(
                                "Reason: Insufficient balance for the requested withdrawal.");
                    }
                } else {
                    System.out.println("Transaction Status: DENIED");
                    System.out.println(
                            "Reason: Withdrawal amount must be greater than zero.");
                }

            } else {
                System.out.println("Authentication: FAILED");
                System.out.println("Transaction Status: DENIED");
                System.out.println(
                        "Reason: Incorrect PIN or PIN must contain exactly 4 digits.");
            }
        } else {
            System.out.println("Authentication: FAILED");
            System.out.println("Transaction Status: DENIED");
            System.out.println("Reason: Incorrect username.");
        }

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

