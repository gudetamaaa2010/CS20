/*
Program: Digit Extractor         Last Date of this Revision: November 26, 2026

Purpose: Create a Digit Extractor application that prompts the user for an integer and then displays the ones, tens, hundreds digit of the number.
*/

		package Mastery;

		import java.util.Scanner; 

		public class DigitExtractor {
		    public static void main(String[] args) {
		        // Scanner and declare variables
		        Scanner input = new Scanner(System.in);
		        int userNum;
		        String choice;

		        // Prompt for the initial integer
		        System.out.print("Enter an integer: ");
		        userNum = input.nextInt();

		        // Create the Num object
		        Num numObj = new Num(userNum);

		        // Loop the menu until the user chooses Q or q
		        do {
		            System.out.println("\nshow (W)hole number.");
		            System.out.println("show (O)nes place number.");
		            System.out.println("show (T)ens place number.");
		            System.out.println("show (H)undreds place number.");
		            System.out.println("(Q)uit");
		            System.out.print("Enter your choice: ");
		            choice = input.next();

		            if (choice.equalsIgnoreCase("W")) {
		                System.out.println("The whole number is: " + numObj.getWhole());
		            } else if (choice.equalsIgnoreCase("O")) {
		                System.out.println("The ones place digit is: " + numObj.getOnes());
		            } else if (choice.equalsIgnoreCase("T")) {
		                System.out.println("The tens place digit is: " + numObj.getTens());
		            } else if (choice.equalsIgnoreCase("H")) {
		                System.out.println("The hundreds place digit is: " + numObj.getHundreds());
		            } else if (!choice.equalsIgnoreCase("Q")) {
		                System.out.println("Invalid choice.");
		            }
		        } while (!choice.equalsIgnoreCase("Q"));

		       
		    }
		}

/* screen dump
Enter an integer: 123

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 1

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: q


Enter an integer: 345

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 5

show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: w
The whole number is: 345

 */


