package Week2.temp;

public class Practice3 { 

	public static void main(String[] args) {
		//This is a comment
		//Let's print something to console
		//System.out.println("Hello World!");
		
		//grab money parts
		double money = 24.90; //means $24.35, $24.89, $24.90
		//version-1: get cents part, which is 35 cents
		//https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Math.html#round(double)
		int cents =(int)Math.round((money-(int)money)*100);
		System.out.printf("(1) %d cents.", cents);
	
		
		//version-2: convert money amount to integer data first 
		int moneyInt = (int) Math.round(money*100); //Convert 24.90 to be 2490
		int cents2 = moneyInt%100; 
		System.out.printf("(2) %d cents.", cents2);	
		int dollars = moneyInt/100;
		System.out.printf("(3) %d dollars can be converted to ", dollars);	
		System.out.printf("%d 20's", dollars/20);

	}

}

