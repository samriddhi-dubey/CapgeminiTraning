package oneToMany;

import java.util.Scanner;

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
	public void removePost(Post post) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the id to delete");
	   int id=sc.nextInt();
	   
		
	}

	public void displayPost() {
		for (int i = 0; i < count; i++) {
			System.out.println(posts[i].postID + " " + posts[i].postDescription);
		}

	}

}
