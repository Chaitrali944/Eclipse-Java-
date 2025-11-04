package genericProgramming;

import java.util.ArrayList;

public class TestUtils {
	public static void main(String[] args) {
		
		ArrayList<Integer> numberList=new ArrayList<>();
		
		numberList.add(11);
		numberList.add(12);
		numberList.add(13);
		numberList.add(14);
		numberList.add(15);
		numberList.add(16);
		
		System.out.println("Number List is :");
//		
//		for(Integer i : numberList) {
//			System.out.println(i);
//		}
//		MyUtils.printIntList(numberList);
		System.out.println("-----------------------------");
		
		ArrayList<String> friendList= new ArrayList<>();
		friendList.add("Chait");
		friendList.add("Sam");
		friendList.add("sai");
		friendList.add("Sid");
		System.out.println("Number list is:");

//	for(String s : friendList) {
//	System.out.println(s);
//}
//MyUtils.printIntList(friendList);
	MyUtils.printList(friendList);	

		
	}

}
