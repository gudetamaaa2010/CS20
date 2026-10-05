package Skillbuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
	    
	
		
		System.out.print("Enter wind speed value: ");
	       
	     
		//Create a Scanner Object
				Scanner userinput = new Scanner (System.in);
				
			
			
			double speed =userinput.nextDouble();
	        
	        System.out.print("Enter unit (mph, kt, or kmh): ");
	        String unit = userinput.next().toLowerCase();
	        
	        double mph = 0;
	        double kt = 0;
	        double kmh = 0;
	        
	       
	        switch (unit) {
	            case "mph":
	                mph = speed;
	                kt = mph * 0.868976;
	                kmh = mph * 1.60934;
	                break;
	            case "kt":
	            case "knots":
	                kt = speed;
	                mph = kt * 1.15078;
	                kmh = kt * 1.852;
	                break;
	            case "kmh":
	            case "km/h":
	                kmh = speed;
	                mph = kmh / 1.60934;
	                kt = kmh / 1.852;
	                break;
	            default:
	                System.out.println("Invalid unit entered.");
	                
	        }
	        
	        String category = getCategory(mph);
	        
	        System.out.println("Storm Analysis");
	        System.out.printf("MPH: ", mph);
	        System.out.printf("Knots ", kt);
	        System.out.printf("KM/H: ", kmh);
	        System.out.println("Category: " + category);
	        
	        
	    }
	
	    public static String getCategory(double speed) {
	     
	         if (speed < 74) {
	            return "Not a hurricane (Tropical Storm or Depression)";
	        } else if (speed <= 96) {
	            return "Category 1 Hurricane";
	        } else if (speed <= 110) {
	            return "Category 2 Hurricane";
	        } else if (speed <= 129) {
	            return "Category 3 Hurricane";
	        } else if (speed <= 156) {
	            return "Category 4 Hurricane";
	        } else {
	            return "Category 5 Hurricane";
	 
		
	

	        }

        
    } 
}