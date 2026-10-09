/*
Program: Eggs       Last Date of this Revision: October 9 , 2026

Purpose: Create an egg application that prompts the user for the number of eggs, and then calculates the bill.
*/




package Mastery;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
	
		//declare variables
	    int eggs;
	    double total;
	
	
	    
	    //create a scanner object    
	    Scanner userinput = new Scanner(System.in);
	    
	   
	    //Ask the user to enter the amount  of eggs they want to purchase  
	    System.out.print("enter the amount of eggs purchased: ");
	    
	    //get the amount of eggs from the user
	    eggs = userinput.nextInt(); 
	     
	   
	    
	    //get the price per dozen   
	      double pricePerDozen = pricePerDozen(eggs);
	   
	   
	    //calculating what a dozen is
	      int dozens = eggs / 12;
	  
	    //calculating the extra eggs   
	      int extraEggs = eggs % 12;
	  
	    //the defining pricePerExtraEgg   
	      double pricePerExtraEgg = pricePerDozen / 12.0;
	   
	    //calculating the total 
	      total = (dozens * pricePerDozen) + (extraEggs * pricePerExtraEgg);
	    
	    
	    	

	    
	  //display the bill  
	    System.out.println("Your bill is equal to: $ " + total);	
	
}

	  //a method call that sends the user's number of eggs into the method and replaces itself with the matching price number.
 public static double pricePerDozen(int eggs) 
{
     
     if (eggs < 48 ) 
{
        return 0.50;
} 
     else if (eggs < 72) 
{
        return 0.45;
} 
     else if (eggs < 132) 
{
        return 0.27;
} 
  

     else 
{
        return 0.35;    

}

}
    				

}


/*screen dump

enter the amount of eggs purchased: 18
Your bill is equal to: $ 0.75


enter the amount of eggs purchased: 12
Your bill is equal to: $ 0.5
*/
