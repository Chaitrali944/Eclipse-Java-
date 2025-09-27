package Package1;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
	
	  int number;
	  Scanner sc =new Scanner(System.in);
	   
	  System.out.println("Enter Any NUmber :");
	  number = sc.nextInt();
	  
	  System.out.println("Reverse is :");
	  
	  int quo,rem;
	  
	  int temp=number,rNumber=0;
	  
	  while(temp>0) {  //temp chya jagi number for just reverse
		  
		  quo=temp/10;  //number
		  rem=temp%10;  //number
		  
		  rNumber = rNumber * 10 + rem;
		  temp=quo;
	  }
	  System.out.println(rNumber);
	  
	  if(number == rNumber) {
		  System.out.println("\n WOW its a palindrome");
	  }else {
		  System.out.println("\nSORRY its not a palindrome");
		 // number=quo;
	  }
	  
  
  }
}
