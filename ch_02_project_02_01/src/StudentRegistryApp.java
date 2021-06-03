import java.util.Scanner;

public class StudentRegistryApp {

	public static void main(String[] args) {
		// TODO Create Welcome Message
        System.out.println("*------------------------------------------------*");
        System.out.println("|---------Welcome to University of Java!---------|");
        System.out.println("*------------------------------------------------*");
        
        
		
		
		
		//Allow Input
        Scanner sc = new Scanner(System.in);
        System.out.println("*Please Enter First Name: ");
        String fName = sc.next();
		System.out.println("Please Enter Surname: ");
		String lName = sc.next();
		System.out.println("Please Enter Year of Birth: ");
		String year = sc.next();
		
		
		String fullName = fName+ " " +lName;
		//Confirmation Message
        System.out.println("*------------------------------------------------*");
        System.out.println("|----------------Congratulations!----------------|");
        System.out.println("|--------You have successfully registered!-------|");
        System.out.println("*------------------------------------------------*");
        System.out.println();
        
        
        
		
		
        System.out.println("Welcome " +fullName+ "!");
        System.out.println("Your temporary password is " +lName+ "*" +year);
        
        
        
		//Goodbye Message
        System.out.println("Have a wonderful day and enjoy the learning experience!");
	}

}
