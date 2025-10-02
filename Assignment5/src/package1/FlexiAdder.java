package package1;

public class FlexiAdder {
	public static void main(String[] args) {
		int result =0;
		
		result=doAddition(2,3,4);
		System.out.println("Additon is :"+result);
		result=doAddition();
		System.out.println("Addition is :"+result);
		result=doAddition();
		result=doAddition(2,3,4);
		System.out.println("Additon is :"+result);
		
	}
	static int doAddition(int... a) {
		int r=0;
		for(int i=0;i<a.length;i++) {
			r=r+a[i];
		}
		return r;
	}

}
