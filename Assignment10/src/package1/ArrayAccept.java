package package1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ArrayAccept {
	public static void main(String[] args)throws Exception {
		
		int key[]= new int[5];
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Array Elements");
		
		for (int i=0;i<5;i++) {
			System.out.println("Enter Elements :");
			key[i]= Integer.parseInt(br.readLine());
		}
		System.out.println("Array Elements are :");
		
		for (int x: key) {
			System.out.println(x);
		}
					
				
				
				
	}

}
