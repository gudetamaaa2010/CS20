	package Mastery;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double total = 0.0; 
        int choice;

        do {
            System.out.println("\n1. Show total in bank");
            System.out.println("2. Add a penny");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of bank");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
             
                System.out.println("Total: $" + total); 
            } else if (choice == 2) {
                total += 0.01; 
            } else if (choice == 3) {
                total += 0.05; 
            } else if (choice == 4) {
                total += 0.10; 
            } else if (choice == 5) {
                total += 0.25; 
            } else if (choice == 6) {
                System.out.print("Enter amount to remove: ");
                double amount = input.nextDouble();
                total -= amount; 
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        
    }
}

