package listPrograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> sVector= new Vector<>();
		
		sVector.add("Computer");
		sVector.add("Laptop");
		sVector.add("Phone");
		sVector.add("Calsi");
		sVector.add("Notebook");
		sVector.add("Pen");
//		
//	ListIterator<String> listitr=sVector.listIterator();
//		while(listitr.hasNext(){
//			listitr.next
//		}
//		
	
		System.out.println(sVector);
		sVector.add(2, "MACBOOK");
		System.out.println(sVector);
		
		System.out.println("=========================");
		
		for(String s: sVector) {
			System.out.println(s);
		}
		System.out.println("==========================");
		
		Enumeration<String> eCursor= sVector.elements();
		
		while(eCursor.hasMoreElements()) {
			System.out.println(eCursor.nextElement());
			
		}
		System.out.println("========================");
		
		Iterator<String> itr=sVector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========================");
		
		ListIterator<String> listitr=sVector.listIterator(); 
		 while(listitr.hasNext()) {
			 System.out.println(listitr.next());
		 }
	}

}
