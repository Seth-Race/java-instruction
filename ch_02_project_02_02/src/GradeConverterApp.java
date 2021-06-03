import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// TODO Add Welcome Greeting
		System.out.println("*------------------------------------*");
		System.out.println("|Welcome to the Java Grade Converter!|");
		System.out.println("*------------------------------------*");
		
		
		// TODO Input Selection
		Scanner sc = new Scanner(System.in);

		// while loop starts
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Please Enter Numerical Grade: ");
			int n1 = sc.nextInt();
			
			if (n1 <= 100 && n1 >= 88){
				System.out.println("Letter grade: A");
			}
			else if (n1 <= 87 && n1 >= 80) {
				System.out.println("Letter grade: B");
			}
			else if (n1 <= 79 && n1 >= 67) {
				System.out.println("Letter grade: C");
			}
			else if (n1 <= 66 && n1 >= 60) {
				System.out.println("Letter grade: D");
			}
			else if (n1 <= 60) {
				System.out.println("Letter grade: F");			
			}
		
			
			
			System.out.print("Continue? (y/n)");
			choice = sc.next();
			
		}
		// TODO Goodbye
		System.out.println("*-----------------------------------------------------*");
		System.out.println("|Goodbye, thank you for choosing Java Grade converter!|");
		System.out.println("*-----------------------------------------------------*");
	}

}
