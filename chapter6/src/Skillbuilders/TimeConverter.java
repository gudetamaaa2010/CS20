package Skillbuilders;

import java.util.Scanner;

public class TimeConverter 
		{

	public static void main(String[] args)
	{
		
	     Scanner userinput = new Scanner(System.in);
	        int choice;

	        System.out.println("Time Converter Menu");
	        System.out.println("1. Convert Hours to Minutes");
	        System.out.println("2. Convert Days to Hours");
	        System.out.println("3. Convert Minutes to Hours and Days");
	       
	        System.out.print("Enter your choice (1-3): ");
	        
	        if (userinput.hasNextInt()) {
	            choice = userinput.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    convertHoursToMinutes(userinput);
	                    break;
	                case 2:
	                    convertDaysToHours(userinput);
	                    break;
	                case 3:
	                    convertMinutesToHoursAndDays(userinput);
	                    break;
	                default:
	                    System.out.println("Error: Invalid choice! Please select a number between 1 and 3.");
	            }
	        } else {
	            System.out.println("Error: Please enter a valid number.");
	        }
	        
	        
	    }

	    // 1. Convert Hours to Minutes (1 hour = 60 minutes)
	    public static void convertHoursToMinutes(Scanner input) {
	        System.out.print("Enter the number of hours: ");
	        if (input.hasNextDouble()) {
	            double hours = input.nextDouble();
	            double minutes = hours * 60;
	            System.out.println(hours + " hours is equal to " + minutes + " minutes.");
	        } else {
	            System.out.println("Error: Invalid input for hours.");
	        }
	    }

	    // 2. Convert Days to Hours (1 day = 24 hours)
	    public static void convertDaysToHours(Scanner input) {
	        System.out.print("Enter the number of days: ");
	        if (input.hasNextDouble()) {
	            double days = input.nextDouble();
	            double hours = days * 24;
	            System.out.println(days + " days is equal to " + hours + " hours.");
	        } else {
	            System.out.println("Error: Invalid input for days.");
	        }
	    }

	    // 3. Convert Minutes to Hours and Days
	    public static void convertMinutesToHoursAndDays(Scanner input) {
	        System.out.print("Enter the number of minutes: ");
	        if (input.hasNextDouble()) {
	            double minutes = input.nextDouble();
	            
	            // Calculate total hours and total days independently
	            double totalHours = minutes / 60;
	         // 60 minutes * 24 hours = 1440 minutes in a day
	            double totalDays = minutes / 1440; 
	            
	            System.out.println(minutes + " minutes is equal to " + totalHours + " hours.");
	            System.out.println(minutes + " minutes is equal to " + totalDays + " days.");
	        } else {
	            System.out.println("Error: Invalid input for minutes.");
	        }
	    }
	}
	
		
		
		
		


	
