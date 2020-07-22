package queue;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {
	LinkedList queue;
	
	public Queuey() {
		queue = new LinkedList();
	}
	
	public boolean IsEmpty() {
		return queue.isEmpty();					
	}
	
	public int size() {
		return queue.size();
	}
	
	public void enqueue(int n) {
		queue.addLast(n);
	}
	
	public int dequeue () {
		return (int)queue.remove(0);
	}
	
	public int peek() {
		return (int)queue.get(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuey q = new Queuey();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		
		
		System.out.println("(First in) First out "+ q.dequeue());
		System.out.println("2nd out "+ q.dequeue());
		System.out.println("Peek 2nd item "+ q.peek());
		System.out.println("3rd out "+ q.dequeue());
		System.out.println("4th out "+ q.dequeue());
		System.out.println("5th out "+ q.dequeue());
		System.out.println("6th out "+ q.dequeue());
		
//		Stack<String> s = new Stack<>();
//		s.push("there");
//		s.push("Hi ");
//		System.out.println(s.pop());
//		System.out.println(s.pop());

		

	}

}
