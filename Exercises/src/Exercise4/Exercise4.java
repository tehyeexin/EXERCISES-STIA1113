package Exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		printQ1();
		printQ2();
		printQ3();
		printQ4();
		
		in.close();
	}
		public static void printQ1() {
			System.out.println("1.");
			
			// a) Declare an array alpha of 15 elements of the type integer.
			int[] alpha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
				
			// b) Output the value of the tenth element of the array alpha.
			System.out.println("The tenth element: " + alpha[9]);
				
			// c) Set the value of the fifth element of the array alpha to 35
			alpha[4] = 35;
			System.out.println(alpha[4]);
				
			// d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
			alpha[8] = alpha[5] + alpha[12];
			System.out.println("The sum of the sixth and thirteenth elements is " + alpha[8]);
			
			System.out.println();
		}
			
		public static void printQ2() {
			System.out.println("2.");	
			
			// a) Write a statement that declares a string array initialized with the following string: 
			// "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
			// b) Write a loop that display the contents of each element in the array that you declared.
			
			String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			
			// For
			System.out.println("For:");
			for (int i = 0; i < days.length; i++){
				System.out.println(days[i]);
			}
			
			System.out.println();
			
			// While
			System.out.println("While:");
			int j = 0;
			while(j < days.length) {
				System.out.println(days[j]);
				j++;
			}
			
			System.out.println();
			
			// Do While
			System.out.println("Do While:");
			int k = 0;
			do {
				System.out.println(days[k]);
				k++;
			} while (k < days.length);
		
			System.out.println();
		}
		
		public static void printQ3() {
			System.out.println("3.");	
			
			// Write a program that creates an array of 10 element size. Your program should prompt the users to input numbers in array.
			// Display the sum of all array elements.
			
			int[] numbers = new int[10];
			Scanner in = new Scanner (System.in);
			
			// For
			System.out.println("For:");
			System.out.println("Enter numbers : ");
			int sum1 = 0;
			for(int a = 0; a < numbers.length; a++) {
				numbers[a] = in.nextInt();
				sum1 += numbers[a];
			}
			System.out.println("The sum equals to " + sum1);
			System.out.println();
			
			// While
			System.out.println("While:");
			System.out.println("Enter numbers : ");
			int b = 0;
			int sum2 = 0;
			while(b < numbers.length) {
				numbers[b] = in.nextInt();
				sum2 += numbers[b];
				b++;
			}
			System.out.println("The sum equals to " + sum2);
			System.out.println();
			
			// Do While
			System.out.println("Do While:");
			System.out.println("Enter numbers : ");
			int c = 0;
			int sum3 = 0;
			do {
				numbers[c] = in.nextInt();
				sum3 += numbers[c];
				c++;
			} while(c < numbers.length);
			System.out.println("The sum equals to " + sum2);
		
			System.out.println();	
		}
			
		public static void printQ4() {
			System.out.println("4.");	
			
			// The variable list1 and list2 are reference arrays that each have 5 elements. 
			// Write code that copies the values in list1 to list2.
			// Values in list1 are input by user.
			
			int[] list1 = new int[5];
			
			Scanner in = new Scanner (System.in);
			
			System.out.println("Enter numbers: ");
			for(int i = 0; i < list1.length; i++) {
				list1[i] = in.nextInt();
			}
			
			System.out.println();
			
			// List 1
			System.out.println("List 1:");
			for(int i = 0; i < list1.length; i++) {
				System.out.println(list1[i]);
			}
			
			System.out.println();
			
			// List 2
			System.out.println("List 2:");
			for(int i = 0; i < list1.length; i++) {
				System.out.println(list1[i]);
			}
		}
}
