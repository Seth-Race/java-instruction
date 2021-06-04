
public class ForLoopsApp {

	public static void main(String[] args) {
// for loop counting 0 to 100 by 10s
		for (int i=0; i <= 100; i += 10) {
			System.out.println(i);
		}

		// sum odd numbers between 1-33
		int sum = 0;
		for (int i=1; i < 33; i += 2) {
			sum += i;
			
		}
		System.out.println("Sum =" +sum);
		
		
		// print numbers 0-20, tell whether even/odd
		
		for (int i = 0; i <= 20; i ++) {
			String evenOdd = "odd";
			if (i % 2 == 0) {
				evenOdd = "even";
			}
		System.out.println(i+ "-" +evenOdd);
		}

	}

}
