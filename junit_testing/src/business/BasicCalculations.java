package business;

public class BasicCalculations {
	
	public static int square(int num) {
		int answer = (int) Math.pow(num, 2);
		return answer;
	}
	
	public static int countA(String sent) {
		String lowSent = sent.toLowerCase();
		char letter = 'a';
		int a = 0;
		
		for (int i = 0;i< lowSent.length(); i++)
			if (lowSent.charAt(i) == letter) {
				a++;
			}
				
		return a;
	}
	
	
}
