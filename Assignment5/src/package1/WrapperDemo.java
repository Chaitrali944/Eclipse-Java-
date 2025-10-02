package package1;

public class WrapperDemo {
	public static void main(String[] args) {
		
		Integer i1= new Integer(12);
		Integer i2= new Integer("123");
		Integer i3= 234;
		
		System.out.println(i1 + "  "+ i2 + "   "+ i3);
		
		System.out.println(i1.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("---------------");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("---------------");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		Boolean b1= new Boolean(true);
		Boolean b2=new Boolean("TRUE");
		//Boolean b2=new Boolean("chait"); true sodun kahi dila tar false

		System.out.println(b2);
	}

}
