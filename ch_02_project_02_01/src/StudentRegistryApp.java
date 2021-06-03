import java.util.Scanner;

public class StudentRegistryApp {

	public static void main(String[] args) {
		// TODO Create Welcome Message
        System.out.println("*------------------------------------------------*");
        System.out.println("|---------Welcome to University of Java!---------|");
        System.out.println("|-----------Student Registration Page------------|");
        System.out.println("*------------------------------------------------*");
        
        
		
		
		
		//Allow Input
        Scanner sc = new Scanner(System.in);
        System.out.println("*Please Enter First Name: ");
        String fName = sc.next();
		System.out.println("Please Enter Surname: ");
		String lName = sc.next();
		System.out.println("Please Enter Year of Birth: ");
		int year = sc.nextInt();
		
		
		String fullName = fName+ " " +lName;
		String tempPwd = fName+ "*" +year;
		//Confirmation Message
        System.out.println("*--------------------------------------------------------*");
        System.out.println("|------------------- Congratulations! -------------------|");
        System.out.println("|----------- You have successfully registered! ----------|");
        System.out.println("*--------------------------------------------------------*");
        System.out.println();
        
        
        
		
		
        System.out.println("Welcome " +fullName+ "!");
        System.out.println("Your registration is complete!");
        System.out.println("Your temporary password is " +tempPwd);
        
        
        sc.close();
		//Goodbye Message
        System.out.println("Have a wonderful day and enjoy the learning experience!");
        System.out.println("");
        System.out.println("*--------------------------------------------------------*");
        System.out.println("|----------- Closing Student Registration App -----------|");
        System.out.println("*--------------------------------------------------------*");
	}

}
