package package1;

import java.util.Scanner;

class WrongInput extends Exception{
	int number;
	WrongInput(int number){
		this.number= number;
	}
	int convert() {
		return -number;
	}
}

public class UserDefinedException2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any +ve number:");
		int number = sc.nextInt();
		System.out.println(" u Entered :" + number);
		if (number>0) {
			System.out.println(" Thank you bhai you are good boy");
			System.exit(0);
			
		}else {
			System.out.println("U akkal shunyaa");
			try { 
				throw new WrongInput(number);
			}catch(WrongInput we) {
				number = we.convert();
				System.out.println("HuHuHu : chal kela me convert");
				System.out.println("he ghe shemdya :"+ number);
				
			}
			
		}
	}

}
