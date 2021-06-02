package ch_02_class_demos;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
			System.out.println("Hello");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Sentence:");
			String sentence1 = sc.next();
			String sentence2 = sc.next();
			String sentence3 = sc.next();
			
			
			System.out.println(sentence1);
			System.out.println(sentence2);
			System.out.println(sentence3);
			
			//clear scanner
			sc.nextLine();
			
			System.out.print("Another Sentence:");
			String sentence4 = sc.nextLine();
			System.out.println(sentence4);
			
			// p.67 if/else
			
			System.out.println("Enter a Whole Number");
			int n1 = sc.nextInt();
			// determine if user entry is negative, even or odd
			if (n1 < 0) {
				System.out.println("Your entry is negative.");
			}
			else if (n1 % 2 == 0) {
				System.out.println("Your entry is even.");
			}
			else {
				System.out.println("Your entry is odd.");
			}
			
			sc.close();
			System.out.println("Bye.");

	}

}
