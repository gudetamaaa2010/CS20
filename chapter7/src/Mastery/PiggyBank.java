	/*
Program: My Savings         Last Date of this Revision: November 16, 2026

Purpose: Create an MySavings application that that displays a menu of choices for entering pennies, nickels, dimes, and quarters into the bank and then prompts the user to make a selection.
*/
	


		package Mastery;

		public class PiggyBank 
	{

		//declare variables
	    private int pennies;
	    private int nickels;
	    private int dimes;
	    private int quarters;

	    public PiggyBank() 
	{  //variable values
	        pennies = 0;
	        nickels = 0;
	        dimes = 0;
	        quarters = 0;
	}
	    //adding a penny
	    public void addPenny() 
	{
	        pennies++;
	}
	    //adding a nickel
	    public void addNickel() 
	{
	        nickels++;
	}
	    //adding a dime
	    public void addDime() 
	{
	        dimes++;
	}
	    //adding a quarter
	    public void addQuarter() 
	{
	        quarters++;
	}
	    //calculating the total
	    public double getTotal() 
	{
	        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
	}
	    //code for taking out money
	    public void takeOut(double amount) 
	{
	     //conditions, making sure the value is greater then 0  
	    	if (amount <= 0) 
	{
	            System.out.println("Amount must be greater than $0.00.");
	            return;
	}
	        //conditions, checking if the amount they wish to withdraw is more then what they have in the bank
	    	if (amount > getTotal()) 
	{
	            System.out.println("Not enough money in the bank.");
	            return;
	}

	        // Convert to cents to avoid decimal math bugs when removing coins
	        int centsToRemove = (int) Math.round(amount * 100);

	        while (centsToRemove >= 25 && quarters > 0) 
	{
	            quarters--;
	            centsToRemove -= 25;
	}
	        while (centsToRemove >= 10 && dimes > 0) 
	{
	            dimes--;
	            centsToRemove -= 10;
	}
	        while (centsToRemove >= 5 && nickels > 0) 
	{
	            nickels--;
	            centsToRemove -= 5;
	}
	        while (centsToRemove >= 1 && pennies > 0) 
	{
	            pennies--;
	            centsToRemove -= 1;
	}

	        if (centsToRemove > 0) 
	{
	            //displaying response according to the number they take out
	        	System.out.println("Could not make exact change with available coins.");
	}
	}
	}

