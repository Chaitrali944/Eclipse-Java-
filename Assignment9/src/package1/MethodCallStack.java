package package1;

import java.io.IOException;

public class MethodCallStack {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		try {
			method1();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Being Main method must handle it");
		}finally {
			System.out.println("must execute");
		}
		System.out.println("end of Main");
	}
static void method1()throws IOException {
	System.out.println("Start of method1");
	method2();
	System.out.println("End od method 1");
	
}
static void method2()throws IOException{
	System.out.println("Start of method 2");
	method3();
	System.out.println("End of method 2");
}
static void method3() throws IOException{
	System.out.println("Start of method3");
	throw new IOException();
	//System.out.println("End of method3");
}
}
