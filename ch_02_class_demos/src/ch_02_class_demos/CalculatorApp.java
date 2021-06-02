package ch_02_class_demos;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("*-------------------------*");
		System.out.println("|Welcome to the Calculator|");
		System.out.println("*-------------------------*");

		// p. 55 - Scanner

		Scanner sc = new Scanner(System.in);

		// while loop starts
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter Whole Number: ");
			int n1 = sc.nextInt();
			System.out.print("Enter Another Whole Number: ");
			int n2 = sc.nextInt();
			int sum = n1 + n2;
			System.out.println("Sum = " + sum);

			int diff = n1 - n2;

			System.out.println("Difference = " + diff);

			int product = n1 * n2;

			System.out.println("Product = " + product);

			System.out.println("Quotient = " + (n1 / n2));

			int modulus = n1 % n2;
			System.out.println("Modulus = " + modulus);

			// while loop end
		
		System.out.print("Continue? (y/n)");
			choice = sc.next();	
		}
					
		System.out.println("*----------------------------------------------*");
		System.out.println("|Goodbye, thank you for choosing the Calculator|");
		System.out.println("*----------------------------------------------*");

		sc.close();
	}

}
