package Package1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1,number2,result;
		
		System.out.println("Enter Number 1 :");
		number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		number2 =sc.nextInt();
		
		result = number1 + number2;
		System.out.println("Addition is :" + result);
		
		result = number1 - number2;
		System.out.println("Subtraction is :" + result);
		
		result = number1 * number2;
		System.out.println("Multiplication is :" + result);
		
		result = number1 / number2;
		System.out.println("Division is :" + result);
		
		result = number1 % number2;
		System.out.println("Modulus32 is :" + result);
	}

}
