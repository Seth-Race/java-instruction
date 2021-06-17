package ui;

public class StringDemoApp {

	public static void main(String[] args) {
		String name = "Robert Nesta Marley";
		int idx = name.indexOf(" ");
		int idx2 = name.lastIndexOf(" ");
		System.out.println(idx);
		String firstName = name.substring(0, idx);
		String middleName = name.substring(idx+1, idx2);
		String lastName = name.substring(idx2+1);
		System.out.println("First: " +firstName);
		System.out.println("Middle: " +middleName);
		System.out.println("Last: " +lastName);
		System.out.println(name.trim());
		
		
		String sentence = "Hello-there-how-are-you?";
		//replacing dashes with spaces
		sentence = sentence.replace("-", " ");
		System.out.println(sentence);
		
		//parse sentence into word array.
		String[] words = sentence.split(" ");
		for (String word:words) {
			System.out.println(word);
		}
		
		StringBuilder abc = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		abc.replace(2, 7, "zz");
		System.out.println(abc);
		
		
	}

}
