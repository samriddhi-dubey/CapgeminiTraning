package linkedLists;

public class SinglyLinkedList {

	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			tail = node;
			count++;

		}
	}

	public void display() {

		if (head == null) {
			System.err.println("No data to display");
			return;
		} else {
			Node current = head;

			while (current != null) {
				System.err.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

	}

	public void insertAtPosition(int pos, int newData) {
		Node newNode = new Node(newData);
		newNode.data = newData;
		newNode.next = null;

		if (pos < 1 || pos > count + 1) {
			System.out.println("Invalid");
		} else if (pos == 1) {
			newNode.next = head;
			head = newNode;
			count++;
		} else {
			Node temp = head;
			while (--pos > 1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			count++;

		}
	}

	public void update(int pos, int newData) {

		if (pos > count) {
			System.out.println("Invalid count");
		} else if (pos == 1) {

			head.data = newData;

		} else {
			Node current = head;
			for (int i = 1; i <= pos - 1; i++) {
				current = current.next;
			}
			current.data = newData;
			System.out.println("update");

		}
	}

}
