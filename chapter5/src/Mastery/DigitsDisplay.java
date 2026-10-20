/*
Program: DigitsDisplay       Last Date of this Revision: October 20 , 2026

Purpose: Create a DigitsDisplay application that prompts the user for a non negative number and then displays each digit on a separate line.

*/

package Mastery;

import java.util.Scanner;

public class DigitsDisplay 
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
		
		
		//display the first digit of the 3 digit number
		System.out.println("the digit in the ones place is: "+ ones);
		
		//display the first digit of the 3 digit number
		System.out.println("the digit in the tens is: "+ tens);
		
		
		//display the first digit of the 3 digit number
		System.out.println("the digit in the hundreds place is: "+ hundreds);
				
	

	}

	}

/*screen dump
 * 
Enter your positive 3 digit number: 345
the digit in the ones place is: 3
the digit in the tens is: 4
the digit in the hundreds place is: 5

Enter your positive 3 digit number: 937
the digit in the ones place is: 9
the digit in the tens is: 3
the digit in the hundreds place is: 7
*/
