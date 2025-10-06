package package1;

interface Area{
	double PI_VALUE=3.14;
	
	double ComputeArea(int... a);
	void displayArea(double area);
}
 
class Rectangle implements Area{

	@Override
	public double ComputeArea(int... a) {
		double area;
		area = a[0]+a[1];
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public void displayArea(double area) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle area is :"+ area);
		
	}
	
	
}


class Circle implements Area{

	@Override
	public double ComputeArea(int... a) {
		double area;
		area = PI_VALUE * a[0]*a[0];
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public void displayArea(double area) {
		// TODO Auto-generated method stub
		System.out.println("Circle area is :"+ area);
		
	}
}
public class TestArea {
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		double result =r1.ComputeArea(10,12);
		r1.displayArea(result);
		
		Circle c1=new Circle();
		 result= c1.ComputeArea(10);
		c1.displayArea(result);
	}

}
