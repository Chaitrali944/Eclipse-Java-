package package1;
//marker interface as tyat method nhia
interface TestDay{
	int MON=1;
	int TUES=2;
	int WED=3;
}

class Day implements TestDay{
	void display(int n) {
		switch(n) {
		//final variables ahet mhanun accepted by switch
		case MON:
			System.out.println("Day 1 is Mon");
			break;
		case TUES:
			System.out.println("Day2 is TUES");
			break;
		case WED:
			System.out.println("Day 3 is WED");
			break;
			default:
				System.out.println("Please enter Day value from 1-3");
		}
	}
	
}





public class Week {
	public static void main(String[] args) {
		Day d1=new Day();
		d1.display(1);
		d1.display(3);
		d1.display(10);
	
	}

}
