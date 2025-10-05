package package1;

public class StringOperation1 {
	public static void main(String[] args) {
		String s1="samsangg";
		System.out.println("String is : "+ s1);
		System.out.println("Length is :"+ s1.length());
		System.out.println("Char at index 2 is :"+ s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//used for password checking
		System.out.println(s1.equals("Samsangg"));
		System.out.println(s1.equalsIgnoreCase("samsangg"));
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(3, 7));
		
		System.out.println("String with alternate char:");
		for(int i=0;i<s1.length();i=i+2) {
			System.out.println(s1.charAt(i)+ "  ");
		}
		System.out.println();
		
		System.out.print(s1.replace('a', 'X'));
		
		String s2="  N     infinity    ";
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.trim());
		System.out.println(s2.trim().length());
		System.out.println(s2.replace('i', 'X').toUpperCase());
	}

}
