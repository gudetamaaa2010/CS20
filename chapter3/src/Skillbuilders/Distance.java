package Skillbuilders;

import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{
		
		double distance1;
		double distance2;
		double distance3;
		double total;
		
		//Create a Scanner Object
		Scanner userinput = new Scanner (System.in);
		
		//Ask the user to enter the first distance
		System.out.print("Enter the distance of the first segment: ");
				
		
		//Get the first distance value from the user
		distance1 = userinput.nextDouble();
		
		//Ask the user to enter the second distance
		System.out.print("Enter the distance of the second segment: ");
		
		//Get the second distance value from the user
				distance2 = userinput.nextDouble();
			
				
		//Ask the user to enter the third distance
		System.out.print ("Enter the distance of the third segment: ");
		
		//Get the third distance value from user
		distance3 = userinput.nextDouble();
		
		//Display the 3 distance segments on the console
				System.out.println("The distance of segment 1 is: " + distance1);
				System.out.println("The distance of segment 2 is: " + distance2);
		        System.out.println("the distance of segment 3 is: " + distance3);
		        
		      //calculate the total distance
				total = ( distance1 +  distance2 + distance3);
				
				//Display the total distance
				System.out.println("Total distance to run = " + total);
	}
	
}