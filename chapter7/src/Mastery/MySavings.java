/*
Program: My Savings         Last Date of this Revision: November 16, 2026

Purpose: Create an MySavings application that that displays a menu of choices for entering pennies, nickels, dimes, and quarters into the bank and then prompts the user to make a selection.
*/


			package Mastery;

			import java.util.Scanner;

			public class MySavings 
		           {
		    public static void main(String[] args) 
		           {
		        Scanner input = new Scanner(System.in);
		        PiggyBank bank = new PiggyBank();
		        int choice;

		        do 
		            {
		            System.out.println("\n1. Show total in bank");
		            System.out.println("2. Add a penny");
		            System.out.println("3. Add a nickel");
		            System.out.println("4. Add a dime");
		            System.out.println("5. Add a quarter");
		            System.out.println("6. Take money out of bank");
		            System.out.println("0. Quit");
		            System.out.print("Enter your choice: ");
		            choice = input.nextInt();

		            if (choice == 1) 
		            {
		                System.out.printf("Total: $%.2f%n", bank.getTotal());
		            } 
		            else if (choice == 2) 
		            {
		                bank.addPenny();
		            } 
		            else if (choice == 3) 
		            {
		                bank.addNickel();
		            } 
		            else if (choice == 4) 
		            {
		                bank.addDime();
		            } 
		            else if (choice == 5) 
		            {
		                bank.addQuarter();
		            } 
		            else if (choice == 6) 
		            {
		                System.out.print("Enter amount to remove: ");
		                double amount = input.nextDouble();
		                bank.takeOut(amount);
		            } 
		            else if (choice != 0) 
		            {
		                System.out.println("Invalid choice.");
		            }
		            } 
		        while (choice != 0);

		        input.close();
		           }
		           }
		

/* screen dump
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice: 2

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
0. Quit
Enter your choice: 0

 */