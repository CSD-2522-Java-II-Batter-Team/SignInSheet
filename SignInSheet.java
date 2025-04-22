/**
 * Author Name: Seth I.
 * Date: 4/21/25
 * File Name: SignInSheet.java
 * Last Update: 4/21/25 by Seth I.
 * Program Description: Program allows a user to enter their name into an array and prints out a confirmation message when ran.
 */

/*
============= CHANGE LOG =============
Seth I. - 4/21/25 - Added Seth as the first element in the nameList array.


======================================
 */

 public class SignInSheet {

    public static void main(String[] args) {
        
        // Array to store our names
        String[] nameList = new String[6];
        
        // Enter your name in the below list on the first available index you see. See my name for an example.
        nameList[0] = "Seth";
        nameList[1] = "_______";
        nameList[2] = "_______";
        nameList[3] = "_______";
        nameList[4] = "_______";
        nameList[5] = "_______";
        
        // Prints out statement showing you've modified the file.
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            if (!nameList[i].isEmpty()) System.out.println("Hello, I'm " + nameList[i] + " and I'm able to modify the code!");
        }
        System.out.println();
    }
    
}
