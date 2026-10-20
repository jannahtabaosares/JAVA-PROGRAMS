/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author jltabaosares
 */
public class OverFlow {
   
    public static void main(String[] args) {
    
    String stringOne = new String ("69");
    String stringTwo = new String ("69");
    String stringThree = "69";
    
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println( "OVERFLOW AND REFERENCE INVESTIGATOR" );
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println( stringOne == stringTwo );
        System.out.println( stringOne == stringThree );
        System.out.println( stringTwo == stringThree );
        System.out.println( stringOne.equals(stringTwo));
        System.out.println( stringOne.equals(stringThree));
        System.out.println( stringTwo.equals(stringThree));
        
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

          System.out.println("\nArray before modification:");
          System.out.println("array1[1]: " + array1[1]);

          array2[1] = 99;

          System.out.println("\nArray after modification:");
          System.out.println("array1[1]: " + array1[1]);
          System.out.println("array2[1]: " + array2[1]);
    
    }
}
