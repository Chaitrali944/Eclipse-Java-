package package1;

public class ResultAnalysis {
	public static void main(String[] args) {
		
	//colunm is average row is addition
	int [] [] marks= {
			{94,89,95,86,70},
			{87,83,75,78,91},
			{85,78,72,69,76}
	};
	System.out.println("Total Marks of each student");
	
	int total=0;
	for(int r=0;r<3;r++) {
		System.out.println("Total of Students :" + (r+1) + " : ");
		total=0;
		for(int c=0;c<3;c++) {
			total =total + marks[r][c];
			
		}
		System.out.println(total);
		
		
	}
	
	System.out.println("\n\nAverage of each subject:");
	for(int c=0;c<5;c++) {
		System.out.println("Total of Students :" + (c+1) + " : ");
		total=0;
		for(int r=0;r<3;r++) {
			total=total+marks[r][c];
		}
		System.out.println(total/3);
		
	}
	
	

}}
