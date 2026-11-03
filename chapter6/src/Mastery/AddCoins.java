package Mastery;

import java.util.Scanner;

public class AddCoins {

    public static void main(String[] args) {
        
    	//scanner object
    	Scanner input = new Scanner(System.in);
        
    	//ask user for number of pennies they wish to calculate.
    	System.out.print("Enter the number of pennies: ");
        int pennies = input.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = input.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = input.nextInt();
        System.out.print("Enter the number of quarters: ");
        int quarters = input.nextInt();
        
        String total = getDollarAmount(pennies, nickels, dimes, quarters);
        System.out.println("Total dollar amount: " + total);
        
       
    }

    // the getDollarAmount method () method
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        //calculations to count total cents
    	int totalCents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);
        //convert cents to dollars
    	double dollars = totalCents / 100.0;
       //display dollar value
    	return String.format("$%.2f", dollars);
    }
}

