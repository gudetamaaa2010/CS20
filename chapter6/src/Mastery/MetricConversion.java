
/*
Program: MetricConversion       Last Date of this Revision: October 28 , 2026

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

*/

package Mastery;

import java.util.Scanner;

public class MetricConversion 
	{

	public static void main(String[] args) 
	{
	
		//scan user's choices (scanner object)
		 Scanner userinput = new Scanner(System.in);
	    //declare variables    
		 int choice;
		//display conversion options
	        System.out.println("Metric conversion Menu");
	        System.out.println("1. Convert Inches to Centimeters");
	        System.out.println("2. convert Feet to Centimeters");
	        System.out.println("3. Convert Yards to Meters");
	        System.out.println("4. Convert Miles to Kilometers");
	        System.out.println("5. Convert Centimeters to Inches");
	        System.out.println("6. Convert Centimeters to Feet");
	        System.out.println("7. Convert Meters to Yards");
	        System.out.println("8. Convert Kilometers to Miles");
	     //display question   
	        System.out.print("Enter your choice (1-8): ");
	     //a switch statement nested inside a what if statement   
	        if (userinput.hasNextInt()) 
	 {
	            choice = userinput.nextInt();
	            
	            switch (choice) 
	 {
	                case 1:
	                    convertInchestoCentimeters(userinput);
	                    break;
	                case 2:
	                    convertFeettoCentimeters(userinput);
	                    break;
	                case 3:
	                    convertYardstoMeters(userinput);
	                    break;
	                case 4:
	                    convertMilestoKilometers(userinput);
	                    break;
	                case 5:
	                    convertCentimeterstoInches(userinput);
	                    break;
	                case 6:
	                    convertCentimeterstoFeet(userinput);
	                    break;
	                case 7:
	                    convertMeterstoYards(userinput);
	                    break;
	                case 8:
	                    convertKilometerstoMiles(userinput);
	                    break;
	                
	                    
	                default:
	                    System.out.println("Error: Invalid choice! Please select a number between 1 and 8.");
	   }
	   }            else 
	   {
	            System.out.println("Error: Please enter a valid number.");
	   }
	        
	        
	 	}
			//converting meters to yards (meters / 0.9)
	      public static void convertMeterstoYards(Scanner userinput) 
	    {
	    	  System.out.print("Enter the number of meters: ");
		        if (userinput.hasNextDouble()) 
        {
		            double meters = userinput.nextDouble();
		            double yards = meters / 0.91;
		    //display values        
		            System.out.println(meters + " inches is equal to " + yards + " yards.");
        }          else 
        {
		            System.out.println("Error: Invalid input for meters.");
		}
		
	    }
	      //converting kilometers to miles (kilometers /1.6)
		  public static void convertKilometerstoMiles(Scanner userinput) 
		{
			System.out.print("Enter the number of kilometers: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double kilometers = userinput.nextDouble();
	            double miles = kilometers / 1.6;
	      //display values    
	            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
	    }    else 
	    {
	            System.out.println("Error: Invalid input for kilometers.");
	    }
		
		}
		  //converting centimeters to feet (centimeters /30)
		  public static void convertCentimeterstoFeet(Scanner userinput) 
		{
			System.out.print("Enter the number of centimeters: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double centimeters = userinput.nextDouble();
	            double feet = centimeters/ 30;
	      //display values   
	            System.out.println(centimeters + "centimeters is equal to " + feet + " feet.");
	    }   else 
	    {
	            System.out.println("Error: Invalid input centimeters.");
	    }
		
		}
		  //converting centimeters to inches ( centimeters / 2.54)
		  public static void convertCentimeterstoInches(Scanner userinput) 
		{
			System.out.print("Enter the number of centimeters: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double centimeters = userinput.nextDouble();
	            double inches = centimeters / 2.54;
	      //display values    
	            System.out.println(centimeters + " centimeters is equal to " + inches + " inches.");
	    }     else 
	    {
	            System.out.println("Error: Invalid input for centimeters.");
	    }
		
		}
		  //converting miles to kilometers (miles * 1.6)
		  public static void convertMilestoKilometers(Scanner userinput) 
		{
			System.out.print("Enter the number of miles: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double miles = userinput.nextDouble();
	            double kilometers = miles * 1.6;
	      //display values      
	            System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
	    }  else 
	    {
	            System.out.println("Error: Invalid input for miles.");
	    }
		
		}
		  //converting yards to meters (yard * 0.91)
		  public static void convertYardstoMeters(Scanner userinput) 
		{
			System.out.print("Enter the number of yards: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double yards = userinput.nextDouble();
	            double meters= yards * 0.91;
	      //display values     
	            System.out.println(yards + " yards is equal to " + meters + " meters.");
	    }   else 
	    {
	            System.out.println("Error: Invalid input for yards.");
	    }
		
		}
		  //converting feet to centimeters (feet * 30)
		  public static void convertFeettoCentimeters(Scanner userinput) 
		{
			System.out.print("Enter the number of feet: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double feet = userinput.nextDouble();
	            double centimeters = feet * 30;
	      //display values  
	            System.out.println(feet + " feet is equal to " + centimeters + " centimeters.");
	    }   else 
	    {
	            System.out.println("Error: Invalid input for feet.");
	    }
		
	    } 

		  // convert inches to centimeters (inches * 2.54)
	      public static void convertInchestoCentimeters(Scanner userinput) 
	    {
	    	System.out.print("Enter the number of inches: ");
	        if (userinput.hasNextDouble()) 
	    {
	            double inches = userinput.nextDouble();
	            double centimeters = inches * 2.54;
	      //display values    
	            System.out.println(centimeters + " centimeters is equal to " + inches + " inches.");
	    }   else 
	    {
	            System.out.println("Error: Invalid input for centimeters.");
	    }
		
	    }


		}

/*screen dump
Metric conversion Menu
1. Convert Inches to Centimeters
2. convert Feet to Centimeters
3. Convert Yards to Meters
4. Convert Miles to Kilometers
5. Convert Centimeters to Inches
6. Convert Centimeters to Feet
7. Convert Meters to Yards
8. Convert Kilometers to Miles
Enter your choice (1-8): 1
Enter the number of inches: 10
25.4 centimeters is equal to 10.0 inches.


Metric conversion Menu
1. Convert Inches to Centimeters
2. convert Feet to Centimeters
3. Convert Yards to Meters
4. Convert Miles to Kilometers
5. Convert Centimeters to Inches
6. Convert Centimeters to Feet
7. Convert Meters to Yards
8. Convert Kilometers to Miles
Enter your choice (1-8): 9
Error: Invalid choice! Please select a number between 1 and 8.

Metric conversion Menu
1. Convert Inches to Centimeters
2. convert Feet to Centimeters
3. Convert Yards to Meters
4. Convert Miles to Kilometers
5. Convert Centimeters to Inches
6. Convert Centimeters to Feet
7. Convert Meters to Yards
8. Convert Kilometers to Miles
Enter your choice (1-8): 2
Enter the number of feet: 5.9
5.9 feet is equal to 177.0 centimeters.

*/
