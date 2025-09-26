package Package1;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Number1 : ");
		n1 = sc.nextInt();
		
		System.out.println("enter Number2 : ");
		n2 = sc.nextInt();
		
		System.out.println("enter Number3 : ");
		n3 = sc.nextInt();
		
		int g;
		
		if ((n1>n2)&&(n1>n3)) {
			g = n1;
			
			
		}
		else if ((n2>n1)&&(n2>n3)) {
			g = n2;
			
		}
		else {
			g =n3;
			System.out.println("Greatest Number Is :"+g);
					
		}
		
		
		//nested ifelse
		
		if (n1>n2) {
			if(n1>n3)
			{g=n1;
			}else {
				g=n3;
				
			}
		}else {
				if(n2>n3) {
					g=n2;
					
				}else {
					g=n3;
				}
			}
			System.out.println("Greatest Number Is :"+g);
			
			//conditional
			int temp;
			
			temp= (n1>n2) ? n1 : n2;
			
			g = (temp>n3)?temp:n3;
			
			System.out.println("Greatest Number is :"+g);
			}
	}


