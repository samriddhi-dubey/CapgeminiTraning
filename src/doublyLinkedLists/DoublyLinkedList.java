package doublyLinkedLists;

public class DoublyLinkedList {

	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}

		count++;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node current = head;
		System.out.print("Forward: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();

		displayBackward();
	}

	public void displayBackward() {
		if (tail == null) {
			System.out.println("List is empty.");
			return;
		}

		Node current = tail;
		System.out.print("Backward: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.previous;
		}
		System.out.println();
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
		System.out.println("Node at position " + pos + " updated to " + newData);
	}
	
	public void insertAtPosition(int pos, int data) {
	    if (pos < 1 || pos > count + 1) {
	        System.out.println("Invalid position!");
	        return;
	    }

	    Node node = new Node(data);

	    if (pos == 1) { // Insert at beginning
	        if (head == null) {
	            head = node;
	            tail = node;
	        } else {
	            node.next = head;
	            head.previous = node;
	            head = node;
	        }
	    } else if (pos == count + 1) { // Insert at end
	        tail.next = node;
	        node.previous = tail;
	        tail = node;
	    } else { // Insert in the middle
	        Node current = head;
	        for (int i = 1; i < pos - 1; i++) {
	            current = current.next;
	        }

	        node.next = current.next;
	        node.previous = current;
	        current.next.previous = node;
	        current.next = node;
	    }

	    count++;
	    System.out.println("Node with data " + data + " inserted at position " + pos);
	}


	public void deleteAtPosition(int pos) {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		if (pos < 1 || pos > count) {
			System.out.println("Invalid position!");
			return;
		}

		if (pos == 1) {
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.previous = null;
			}
		} else if (pos == count) {
			tail = tail.previous;
			tail.next = null;
		} else {
			Node current = head;
			for (int i = 1; i < pos; i++) {
				current = current.next;
			}

			current.previous.next = current.next;
			current.next.previous = current.previous;
		}

		count--;
		System.out.println("Node at position " + pos + " deleted.");
	}

}
