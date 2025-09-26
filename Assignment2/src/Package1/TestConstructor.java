package Package1;

class Animal{
	Animal(){
		System.out.println("In No arg Animal Constr");
	}
	
	
	
}

class Bird extends Animal{
	Bird(){
		System.out.println("In No Arg Bird Constr");
	}
	
	
}
class Sparrow extends Bird{
	Sparrow(){
		System.out.println("In Zero ARgs sparrow Constr");
	}
	Sparrow(String name){
		this();
		System.out.println("In one Arg In SPArow constr");
	}
	
}

public class TestConstructor {
	public static void main(String[] args) {
		Sparrow s1 = new Sparrow();
		System.out.println("-------------------------------");
		Sparrow s2 = new Sparrow("chiuu");
	}

}
