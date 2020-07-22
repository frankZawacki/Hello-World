package linkedListPractice;

public class RemoveDuplicates {
	
	//not part of orig liknkedLists but related
//	algorithm removeDuplicates is 
//	input: LinkedListNode head 
//	output: none 
	public static void removeDupes(Node head) {
		Node current = head; 
		Node runner = null ;
		while (current != null) {
			runner = current; 
			while (runner.next != null) {

				if (runner.next.data == current.data) {
					runner.next = runner.next.next; 
				}
				else {
					runner = runner.next; 
					current = current.next;
				}
			}
		}
	}

}
