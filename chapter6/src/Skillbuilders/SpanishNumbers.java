package Skillbuilders;

import java.util.Scanner;

public class SpanishNumbers 
	{

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) {
            printSpanishNumber(i);
        }
    }

    // Method that takes an int parameter and prints the Spanish word [0.1.2]
    public static void printSpanishNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("Number out of range (1-10)");
                break;
        }
    }
}





