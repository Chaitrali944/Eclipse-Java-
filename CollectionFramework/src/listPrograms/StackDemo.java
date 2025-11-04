package listPrograms;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		st.push(66);
		
		System.out.println(st.peek());
		System.out.println("Top Element is :" + st.pop());
		
		System.out.println(st.peek());
		System.out.println("Top Element is :" + st.pop());
		
		System.out.println(st.peek());
		System.out.println("Top Element is :" + st.pop());
		
		st.push(88);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());

		while(!st.empty())
			System.out.println(st.pop());
	}

}
