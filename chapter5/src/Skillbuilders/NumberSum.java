package Skillbuilders;

import java.util.Scanner;

public class NumberSum 
	{

	public static void main(String[] args) 
	{
		int sum = 0;
		int n1;   
		
		Scanner input = new Scanner(System.in);
	        
	       
	        System.out.print("Enter a whole number: ");
	        n1 = input.nextInt();
	        
	      
	        
	       
	        for (int n = 1; n <= n1; n++) 
	{
	            System.out.println(n); 
	            sum += n;
	}
	        
	        
	        System.out.println("The sum is " + sum);
	        
	}
	}