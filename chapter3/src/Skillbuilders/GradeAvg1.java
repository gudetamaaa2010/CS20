package Skillbuilders;

import java.util.Scanner;

public class GradeAvg1 
{

	public static void main(String[] args) 
	{
		
	 //declare variables
	int grade1;
	int grade2;
	int grade3;
	int grade4; 
	int grade5;
	double average;
	
	//Create a Scanner Object
			Scanner userinput = new Scanner (System.in);
			
			//ask for the first grade
			System.out.println ("type in your first grade: ");
			
			//Get the first grade number from the user
					grade1 = userinput.nextInt();
			
					
			//display the first		
			System.out.println("your first grade is: " + grade1);
	
			
			
			//ask for the second grade
			System.out.println ("type in your second grade: ");
			
			//Get the second grade number from the user
					grade2 = userinput.nextInt();
					
			//Display the second grade		
			System.out.println("your second grade is: " + grade2);
	
			
			//ask for the third grade
			System.out.println ("type in your thrid grade: ");
			
			//Get the third grade number from the user
					grade3 = userinput.nextInt();
			
			//Display the third grade		
			System.out.println("your thrid grade is: " + grade3);
			
			
			//ask for the fourth grade
			System.out.println ("type in your fourth grade: ");
			
			//Get the fourth grade number from the user
					grade4 = userinput.nextInt();
				
			//Display the fourth grade		
			System.out.println("your fourth grade is: " + grade4);
			
			
			//ask for the fifth grade
			System.out.println ("type in your fifth grade: ");
			
			//Get the fifth grade number from the user
					grade5 = userinput.nextInt();
			
					//Display the fifth grade		
			System.out.println("your fifth grade is: " + grade5);
			
			 // calculating grade average
	        double average1 = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

	        //print out the average
	        System.out.println("The average is: " + average1 + "%");
			
			
			
	}
	
}