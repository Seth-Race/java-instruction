import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("*---------------------------------------------------------*");
		System.out.println("|---------- Welcome to the Rectangle Calculator ----------|");
		System.out.println("*---------------------------------------------------------*");

		
		// TODO Input Selection
				Scanner sc = new Scanner(System.in);

				// while loop starts
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {
					System.out.println();
					System.out.print("Please Enter Length: ");
					double length = sc.nextDouble();
					System.out.print("Please Enter Width: ");
					double width = sc.nextDouble();
					
					double area = (length * width);
					double perimeter = ((length *2)+(width *2));
					System.out.println("Area: " +area);
					System.out.println("Perimeter: " +perimeter);
					
					System.out.println();
					System.out.print("Continue? (y/n)");
					System.out.println();
					choice = sc.next();
					}
				
					sc.close();
				System.out.println();
				System.out.println("*---------------------------------------------------------*");
				System.out.println("|- Goodbye, thank you for choosing Rectangle Calculator! -|");
				System.out.println("*---------------------------------------------------------*");
	
				}
				// TODO Goodbye

	}


