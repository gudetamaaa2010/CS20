/*
Program: Add Coins          Last Date of this Revision: November 4, 2026

Purpose: Create an application that prompts the user for the number of pennies, nickels, dimes, and quarters then displays their total dollar amount.

*/

package Mastery;

import java.util.Scanner;

public class AddCoins {

    public static void main(String[] args) {
        
    	        // Scanner object
    	        Scanner input = new Scanner(System.in);

    	        // Ask user for number of coins
    	        System.out.print("Enter the number of pennies: ");
    	        int pennies = input.nextInt();

    	        System.out.print("Enter the number of nickels: ");
    	        int nickels = input.nextInt();

    	        System.out.print("Enter the number of dimes: ");
    	        int dimes = input.nextInt();

    	        System.out.print("Enter the number of quarters: ");
    	        int quarters = input.nextInt();

    	        // Calculate total dollar amount
    	        String total = getDollarAmount(pennies, nickels, dimes, quarters);

    	        System.out.println("Total dollar amount: " + total);

    	        
    	    }

    	    // The getDollarAmount method
    	    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {

    	        // Calculate total cents
    	        int totalCents = (pennies * 1) + (nickels * 5)
    	                       + (dimes * 10) + (quarters * 25);

    	        // Convert cents to dollars
    	        double dollars = totalCents / 100.0;

    	        // Return dollar value
    	        return "$" + dollars;
    	    }
    	}

/* screen dump
Enter the number of pennies: 8
Enter the number of nickels: 1
Enter the number of dimes: 2
Enter the number of quarters: 3
Total dollar amount: $1.08

Enter the number of pennies: 4
Enter the number of nickels: 7
Enter the number of dimes: 4
Enter the number of quarters: 2
Total dollar amount: $1.29

 */

