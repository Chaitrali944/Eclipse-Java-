package package1;

import java.util.Scanner;

class BadFoodException extends Exception{
	
}

public class UserDefinedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats for eating");
		String foodName=sc.next();
		
		
	try {
		checkFood(foodName);
	}catch(BadFoodException be) {
		System.out.println("I Really dont like:"+ foodName);
	}finally {
		System.out.println("Maggie will always be better");
	}
	}
	static void checkFood(String foodName) throws BadFoodException{
		if (foodName.equalsIgnoreCase("paneer")) {
			System.out.println("WOW, i like " + foodName);
		}else {
			throw new BadFoodException();
		}
	}

}
