package doublyLinkedLists;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to insert data\nEnter 2 to display\nEnter 3 to exit\nEnter 4 to update\nEnter 5 to insert at specific position\nEnter 6 to delete at specific position\nEnter 7 to print backward ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.insert(data);
				break;
			}
			case 3:
				flag = false;
				break;
			case 2:
				list.display();
				break;
			case 7:
				list.displayBackward();
				break;
			case 5:
				System.out.print("Enter the position:");
				int pos = sc.nextInt();
				System.out.print("Enter the data:");
				int data = sc.nextInt();
				list.insertAtPosition(pos, data);
				break;
			case 4:
				System.out.print("Enter the position:");
				int pos1 = sc.nextInt();
				System.out.print("Enter the data:");
				int data1 = sc.nextInt();
				list.updateAtPosition(pos1, data1);
			case 6:
				System.out.print("Enter the position:");
				int pos2 = sc.nextInt();

				list.deleteAtPosition(pos2);
				break;
			}
		}
	}

}
