package package1;

public class ArgumentSkipper {
	public static void main(String[] args) {
		System.out.println("Elements at even indices :");
		
		for(int i=0;i<args.length;i=i+2) {
			System.out.print(args[i] + "  ");
		}
		for (String x : args) {
			System.out.println(x + "  ");
		}
		
		System.out.println("\n\nElements at odd indices : ");
		
		for (int i=1;i<args.length;i=i+2) {
			System.out.print(args[i]+ "  ");
		}
	}

}
