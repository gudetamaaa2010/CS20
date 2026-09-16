package Skillbuilders;

import java.util.Scanner;

public class Digit 
{

	public static void main(String[] args) 
	{
		
	//declare the variables
	int digit;
	int tens;
	int ones;
	
	
		//Create a Scanner Object
		Scanner userinput = new Scanner (System.in);
		
		//ask for the two-digit number
		System.out.println ("type in your two-digit number: ");
		
		//Get the two digit number from the user
				digit = userinput.nextInt();
		
		//Display the user's two digit number
		System.out.println("your two digit number: " + digit);
		
		//calculate then tens
		tens = (digit / 10);
		ones = (digit % 10);
		
		//display the digit's ones and tenth place
		System.out.println("the tens place of your two digit number is: " + tens);
		System.out.println("the ones place of your two digit numer is: " + ones);
		
	}
}