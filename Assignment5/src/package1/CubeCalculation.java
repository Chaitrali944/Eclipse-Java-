package package1;

public class CubeCalculation {
	public static void main(String[] args) {
		//how to convert strings into primitives
		int number = Integer.parseInt(args[0]);
		
		System.out.println("Number is :"+ number);
		
		System.out.println("Cube is :" +number* number* number);
	}

}
//we cannot perform arithematic operations on strings