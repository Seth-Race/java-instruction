import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

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
		
		// math P.102
		//round
		double percent = Math.round(.0325);
			System.out.println("Percent: "+percent);
		// round to thousandths
		double percent2 = (double) Math.round(.0325*100) /100;
			System.out.println("Percent: "+percent2);
		//pow
		System.out.println(Math.pow(2,  3));
		//sqrt
		System.out.println(Math.sqrt(25));
		//min/max
		System.out.println(Math.min(11.7,  23.4));
		System.out.println(Math.max(11.7,  23.4));
		//random
		System.out.println(Math.random());
		//die roll 1-20
		int die = (int) (Math.random()*20+1);
		System.out.println("Die roll: "+die);
		// random 1-100
		int guess = (int) (Math.random()*100+1);
		System.out.println("Random: "+guess);
		
		// Number Format p.105
		double price = 11.575;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceString = currency.format(price);
		System.out.println("Price: " +priceString);
		
		//percent format
		double majority = .505;
		NumberFormat percent3 = NumberFormat.getPercentInstance();
		String majorityString = percent3.format(majority);
		System.out.println(majorityString);
		//miles
		double miles = 15341.253;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		System.out.println("Miles" +number.format(miles));
		
		//BigDecimal p.113
		
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPercent = new BigDecimal(".1");
		final BigDecimal SALES_TAX_PCT = new BigDecimal(".05");
		
		BigDecimal discountAmount = subtotal.multiply(discountPercent);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
		
		
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
		BigDecimal salesTax = totalBeforeTax.multiply(SALES_TAX_PCT);
		BigDecimal total = totalBeforeTax.add(salesTax);
		
		System.out.println();
		System.out.println();
		System.out.println("Subtotal: "+currency.format(subtotal));
		System.out.println("Discount %: "+percent3.format(discountPercent));
		System.out.println("Discount Amt: "+currency.format(discountAmount));
		System.out.println("Total Before Tax: "+currency.format(totalBeforeTax));
		System.out.println("Sales Tax: "+currency.format(salesTax));
		System.out.println("Total: "+currency.format(total));
		

		
		
		
	}

}
