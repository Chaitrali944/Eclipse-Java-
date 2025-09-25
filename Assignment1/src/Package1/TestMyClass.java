package Package1;

class MyClass{ 
	MyClass(int n){
		System.out.println("I am in one arg Constr");
	}
	MyClass() {
		System.out.println("I am no arg Constr");
	}
	
}


public class TestMyClass {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass(11);
		
		System.out.println("End of Main");
	}

}
