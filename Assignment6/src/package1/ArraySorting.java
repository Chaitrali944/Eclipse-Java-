package package1;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		
	
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("How MAny Elements :");
	n = sc.nextInt();
	
	int [] key = new int [n];
	System.out.println("Enter Array Elements ");
	for(int i=0;i<n;i++){
		System.out.println("Enter Element :");
		key[i]= sc.nextInt();
		
		
	}
	System.out.println("Array Element before sorting :");
	
	for (int i=0;i<n;i++) {
		System.out.println(key[i]+ "  ");
	}
	
	int temp=0;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-1-i;j++) {
			if (key[j]> key[j+1]) {
				temp=key[j];
				key[j]=key[j+1];
				key[j+1]=temp;
				
			}
		}
	}
	System.out.println("\n\nArray Elements After Sorting :");
	for(int i=0;i<n;i++) {
		System.out.println(key[i] + "   ");
	}

}}
