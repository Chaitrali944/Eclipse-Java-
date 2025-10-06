package package1;

interface Flyable{
	void fly();
}
class AP implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Inside AP fly");
		
	}
	
}
class HC implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Inside HC Fly");
	}
	
}
class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Inside Kite Fly");
	}
	
}
public class TestInterface {
	public static void main(String[] args) {
		AP a1=new AP();
		a1.fly();
		HC h1= new HC();
		h1.fly();
		Kite k1=new Kite();
		k1.fly();
		}

}
