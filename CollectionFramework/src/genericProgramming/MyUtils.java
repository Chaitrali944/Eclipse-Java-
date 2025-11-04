package genericProgramming;

import java.util.ArrayList;

public class MyUtils {
	public static void printIntList(ArrayList<Integer>aList) {
		for(Integer i : aList) {
			System.out.println(i);
		}
	}
	public static void printStringList(ArrayList<String>sList) {
		for(String s : sList) {
			System.out.println(s);
		}
	}
//public static void <T>void printList(ArrayList<T>list){
//	for(T t: list) {
//		System.out.println(t);
//	}
}

