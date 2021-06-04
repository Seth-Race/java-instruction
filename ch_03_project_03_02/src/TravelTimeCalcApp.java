import java.util.Scanner;

public class TravelTimeCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("*-----------------------------------------------------------------------*");
				System.out.println("|---------------- Welcome to the Travel Time Calculator ----------------|");
				System.out.println("*-----------------------------------------------------------------------*");

				

						Scanner sc = new Scanner(System.in);

						// while loop starts
						String choice = "y";
						while (choice.equalsIgnoreCase("y")) {

				// TODO Input
					System.out.println();
					System.out.println("Enter miles: ");
					double miles = sc.nextDouble();
					System.out.println("Enter miles per hour:");
					double mph = sc.nextDouble();
					
					double hours = (double) Math.round(miles/mph);
					double minutes = (double) (miles % mph);
					
					System.out.println("Estimated Travel Time");
					System.out.println("---------------------");
					System.out.println("Hours: " +hours);
					System.out.println("Minutes: " +minutes);
					System.out.println();
							
							
							
							
							
							
				// TODO Check continue

							System.out.println();
							System.out.print("Continue? (y/n)");
							System.out.println();
							choice = sc.next();
						}
						sc.close();
						System.out.println("*-----------------------------------------------------------------------*");
						System.out.println("|------------- Thanks for using the Travel Time Calculator -------------|");
						System.out.println("*-----------------------------------------------------------------------*");
			}
		

	}

