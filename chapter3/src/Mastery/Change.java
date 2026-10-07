

/*
Program: Change          Last Date of this Revision: September 23 , 2026

Purpose: create a change application that prompts the user for an amount less then 1.00 then  displays the minimum number of coins necessary to make the change.

*/




package Mastery;

import java.util.Scanner;

public class Change 
	{

	public static void main(String[] args)
	{
	 
		//Declare the variables
		int quater = 25;
		int dime = 10;
		int nickel = 5;
		int cents;
		
		//scan the object
		Scanner userinput = new Scanner (System.in);
		
		//ask for the change in cents
		System.out.print("Enter the change in cents: ");
		
		//get the change from the user
		cents= userinput.nextInt();
		
		//calculate the min amount of coins necessary
         
		int quarters = cents / quater;
        cents %= quater;  //taking the remainder of change after quarters
        
        int dimes = cents / dime;
        cents %= dime;    //taking the remainder of the change after dimes
        
        int nickels = cents / nickel;
        
        cents %= nickel  //taking the remainders of change after the dimes
        		;
        
        int pennies = cents; //left over cents are pennies
        
        // display the amount of change in the minimum amount of coins
        System.out.println("Minimum coins required:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
        
	}

    }

/* screen dump
Enter the change in cents: 212
Minimum coins required:
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2
 
 
Enter the change in cents: 520
Minimum coins required:
Quarters: 20
Dimes: 2
Nickels: 0
Pennies: 0 
 */
