package circularSinglyLinkedList;

public class CircularSinglyLinkedList {

	static int count = 0;
	Node head;
	Node tail;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}

		count++;
	}

	public void display() {
		if (head == null) {
			System.err.println("List is empty.");
			return;
		}

		Node current = head;
		do {
			System.err.print(current.data + " ");
			current = current.next;
		} while (current != head);

		System.out.println();
	}

	public void insertAtPosition(int pos, int data) {
		if (pos < 1 || pos > count + 1) {
			System.err.println("Invalid position!");
			return;
		}

		Node node = new Node(data);

		if (pos == 1) {
			if (head == null) {
				head = node;
				tail = node;
				node.next = head;
			} else {
				node.next = head;
				head = node;
				tail.next = head;
			}
		} else {
			Node current = head;
			for (int i = 1; i < pos - 1; i++) {
				current = current.next;
			}

			node.next = current.next;
			current.next = node;

			if (current == tail) {
				tail = node;
			}
		}

		count++;
		System.err.println("Element is inserted");

	}

	public void updateAtPosition(int pos, int newData) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if (pos < 1 || pos > count) {
			System.out.println("Invalid position!");
			return;
		}

		Node current = head;
		for (int i = 1; i < pos; i++) {
			current = current.next;
		}

		current.data = newData;
		System.err.println("Node at position " + pos + " updated to " + newData);
	}

	public void deleteAtPosition(int pos) {
		if (head == null) {
			System.err.println("List is empty.");
			return;
		}

		if (pos < 1 || pos > count) {
			System.err.println("Invalid position!");
			return;
		}

		if (pos == 1) { 
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				tail.next = head; 
			}
		} else {
			Node current = head;
			for (int i = 1; i < pos - 1; i++) {
				current = current.next;
			}

			Node toDelete = current.next;
			current.next = toDelete.next;

			if (toDelete == tail) { 
				tail = current;
			}
		}

		count--;
		System.err.println("Node at position " + pos + " deleted.");
	}

}
