import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            
          //  double mpg = (double) Math.round((miles/gallons)*100) /100;
//    		NumberFormat mpg = NumberFormat.getNumberInstance();
//    		mpg.setMaximumFractionDigits(2);
//    		System.out.println("Miles Per Gallon: " +mpg.format(miles/gallons));
    		//double mpg = (double) Math.round((miles/gallons)*100) /100;
            //System.out.println("Miles per gallon is " + mpg + ".");

            // THIS IS ALMOST WORKING. LET'S MAKE IT WORK.
    		//BigDecimal mpg = mpg.divide((miles/gallons), RoundingMode.HALF_UP);
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
