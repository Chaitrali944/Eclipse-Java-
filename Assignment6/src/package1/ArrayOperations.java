package package1;

import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("How MAny Elements :");
		n = sc.nextInt();
		
		int [] key = new int [n];
		System.out.println("Enter Array Elements ");
		for (int i=0;i<n;i++){
			System.out.println("Enter Element :");
			key[i]= sc.nextInt();
			
			
		}
		System.out.println("Array Element is :");
		
		for (int i=0;i<n;i++) {
			System.out.println(key[i]+ "  ");
		}
		
		int total=0;
		 for(int i=0;i<n;i++) {
			 total=total+key[i];
		 }
		 System.out.println("\n\nTotal of Array Elemts :" + total);
		 
		 
		 int max= key[0];
		 
		 for (int i=1;i<n;i++) {
			 if(max<key[i]) {
				 max=key[i];
			 }
		 }
		System.out.println("Max Element :" + max);
		System.out.println("Reverse Order Array is :");
		
		for (int i=n-1;i>=0;i--) {
			System.out.println(key [i] + "   ");
		}
	}


}
