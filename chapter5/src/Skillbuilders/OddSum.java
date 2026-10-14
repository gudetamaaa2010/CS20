package Skillbuilders;

import java.util.Scanner;

public class OddSum 
	{

	public static void main(String[] args) 
	{
		
		int sum = 0;
		int n1;   
		
		Scanner input = new Scanner(System.in);
	        
	       
	        System.out.print("Enter a odd whole number: ");
	        n1 = input.nextInt();
	        
	      
	    	for (int n = 1; n<= 20; n++) 
	    	{

	    			if (n % 2!= 0) 
	    	
	    	{
	                    
	    				System.out.println(n);
	    				sum += n;
	    	}
	    	        
	    	        
	    	        System.out.println("The sum is " + sum);
	    	}	
		
		
		
		
		
		
		
		
		
		
	    	}
		

	}

	
	
