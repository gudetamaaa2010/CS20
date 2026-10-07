
/*
Program: Printing       Last Date of this Revision: October 7 , 2026

Purpose: Create a printing application that prompts the user for the number of copies to print and then display the price per copy and the total price for the job.

*/


package Mastery;

import java.util.Scanner;

public class Printing 
  {

	public static void main(String[] args) 
  {
		
		
		//declare variables
		    int copies;
		    double total;
		   
		//create a scanner object    
		    Scanner userinput = new Scanner(System.in);
		    
		   
		//Ask the user to enter the amount they wish to print   
		    System.out.print("enter the amount of copies you wish to print: ");
		    copies = userinput.nextInt(); 
		     
		   
		 //calculate the total cost for the job   
		    total = copies*getCategory(copies);
		   
		    
		  //display the price per copy  
		    
		    System.out.println("Price per copy is: " + getCategory(copies));	
	
		    
		  //display the total price  
		    System.out.println("Total cost is: $ " + total);	
		
   }

		//a method call that sends the user's number of copies into the method and replaces itself with the matching price number.
	 public static double getCategory(int copies) 
   {
	     
         if (copies < 100) 
   {
            return 0.30;
   } 
         else if (copies <= 499) 
   {
            return 0.28;
   } 
         else if (copies <= 749) 
   {
            return 0.27;
   } 
         else if (copies <= 1000) 
   {
            return 0.26;
   } 
         else 
   {
            return 0.25;    

   }

   }
	    
	 
	 
   }

/*screen dump


enter the amount of copies you wish to print: 1001
Price per copy is: 0.25
Total cost is: $ 250.25

enter the amount of copies you wish to print: 643
Price per copy is: 0.27
Total cost is: $ 173.61

*/




