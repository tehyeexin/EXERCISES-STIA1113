
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		double average;
		int lowerbound = 1;
		int upperbound = 100;
		
		// For Loop
			System.out.println("1. For :");
				for(int number1 = lowerbound; number1 <= upperbound; number1++) {
					sum1 += number1;	
				}
				average = sum1 / 100.0;	
				System.out.println("The sum of 1 to 100 is " + sum1);	
				System.out.println("The average is " + average);
		
		System.out.println();
		
		// While Loop
			System.out.println("2. While :");
				int number2 = lowerbound;
				while(number2 <= upperbound) {
					sum2 += number2;
					number2++;
				}
				average = sum2 / 100.0;	
				System.out.println("The sum of 1 to 100 is " + sum2);	
				System.out.println("The average is " + average);
		
		System.out.println();
		
		// While Loop
			System.out.println("3. Do While :");
				int number3 = lowerbound;
				do {
					sum3 += number3;
					number3++;
				} while(number3 <= upperbound);
				average = sum3 / 100.0;	
				System.out.println("The sum of 1 to 100 is " + sum3);	
				System.out.println("The average is " + average);

	}

}
