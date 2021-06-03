
public class PrimitivesApp {

	public static void main(String[] args) {
		// char type p.86
		char a1 = 'A';
		char a2 = 'a';
		char a3 = 65;
		char a4 = 97;
		char copyright = 169;
		char yen = 165;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(copyright);
		System.out.println(yen);
		
		
		
		// binary and unary operators p. 88-91
		int count = 1;
		// binary + operator
		count = count + 1;
		// Unary ++ operator
		count ++;
		
		System.out.println("Count: "+count);
		
		
		//compound assignmnet p.93
		
		count +=10;
		System.out.println("Count: "+count);
		
		// implicit casting p.96
		
		
		double grade = 93;
		double d = 95.0;
		
		int i = 86, j = 91;
		
		double average = (d+i+j)/3;
		System.out.println("Average: "+average);
		
		// explicit cast p.97
		
		int grade2 = (int) 93.75;
		int average2 = ((int)d+i+j)/3;
		int remainder = ((int)d+i+j)%3;
		System.out.println("Average: "+average2+" Remainder:"+remainder);
		
	}

}
