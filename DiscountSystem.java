/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author jltabaosares
 */
public class DiscountSystem {
    
    public static void main(String[] args) {

        // Change this amount to test different discount tiers
        double purchaseAmount = 2500.00;

        double discountRate;
        String discountTier;
        double discountedPrice;

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("    MULTI-TIER DISCOUNT SYSTEM");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        System.out.println("Purchase Amount: PHP " + purchaseAmount);

        // Check which discount the purchase qualifies for
        if (purchaseAmount < 1000) {
            discountRate = 0.00;
            discountTier = "No Discount (0%)";
        } else if (purchaseAmount < 2000) {
            discountRate = 0.05;
            discountTier = "Bronze Discount (5%)";
        } else if (purchaseAmount < 5000) {
            discountRate = 0.10;
            discountTier = "Silver Discount (10%)";
        } else {
            discountRate = 0.15;
            discountTier = "Gold Discount (15%)";
        }

        // Calculate the price after applying the discount
        discountedPrice = purchaseAmount - (purchaseAmount * discountRate);

        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Discount Amount: PHP "
                + String.format("%.2f", purchaseAmount * discountRate));
        System.out.println("Final Discounted Price: PHP "
                + String.format("%.2f", discountedPrice));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

