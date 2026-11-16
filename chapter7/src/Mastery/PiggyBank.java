package Mastery;

public class PiggyBank {


	    private int pennies;
	    private int nickels;
	    private int dimes;
	    private int quarters;

	    public PiggyBank() {
	        pennies = 0;
	        nickels = 0;
	        dimes = 0;
	        quarters = 0;
	    }

	    public void addPenny() {
	        pennies++;
	    }

	    public void addNickel() {
	        nickels++;
	    }

	    public void addDime() {
	        dimes++;
	    }

	    public void addQuarter() {
	        quarters++;
	    }

	    public double getTotal() {
	        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
	    }

	    public void takeOut(double amount) {
	        if (amount <= 0) {
	            System.out.println("Amount must be greater than $0.00.");
	            return;
	        }
	        if (amount > getTotal()) {
	            System.out.println("Not enough money in the bank.");
	            return;
	        }

	        // Convert to cents to avoid decimal math bugs when removing coins
	        int centsToRemove = (int) Math.round(amount * 100);

	        while (centsToRemove >= 25 && quarters > 0) {
	            quarters--;
	            centsToRemove -= 25;
	        }
	        while (centsToRemove >= 10 && dimes > 0) {
	            dimes--;
	            centsToRemove -= 10;
	        }
	        while (centsToRemove >= 5 && nickels > 0) {
	            nickels--;
	            centsToRemove -= 5;
	        }
	        while (centsToRemove >= 1 && pennies > 0) {
	            pennies--;
	            centsToRemove -= 1;
	        }

	        if (centsToRemove > 0) {
	            System.out.println("Could not make exact change with available coins.");
	        }
	    }
	}

