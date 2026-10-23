/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author jltabaosares
 */
public class Favorites {
    
 public static void main(String[] args) {
        
        //Header 
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("   THINGS I CANNOT LIVE WITHOUT");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        
        // Store my five favorite things in an array
        String[] favorites = {
            "Kageyama Tobio",
            "Olivia Rodrigo",
            "Bulalo",
            "Music",
            "Bingsu"
        };

        // Print each favorite with its number
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        // Print the total number of favorite things
       
        System.out.println("Total number of favorites: " + favorites.length);
    }
}


