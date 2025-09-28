package Package1;
//cohesive class is independent of other modules it is alone sufficent for the program
class Circle {
	int radius;
	final float PI_VALUE = 3.14f;
	double area;
	Circle(int radius){
		this.radius=radius;
		
	}
	double calculateArea() {
		area =PI_VALUE + radius + radius;
		return area;
	}
	void displayArea(double area) {
		System.out.println("Area of circle is :" + area);
	}
}

public class CohesiveClassDemo {
	public static void main(String[] args) {
		Circle c1= new Circle(10);
		double a = c1.calculateArea();
		c1.displayArea(a);
	}

}
