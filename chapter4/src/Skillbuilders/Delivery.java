package Skillbuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) { 
    double length;
    double width;
    double height;
    double pack; 
    
    Scanner userinput = new Scanner(System.in);
    
    System.out.print("enter the length of your package: ");
    length = userinput.nextDouble(); 
     
    System.out.print("enter the width of your package: ");
    width = userinput.nextDouble();
    
    System.out.print("enter the height of your package: ");
    height = userinput.nextDouble();
     
    
    System.out.println("Length status: " + getCategory(length));
    System.out.println("Width status: " + getCategory1(width));
    System.out.println("Height status: " + getCategory2(height));
    
    
} 


public static String getCategory(double length) {
    if (length < 10) {
        return "Accept";
    } else {
        return "Reject";
    }
}

public static String getCategory1(double width) {
    if (width < 10) {
        return "Accept";
    } else {
        return "Reject";
    }
}   

public static String getCategory2(double height) {
    if (height < 10) {
        return "Accept";
    } else {
        return "Reject";
    }
}

} 
			            

