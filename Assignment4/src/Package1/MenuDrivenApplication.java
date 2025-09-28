package Package1;

import java.util.Scanner;

public class MenuDrivenApplication {
	public static void main(String[] args) {
		int choice;
		int n1,n2,r;
		String ch;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.print("MENU\n1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit\nEnter Your Choice");
			choice=sc.nextInt();

			switch(choice) {

			case 1:
				System.out.println("Enter number 1:");
				n1=sc.nextInt();
				System.out.println("Enter nunber 2:");
				n2=sc.nextInt();
				r=n1+n2;
				System.out.println("Addition is :"+r);
				break;

			case 2:
				System.out.println("In case 2");
			case 3:
			case 4:
			case 5:
				System.out.println("Thank you for using calsi");
				System.exit(0);
			default:
				System.out.println("Wrong Choice");



			}
			System.out.println("Continue (y/n) : ");
			ch=sc.next();
		}while(ch.equals("y"));
		System.out.println("THANKYOU FOR USING CALSI");

	}

}
