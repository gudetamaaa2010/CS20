package Mastery;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
	
		
		 Scanner userinput = new Scanner(System.in);
	        int choice;

	        System.out.println("Metric conversion Menu");
	        System.out.println("1. Convert Inches to Centimeters");
	        System.out.println("2. convert Feet to Centimeters");
	        System.out.println("3. Convert Yards to Meters");
	        System.out.println("4. Convert Miles to Kilometers");
	        System.out.println("5. Convert Centimeters to Inches");
	        System.out.println("6. Convert Centimeters to Feet");
	        System.out.println("7. Convert Meters to Yards");
	        System.out.println("8. Convert Kilometers to Miles");
	        
	        System.out.print("Enter your choice (1-8): ");
	        
	        if (userinput.hasNextInt()) {
	            choice = userinput.nextInt();
	            
	            switch (choice) {
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
	                    System.out.println("Error: Invalid choice! Please select a number between 1 and 3.");
	            }
	        } else {
	            System.out.println("Error: Please enter a valid number.");
	        }
	        
	        
	    }

	    public static void convertMeterstoYards(Scanner userinput) {
	    	  System.out.print("Enter the number of meters: ");
		        if (userinput.hasNextDouble()) {
		            double meters = userinput.nextDouble();
		            double yards = meters * 0.91;
		            System.out.println(meters + " inches is equal to " + yards + " yards.");
		        } else {
		            System.out.println("Error: Invalid input for meters.");
		        }
		
	}

		public static void convertKilometerstoMiles(Scanner userinput) {
			System.out.print("Enter the number of kilometers: ");
	        if (userinput.hasNextDouble()) {
	            double kilometers = userinput.nextDouble();
	            double miles = kilometers * 1.6;
	            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
	        } else {
	            System.out.println("Error: Invalid input for kilometers.");
	        }
		
	}

		public static void convertCentimeterstoFeet(Scanner userinput) {
			System.out.print("Enter the number of centimeters: ");
	        if (userinput.hasNextDouble()) {
	            double centimeters = userinput.nextDouble();
	            double feet = centimeters/ 30;
	            System.out.println(centimeters + "centimeters is equal to " + feet + " feet.");
	        } else {
	            System.out.println("Error: Invalid input centimeters.");
	        }
		
	}

		public static void convertCentimeterstoInches(Scanner userinput) {
			System.out.print("Enter the number of centimeters: ");
	        if (userinput.hasNextDouble()) {
	            double centimeters = userinput.nextDouble();
	            double inches = centimeters / 2.54;
	            System.out.println(centimeters + " centimeters is equal to " + inches + " inches.");
	        } else {
	            System.out.println("Error: Invalid input for centimeters.");
	        }
		
	}

		public static void convertMilestoKilometers(Scanner userinput) {
			System.out.print("Enter the number of miles: ");
	        if (userinput.hasNextDouble()) {
	            double miles = userinput.nextDouble();
	            double kilometers = miles * 1.6;
	            System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
	        } else {
	            System.out.println("Error: Invalid input for miles.");
	        }
		
	}

		public static void convertYardstoMeters(Scanner userinput) {
		
		
	}

		public static void convertFeettoCentimeters(Scanner userinput) {
		
		
	}

		// 1. Convert Hours to Minutes (1 hour = 60 minutes)
	    public static void convertInchestoCentimeters(Scanner userinput) {
		
		
	}

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
		
		
		
		

	}

}
