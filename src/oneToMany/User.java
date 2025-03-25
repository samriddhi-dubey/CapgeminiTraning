package oneToMany;

import java.util.Scanner;

//one user-many posts

public class User {

	Post[] posts;
	String userName;
	static int count = 0;

	User(int size, String userName) {
		posts = new Post[size];
		this.userName = userName;
	}

	public void addPost(Post post) {
		if (count < posts.length) {
			posts[count++] = post;
			System.out.println("Post added");

		} else {
			System.out.println("Arraay filled");
		}
	}

//	public void removePost(Post post) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id to delete");
//		int id = sc.nextInt();
//
//		boolean found = false;
//
//		for (int i = 0; i < count; i++) {
//			if (posts[i].getPostID() == id) {
//
//				for (int j = i; j < count - 1; j++) {
//					posts[j] = posts[j + 1];
//				}
//
//				count--;
//				found = true;
//				System.out.println("Post with ID " + id + " has been removed.");
//				break;
//			}
//		}
//
//		if (!found) {
//			System.out.println("Post with ID " + id + " not found.");
//		}
//	}

	public void updatePost(Post post) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the post to update:");
		int id = sc.nextInt();
		sc.nextLine();

		boolean found = false;

		for (int i = 0; i < count; i++) {
			if (posts[i].getPostID() == id) {
				System.out.println("Current content: " + posts[i].getPostDescription());
				System.out.println("Enter new content:");
				String newContent = sc.nextLine();
				posts[i].setPostDescription(newContent);
				System.out.println("Post updated successfully.");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Post with ID " + id + " not found.");
		}
		sc.close();

	}

	public void displayPost() {
		for (int i = 0; i < count; i++) {
			System.out.println(posts[i].getPostID() + " " + posts[i].getPostDescription());
		}

	}

}
