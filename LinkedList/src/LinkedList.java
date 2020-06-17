
public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	void append(int data) {
		// Add First
		if(head == null) {
			head = new Node(data);
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = null;
		//Add last
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}
	

	void printList() {
		Node temp = head;
		while (temp != null) {
			int data = temp.data;
			System.out.print(data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(10);
		list.append(20);
		
		list.printList();
	}

}
