package genericProgramming;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>();
		
		numberList.add(23);
		numberList.add(89);
		numberList.add(34);
		numberList.add(98);
		numberList.add(55);
		
		System.out.println("List Before sorting :");
		
		MyUtils.printList(numberList);
		
		Collections.sort(numberList);
		
		System.out.println("\n\nList After Sorting:");
		MyUtils.printList(numberList);
		System.out.println("\n\n-----------------------------");
		
		ArrayList<String> nameList= new ArrayList<>();
		nameList.add("Vaishali");
		nameList.add("Vishal");
		nameList.add("Omkar");
		nameList.add("Pramod");
		nameList.add("Pranali");

System.out.println("\n\nNmae List Before Sorting:");
MyUtils.printList(nameList);
System.out.println("\n\nNmae List Before Sorting:");
MyUtils.printList(nameList);

		
		
	}

}
