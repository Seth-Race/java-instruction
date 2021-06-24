package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculations app.");
		System.out.println();
		
		int num = Console.getInt("Please enter number to be squared:   ");
		int answer = BasicCalculations.square(num);
		
		System.out.println(num + " squared is: " +answer);
		System.out.println();
		
		String sent = Console.getLine("Please enter a sentence:   ");
		answer = BasicCalculations.countA(sent);
		System.out.println("The count of the letter A is: " +answer);
		
		
		
		System.out.println();
		System.out.println("Thanks for using the app.");
	}

}
