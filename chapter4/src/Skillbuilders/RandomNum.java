/*
Program: random numbers          Last Date of this Revision: September 21, 2026

Purpose: An application that gives out random numbers between a min and max

*/



package Skillbuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args)
	{
		//declare the minimum and max variables
		int min, max;
  
		//introduce the scanner class
		Scanner input = new Scanner (System.in);
		
				
      //prompt the user for the minimum number
		System.out.println ("Enter the min number: ");
	   
		//record the minimum number
		min = input.nextInt();	
		
		
		//prompt the user for the max number
				System.out.println ("Enter the max number: ");
			   
				//record the max number
				max = input.nextInt();	
					
		//generate the random numbers
		System.out.println ("Random number: "+ (int)((max - min +1) * Math.random()+min));
				
		//0.0 - 1.0		
				
				
				
	}

}
/*screen dump
 
 Enter the min number: 
2
Enter the max number: 
34
Random number: 6

Enter the min number: 
9
Enter the max number: 
45
Random number: 41
/* 
 * 
 */


