package linkedLists;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 to insert data\nEnter 2 to display\nEnter 3 to exit\nEnter 4 to update\nEnter 5 to insert at specific position ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter the data");
				int data = sc.nextInt();
				list.insert(data);
				break;
			}
			case 2:
				
				list.display();
				
				break;
			case 3:
				flag = false;
				break;
				
			case 4:
				list.update(3, 11);
				break;
			case 5:
				list.insertAtPosition(3, 11);
				break;
			}
		}
	}

}
