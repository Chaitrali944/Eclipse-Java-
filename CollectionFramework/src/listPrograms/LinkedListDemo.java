package listPrograms;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> myFriends= new LinkedList<>();
		myFriends.add("Chaitrali");
		myFriends.add("Tejal");
		
		System.out.println(myFriends);
		
		System.out.println("========================");
		
		for(String s:myFriends) {
			System.out.println(s);
		}
		System.out.println("=======================");
		
		List<String> yourFriends = new LinkedList<>();
		yourFriends.add("Rnv");
		yourFriends.add("Sid");
		yourFriends.add("Sudip");

		System.out.println(yourFriends);
		System.out.println("=====================");
		 yourFriends.add(2, "Raj");
			System.out.println(yourFriends);
			
			System.out.println("===================");
         
		List<String> friends=new LinkedList<>();
		friends.addAll(myFriends);
		friends.addAll(yourFriends);
		System.out.println(friends);
		
		List<String> newfriends= new LinkedList<>();
		newfriends.addAll(3, friends);
		
		System.out.println(newfriends);

		
		
		
		
	}

}
