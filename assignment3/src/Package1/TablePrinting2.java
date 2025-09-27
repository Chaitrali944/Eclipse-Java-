package Package1;

import java.util.Scanner;

public class TablePrinting2 {
	public static void main(String[] args) {
		int sNumber,eNumber,number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start Number :");
		sNumber = sc.nextInt();
		
		System.out.println("Enter end Number :");
		eNumber = sc.nextInt();
		
		for(number=sNumber;number<=eNumber;number++) {
			int i=1;
			System.out.println("Table of "+number);
			
			while(i<=10) {
				System.out.println(number + "x" + i + "="+(number*i));
				i++;
			}
		}
		
	}

}
