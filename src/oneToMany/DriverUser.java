package oneToMany;

import java.util.Scanner;

public class DriverUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the posts size");
		int size = sc.nextInt();

		User user = new User(size, "Samriddhi");

		boolean flag = true;

		while (flag) {
			System.out.println("Enter 1 to add posts\n Enter 2 to display posts\n Enter 3 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				String name = sc.nextLine();
				int id = sc.nextInt();
				Post post = new Post(name, id);

				user.addPost(post);
				break;
			case 2:
				user.displayPost();
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}

}
