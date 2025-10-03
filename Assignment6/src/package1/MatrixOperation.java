package package1;

import java.util.Scanner;

public class MatrixOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row,col;
		
		System.out.println("How many rows:");
		row= sc.nextInt();
		System.out.println("How many cols:");
		col= sc.nextInt();
		
		int[] [] mat1 =new int [row][col];
		
		System.out.println("enter matrix1 element :");
		
		for (int r=0;r<row;r++) {
			for (int c=0;c<col;c++) {
				System.out.print("enter element:");
				mat1[r][c]=sc.nextInt();
			}
		}
        int[] [] mat2 =new int [row][col];
		
		System.out.println("enter matrix2 element :");
		
		for (int r=0;r<row;r++) {
			for (int c=0;c<col;c++) {
				System.out.print("enter element:");
				mat2[r][c]=sc.nextInt();
			}
		}
        int[] [] mat3 =new int [row][col];
		
		
		
		for (int r=0;r<row;r++) {
			for (int c=0;c<col;c++) {
				System.out.print("enter element:");
				mat3[r][c]=mat1[r][c]+mat2[r][c];
			}
		}
		
		
		
		System.out.println("Matrix1 is :");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<col;c++)
			{
				System.out.print(mat1 [r][c]+ "  ");
			}
			System.out.println();
		}
       System.out.println("Addition of mATRIX is:");
		
		for (int r=0;r<row;r++) {
			for (int c=0;c<col;c++) {
				System.out.print(mat3[r][c]+"  ");
				 
	}
			System.out.println();

}
	}
}
