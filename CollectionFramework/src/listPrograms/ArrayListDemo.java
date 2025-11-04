package listPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		 List<String> myFriends= new ArrayList();
		 
		 myFriends.add("chait");
		 myFriends.add("Samruddhi");
		 
		 System.out.println(myFriends);
		 
		 System.out.println("========================");
		 
		 System.out.println("My Friends are:");
		 
		 for(String s : myFriends) {
			 System.out.println(s);
		 }
		 System.out.println("===================");
		 
		 myFriends.add("Raj");
		 myFriends.add("Rnv");
		 myFriends.add("sid");
		 System.out.println(myFriends);
		 System.out.println("====================");
		 
		 List<String> yourFriends= new ArrayList<>();
		 yourFriends.add("Sam");
		 yourFriends.add("Sai");
		 yourFriends.add("Tanvi");
		 yourFriends.add("JUi");
		 System.out.println("Your friends are:");
		 System.out.println(yourFriends);
		  System.out.println("========================");
				 
		 List<String> friends = new ArrayList<>();
		 
		 friends.addAll(myFriends);
		 friends.addAll(yourFriends);
		 System.out.println("Total Friens are :");
		System.out.println(friends);
		System.out.println("===========================");
		
		List<String> newFriends= new ArrayList<>();
		newFriends.add("Varsha");
		newFriends.add("Advika");
		
		friends.addAll(1, newFriends);
		System.out.println(friends);
		
		System.out.println();
		//implement linked list same as arraylist
		 
	}

}
