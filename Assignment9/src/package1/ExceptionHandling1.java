package package1;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		int a=10;
		int b=0;
		
		
		try {
			b= Integer.parseInt(args[0]);
			System.out.println("Divison is :" + (a/b) );
			
		}
		catch(ArithmeticException ae){
			System.out.println("Dear please check Denominator");
		}catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("Please pass arguments");
		}catch (NumberFormatException nfe) {
			System.out.println("Please pass Number in proper format");
		}finally {
			System.out.println("Must always execute");
		}
		System.out.println("End of Main");
	}

}
