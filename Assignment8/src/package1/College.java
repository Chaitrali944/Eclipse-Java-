package package1;

abstract class Princi{
	//abstract int a;
	abstract void doOneEvent();
	abstract void doOneMoreEvent();
	void method1() {
		
	}
	Princi(){
		
	}
}
abstract class Hod extends Princi{

	@Override
	void doOneEvent() {
		// TODO Auto-generated method stub
		
	}
	
	
}
abstract class Staff extends Hod {
	
	
}
class Student extends Staff{

	@Override
	void doOneMoreEvent() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class College {
	public static void main(String[] args) {
		Student s1= new Student();
		//Staff s2=new Staff();
	}

}
