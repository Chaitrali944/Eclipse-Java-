package Package1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year Value");
		year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("WOW, ITS A LEAP YEAR");
			
		}else if ((year%4==0) && (year%100 !=0)) {
			System.out.println("WOW ,ITS A LEAP YEAR");
			
		}else {
			System.out.println("Its not a leap year");
		}
	}

}
