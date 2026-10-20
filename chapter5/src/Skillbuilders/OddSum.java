package Skillbuilders;

import java.util.Scanner;

public class OddSum 
	{
	  public static void main(String[] args) {
	        int sum = 0;
	        int n1;
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter an odd whole number: ");
	        n1 = input.nextInt();
	        
	        for (int n = 1; n <= n1; n++) {
	            if (n % 2 != 0) {
	                System.out.println(n);
	                sum += n;
	            }
	        } 
	        
	        // outside the loop, so it runs only once at the very end
	        System.out.println("The sum is " + sum); 
	        
	     
	    }
	}
	
