import java.util.Scanner;

public class Exercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		Q6();
		Q7();
		Q13();
		Q15();
		Q17();
		Q18();
		Q20();
		Q32();
		Q33();
		Q34();
		
		in.close();
	}
	
	public static void Q6() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("Input the second number : ");
		int num2 = in.nextInt();
		
		System.out.print("Input the third number : ");
		int num3 = in.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
		
		System.out.println(num1 + " + " + num3 + " = " + (num1 + num3));
		System.out.println(num1 + " - " + num3 + " = " + (num1 - num3));
		System.out.println(num1 + " x " + num3 + " = " + (num1 * num3));
		System.out.println(num1 + " / " + num3 + " = " + (num1 / num3));
		System.out.println(num1 + " mod " + num3 + " = " + (num1 % num3));
	}
	
	public static void Q7() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("Input the second number : ");
		int num2 = in.nextInt();
		
		for (int i=0; i<10; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(num2 + " x " + (i+1) + " = " + (num2 * (i+1)));
		}
	}
	
	public static void Q13() {
		Scanner in = new Scanner (System.in);
		
		double width1 = 5.6;
		double length1 = 8.5;
		
		double perimeter1 = (width1*2) + (length1*2);
		double area1 = width1 * length1;
		
		double width2 = 7.8;
		double length2 = 10.2;
		
		double perimeter2 = (width2*2) + (length2*2);
		double area2 = width2 * length2;
		
		System.out.printf("The fisrt perimeter is (%.1f*2) + (%.1f*2) = %.2f ", width1 , length1 , perimeter1);
		System.out.printf("\nThe first area is %.1f * %.1f = %.2f ", width1 , length1 , area1);
		
		System.out.printf("\nThe second perimeter is (%.1f*2) + (%.1f*2) = %.2f ", width2 , length2 , perimeter2);
		System.out.printf("\nThe second area is %.1f * %.1f = %.2f ", width2 , length2 , area2);
	}
	
	public static void Q15() {
		Scanner in = new Scanner (System.in);
		
		int a, b, c, d;
		a = 15; 
		b = 25; 
		c = 45; 
		d = 55;
		System.out.println("\nBefore swapping : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		
		a = a + b;
		b = a - b;
		a = a - b;
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("After swapping : a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);		
	}
	
	public static void Q17() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first binary number : ");
		String binary1 = in.next();
		
		System.out.print("Input the second binary number : ");
		String binary2 = in.next();
		
		System.out.print("Input the third binary number : ");
		String binary3 = in.next();
		
		String binaryString1 = binary1 ;
		int decimal1 = Integer.parseInt(binaryString1,2);
		
		String binaryString2 = binary2 ;
		int decimal2 = Integer.parseInt(binaryString2,2);
		
		String binaryString3 = binary3 ;
		int decimal3 = Integer.parseInt(binaryString3,2);
		
		int sum1 = decimal1 + decimal2;
		int sum2 = decimal1 + decimal2 + decimal3;
		
		System.out.println("Sum of the first and second binary numbers : " + (Integer.toBinaryString(sum1)));	
		System.out.println("Sum of the three binary numbers : " + (Integer.toBinaryString(sum2)));	
	}
	
	public static void Q18() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first binary number : ");
		String binary1 = in.next();
		
		System.out.print("Input the second binary number : ");
		String binary2 = in.next();
		
		System.out.print("Input the third binary number : ");
		String binary3 = in.next();
		
		String binaryString1 = binary1 ;
		int decimal1 = Integer.parseInt(binaryString1,2);
		
		String binaryString2 = binary2 ;
		int decimal2 = Integer.parseInt(binaryString2,2);
		
		String binaryString3 = binary3 ;
		int decimal3 = Integer.parseInt(binaryString3,2);
		
		int product1 = decimal1 * decimal2;
		int product2 = decimal1 * decimal3;
		
		System.out.println("Product of the fisrt and second binary numbers : " + (Integer.toBinaryString(product1)));	
		System.out.println("Product of the fisrt and third binary numbers : " + (Integer.toBinaryString(product2)));
	}
	
	public static void Q20() {
		Scanner in = new Scanner (System.in);
		
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		System.out.print("Input the fisrt decimal number : ");
		int decimal1 = in.nextInt();
		
		System.out.print("Input the second decimal number : ");
		int decimal2 = in.nextInt();
		
		System.out.println("The first hexadecimal number is : " + (Integer.toHexString(decimal1)));
		System.out.println("The second hexadecimal number is : " + (Integer.toHexString(decimal2)));
	}
	
	public static void Q32() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first integer : ");
		int num1 = in.nextInt();
		
		System.out.print("Input the second integer : ");
		int num2 = in.nextInt();
		
		System.out.print("Input the third integer : ");
		int num3 = in.nextInt();
		
		if (num1 == num2)
			System.out.printf("%d == %d\n", num1, num2);
		if (num1 != num2)
			System.out.printf("%d != %d\n", num1, num2);
		if (num1 < num2)
			System.out.printf("%d < %d\n", num1, num2);
		if (num1 > num2)
			System.out.printf("%d > %d\n", num1, num2);
		if (num1 <= num2)
			System.out.printf("%d <= %d\n", num1, num2);
		if (num1 >= num2)
			System.out.printf("%d >= %d\n", num1, num2);	
		
		if (num1 == num3)
			System.out.printf("%d == %d\n", num1, num3);
		if (num1 != num3)
			System.out.printf("%d != %d\n", num1, num3);
		if (num1 < num3)
			System.out.printf("%d < %d\n", num1, num3);
		if (num1 > num3)
			System.out.printf("%d > %d\n", num1, num3);
		if (num1 <= num3)
			System.out.printf("%d <= %d\n", num1, num3);
		if (num1 >= num3)
			System.out.printf("%d >= %d\n", num1, num3);	
	}
	
	public static void Q33() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first integer : ");
		int num1 = in.nextInt();
		
		System.out.print("Input the second integer : ");
		int num2 = in.nextInt();
		
		int n1 = num1 / 10 % 10;
		int n2 = num1 % 10;
		int sum1 = n1 + n2;
		
		int n3 = num2 / 100 % 10;
		int n4 = num2 / 10 % 10;
		int n5 = num2 % 10;
		int sum2 = n3 + n4 + n5;
		
		System.out.println("The sum of the digits in first integer is " + sum1);
		System.out.println("The sum of the digits in second integer is " + sum2);
	}
	
	public static void Q34() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input the first length of a side of the hexagon : ");
		int s1 = in.nextInt();
		
		System.out.print("Input the second length of a side of the hexagon : ");
		int s2 = in.nextInt();
		
		double area1 = (6*(s1*s1)) / (4*Math.tan(Math.PI/6));
		double area2 = (6*(s2*s2)) / (4*Math.tan(Math.PI/6));
		
		System.out.println("The first area of the hexagon is " + area1);
		System.out.println("The second area of the hexagon is " + area2);
	}

}
