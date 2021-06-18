package ui;

public class TernaryApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the TernaryApp.");
		//ternary operator information. from Baeldung.
		int num = 9;
		String msg = "";
		if (num > 10) {
			msg = "Number is greater than 10.";
		}
		else {
			msg = "Number is less than 10.";
		}
		System.out.println("Number: "+num);
		System.out.println();
		System.out.println(msg);
		System.out.println();
		// this ternary operator replaces the else if.
		// ? at the end of a boolean means "if thing = true"
		// : after ? offers false option.
		final String msg1 = num > 10 
				  ? "Number is greater than 10" //true
				  : "Number is less than or equal to 10"; //false/else if.
		
		System.out.println(msg1);
		System.out.println();
		
		System.out.println("Nested ternary");
		String msg2 = num > 10 ? "Number is greater than 10" 
				  : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
		
		System.out.println(msg2);
		System.out.println();
		
		
		System.out.println("Nested ternary calling a method");
		String msg3 = (num % 2 == 1 ) ? "Number is odd. Times 2 = " +timesTwo(num) 
				  : "Number is even";
		
		System.out.println(msg3);
		System.out.println();
		System.out.println("Goodbye");

	}

	private static int timesTwo(int i) {
	// print i *2
	return (i*2);
	}
	
	
}
