package Package1;

import java.util.Scanner;

public class TablePrinting {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		number = sc.nextInt();
		
		System.out.println("Using while loop");
		
		int i=1;
		
		while (i<=10) {
			
			System.out.println(number + "x" + i + "=" + (number*i));
			
			i++;
		}
		System.out.println("Using for loop");
		 for (i=1;i<=10;i++) {
			 System.out.println(number + "x" + i + "=" + (number*i));
		 }
	}

}
