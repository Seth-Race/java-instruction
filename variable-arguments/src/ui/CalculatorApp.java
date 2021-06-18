package ui;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("It's a Calculator. Use it.");

		int n1 = 5;
		int n2 = 8;
		int n3 = 22;
		int n4 = 10234;
		
		System.out.println("Add 2 numbers");
			System.out.println(n1 + " + " + n2 + " = " +addTwo(n1,n2));
			System.out.println();
		System.out.println("Add 3 numbers");
			System.out.println(n1 + " + " + n2 + " + " +n3 + " = " +addThree(n1,n2,n3));
			System.out.println();
		System.out.println("Add 4 numbers");
				//https://www.baeldung.com/java-varargs - Variable args.
			System.out.println("VarArgs method.");
			System.out.println(n1 + " + " + n2 + " + " + n3 + " + " + n4 + " = " + add(n1, n2, n3, n4));
			System.out.println();
		
		
		
		
		System.out.println("Way to go, you did math.");
	}
	
	private static int addTwo(int n1, int n2) {
		return n1+n2;
	}

	private static int addThree(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	//This here's the varArg method. Goes with number 4 up there.
	private static int add(int ... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		
		return sum;
	}

}
