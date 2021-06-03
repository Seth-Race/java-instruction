import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// TODO Add Welcome Greeting
		System.out.println("*---------------------------------------------------------*");
		System.out.println("|---------- Welcome to the Java Grade Converter! ---------|");
		System.out.println("*---------------------------------------------------------*");
		
		
		// TODO Input Selection
		Scanner sc = new Scanner(System.in);

		// while loop starts
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Please Enter Numerical Grade: ");
			int ng = sc.nextInt();
			String letterGrade = "A";
			if (ng <= 100 && ng >= 88){
				letterGrade = "A";
			}
			else if (ng <= 87 && ng >= 80) {
				letterGrade = "B";
			}
			else if (ng <= 79 && ng >= 67) {
				letterGrade = "C";
			}
			else if (ng <= 66 && ng >= 60) {
				letterGrade = "D";
			}
			else if (ng <= 60) {
				letterGrade = "F";			
			}
		
			System.out.println("Letter Grade: " +letterGrade);
			
			System.out.print("Continue? (y/n) ");
			choice = sc.next();
			
		}
		sc.close();
		// TODO Goodbye
		System.out.println("*---------------------------------------------------------*");
		System.out.println("|- Goodbye, thank you for choosing Java Grade converter! -|");
		System.out.println("*---------------------------------------------------------*");
	}

}
