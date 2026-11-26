	/*
Program: My Savings         Last Date of this Revision: November 16, 2026

Purpose: Create an MySavings application that that displays a menu of choices for entering pennies, nickels, dimes, and quarters into the bank and then prompts the user to make a selection.
*/
	

		package Mastery;

		public class PiggyBank 
	{
        //declaring private variables
		private int pennies;
		private int nickels;
		private int dimes;
		private int quarters;
    
	{
		//setting initial values to zero
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }
		//method to add  pennies
		public void addPenny() 
	{
		//adding pennies by 1	
        pennies++;
    }
		//method to add nickels
		public void addNickel() 
    {
		//adding nickels by 1	
        nickels++;
    }
		//method to add dimes
		public void addDime() 
    {
		//adding dimes by 1	
        dimes++;
    }
		//method to add quarters
		public void addQuarter() 
    {
		//adding quarters by 1	
        quarters++;
    }
		//method to calculate the total
		public double getTotal() 
    {
        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
    }
		//method to take out a specific amount
		public void takeOut(double amount) 
    {
		//checking if the withdraw is negative or zero	
        if (amount <= 0) 
    {		
        //text to display when there's an error	
            System.out.println("Amount must be greater than $0.00.");
            return;
    }
        //checking if user is trying to withdraw more money than they have.
        if (amount > getTotal()) 
    {
        //prints if there are insufficient funds in the bank
            System.out.println("Not enough money in the bank.");
            return;
   }
        //converting dollar amount into whole numbers
        int centsToRemove = (int) Math.round(amount * 100);
        //temporary coin variables to avoid losing change is the program fails to make exact change.
        int tempQuarters = quarters;
        int tempDimes = dimes;
        int tempNickels = nickels;
        int tempPennies = pennies;

        //loops as long as quarters are still need and temporary quarters exist
        while (centsToRemove >= 25 && tempQuarters > 0) 
   {
        	 //removes one quarter from the temporary count
            tempQuarters--; 
          //subtracts one quarter from the remaining amount needed
            centsToRemove -= 25;
   }
        //loops as long as dimes are still need and temporary dimes exist.
        while (centsToRemove >= 10 && tempDimes > 0) 
   {
        	//removes one dime from the temporary count
            tempDimes--; 
            //subtracts one dime from the remaining amount needed
            centsToRemove -= 10;
   }
      //loops as long as nickels are still need and temporary dimes exist.
        while (centsToRemove >= 5 && tempNickels > 0) 
   {
        	//removes one nickel from the temporary count
        	tempNickels--;
        	//subtracts one nickel from the remaining amount needed
        	centsToRemove -= 5;
   }
      //loops as long as pennies are still need and temporary dimes exist
        while (centsToRemove >= 1 && tempPennies > 0) 
   {
        	//removes one pennies from the temporary count
        	tempPennies--;
        	//subtracts one pennies from the remaining amount needed
        	centsToRemove -= 1;
   }
        //checks for left over money that the coins couldn't be made with available codes
        if (centsToRemove > 0) 
   {
        //displays if code could not make exact change    
        	System.out.println("Could not make exact change with available coins.");
   } 	
        //this runs when the amount reaches 0 and the exact change was made.
        else 
   {		
        	// Updates the real quarter count with the remaining temporary quarters
        	quarters = tempQuarters;
        	// Updates the real dime count with the remaining temporary dimes
        	dimes = tempDimes;
        	// Updates the real nickel count with the remaining temporary nickels
        	nickels = tempNickels;
            //Updates the real pennies count with the remaining temporary pennies
        	pennies = tempPennies;
    } 
    }
	}


