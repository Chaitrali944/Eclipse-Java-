package package1;

public class ImmutabilityTest {
	public static void main(String[] args) {
		String s1="chait";
		String s2=s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------------");
		
		s2=s2.concat("sir");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------------");
		
		StringBuffer sb1 = new StringBuffer( "N infinity");
		StringBuffer sb2=sb1;
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("-------------------");
		
		sb2.append(" Pune");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("-------------------");
		
		
		
		
	}

}
