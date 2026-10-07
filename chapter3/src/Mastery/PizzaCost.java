
/*
Program: Pizza Cost          Last Date of this Revision: September 21, 2026

Purpose: Create  a PizzaCost application that prompts the user for the size of a pizza and then display the cost of making the pizza.

*/

package Mastery;

import java.util.Scanner;

public class PizzaCost 
	{

	public static void main(String[] args) 
	{

     //declare variables
	double labor = 0.75;	
	double rent=1.00;
	double diameter;
	double total;
	
	//Create a Scanner Object
			Scanner userinput = new Scanner (System.in);
			
	//Ask the user to enter the diameter of their pizza in inches
			System.out.print("Enter the diameter of your pizza in inches: ");
					
			
	//Get the first distance value from the user
			diameter = userinput.nextDouble();
	
	//calculate total coast of pizza
	
	total = (labor + rent + 0.05*diameter*diameter);
	
	//display the total coast of their pizza
	
	System.out.print("the total cost of making your pizza is:$" +total);
	
	
	}

	}


/*screen dump
Enter the diameter of your pizza in inches: 10
the total cost of making your pizza is:$6.75

Enter the diameter of your pizza in inches: 15
the total cost of making your pizza is:$13.0

*/

