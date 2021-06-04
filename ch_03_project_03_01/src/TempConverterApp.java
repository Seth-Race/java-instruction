import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("*----------------------------------------------------------------*");
		System.out.println("|------------- Welcome to the Temperature Converter -------------|");
		System.out.println("*----------------------------------------------------------------*");

		

				Scanner sc = new Scanner(System.in);

				// while loop starts
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {

		// TODO Input
			System.out.println();
			System.out.println("Enter degrees in Fahrenheit: ");		
			double f = sc.nextDouble();
			double c = (double) Math.round(((f-32) * 5/9)* 100) /100;
			
			System.out.println("Degrees in Celsius: " +c);
			System.out.println();
					
					
					
					
					
					
		// TODO Check continue

					System.out.println();
					System.out.print("Continue? (y/n)");
					System.out.println();
					choice = sc.next();
				}
				sc.close();
				System.out.println("*----------------------------------------------------------------*");
				System.out.println("|---------- Thanks for using the Temperature Converter ----------|");
				System.out.println("*----------------------------------------------------------------*");
	}
}
