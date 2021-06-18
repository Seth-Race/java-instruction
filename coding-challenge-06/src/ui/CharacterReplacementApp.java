package ui;

import com.util.Console;

public class CharacterReplacementApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the character replacement app!");

			
			
			//utilize this to do replacement of characters
			String sentence = Console.getLine("Please enter a sentence to replace the vowels in:   ");
			String replace = Console.getLine("Enter what you wish to replace with:   ");
			String s2 = sentence.replaceAll("[aeiou]",  replace);
			System.out.println(s2);
			
			
			
			System.out.println("Thanks for using it! Goodbye!");
	}



	
}
