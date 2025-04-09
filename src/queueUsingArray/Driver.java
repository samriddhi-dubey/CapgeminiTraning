package queueUsingArray;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		System.out.println("Enter size of queue");
		int size = sc.nextInt();
		Queue queue = new Queue(size);

		while (flag) {
			System.out
					.println("Enter 1 to enqueue\nEnter 2 to dequeue\nEnter 3 to display\nEnter 4  to peek\nEnter 5 to exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.err.print("Enter the element to queue:");
				int value = sc.nextInt();
				queue.enqueue(value);
				break;
			case 2:

				int k=queue.dequeue();
				System.err.println("Element dequeued is:"+k);
				break;
			case 3:
				queue.display();;
				break;
			case 4:
				int a=queue.peek();
				System.err.println("The peek element is:"+a);
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}

}

