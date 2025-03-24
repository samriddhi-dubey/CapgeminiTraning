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
			System.out.println(
					"Enter 1 to add posts\nEnter 2 to update posts\nEnter 3 to display posts\nEnter 4 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				String name = sc.nextLine();
				int id = sc.nextInt();
				Post post = new Post(name, id);

				user.addPost(post);
				break;
			case 3:
				user.displayPost();
				break;

			case 2:
				System.out.println("Updating a post...");
				user.updatePost(null); // `null` because updatePost method will handle input
				break;

			case 4:
				flag = false;
				break;
			}
		}
	}

}
