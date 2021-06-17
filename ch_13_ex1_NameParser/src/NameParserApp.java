

import com.util.Console;

public class NameParserApp {

	public static void main(String[] args) {
		int idx = 0;
		int idx2 = 0;
		int spaceCount = 2;
		String run = Console.getString("Check a name?     ", "y", "n");

		while (run.equalsIgnoreCase("y")) {

			String name = Console.getLine("Enter a name:   ");
			System.out.println();
			idx = name.indexOf(" ");
			idx2 = name.lastIndexOf(" ");
			if (name.indexOf(" ") == name.lastIndexOf(" ")) {
				spaceCount = 1;
			} 	if (spaceCount == 2) {

				String firstName = name.substring(0, idx);
				String middleName = name.substring(idx + 1, idx2);
				String lastName = name.substring(idx2 + 1);
				System.out.println("First: " + firstName);
				System.out.println("Middle: " + middleName);
				System.out.println("Last: " + lastName);

			} else if (spaceCount == 1) {
				String firstName = name.substring(0, idx);
				String lastName = name.substring(idx + 1);
				System.out.println("First: " + firstName);
				System.out.println("Last: " + lastName);
			} 
			run = Console.getString("Check another name?     ", "y", "n");
		}
	}
}