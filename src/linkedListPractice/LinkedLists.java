package linkedListPractice;

import java.util.LinkedList;

public class LinkedLists {
	
	//properties
	Node head;
	int count;
	
	
	//constructors
//	public LinkedLists() {
//		head = null;
//		count = 0;
//	}
	
	public LinkedLists(Node newHead) {
		head = newHead;
		count = 1;
	}
	
	//methods
	public void Add(int newData) {
		Node temp = new Node(newData);
		//Node current = head;
		if (count == 0) {
			Node current = temp;
		}else {
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
		
		count++;
		
	}
	
	public int getIndex(int index) {
		if (index <= 0) {
			return -1;
		}
		Node current = head;
		for(int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void remove() {
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		
		
	}
	

}
