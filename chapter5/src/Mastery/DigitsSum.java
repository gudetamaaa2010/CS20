
/*
Program: DigitsSum      Last Date of this Revision: October 22 , 2026

Purpose: Create a DigitsSum application that prompts the user for a non negative integer and then displays the sum of the digits.

*/




package Mastery;

import java.util.Scanner;

public class DigitsSum 
	{

	public static void main(String[] args) 
	{
		
				//declare variables
				int num;
				
				//scan the object
				Scanner userinput = new Scanner (System.in);
						
				//ask for a positive 3 digit number
				System.out.print("Enter your positive 3 digit number: ");
					
				//get the change from the user
				num= userinput.nextInt();
				
				
				//calculate the integer in the ones place for the inputed 3 digit number
				int ones = num / 100;
				
				//calculate the integer in the tens place for the inputed 3 digit number
				
				int tens = (num / 10) %10;
				
				//calculate the integer in the hundreds place for the inputed 3 digit number
				int hundreds = num % 10;
				
				//Calculate the sum of the digits
				
				 int sum = (ones + tens + hundreds );
		
		
				 //display sum of digits
				 
				 System.out.print("The sum of the digits is: " + sum);
		

	}

	}
/*screen dump
 Enter your positive 3 digit number: 892
The sum of the digits is: 19

Enter your positive 3 digit number: 567
The sum of the digits is: 18
*/