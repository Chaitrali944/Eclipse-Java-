package package1;

public class CmdArg1 {
	public static void main(String[] args) {
		System.out.println("Arguments passed are :");
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i] + "  ");
		}
		System.out.println("\n\nArguments Passed are :");
		
		for (String x : args) {
			System.out.print(x + "  ");
		}
		
		
	}

}
