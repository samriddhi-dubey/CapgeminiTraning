package oneToMany;

public class Post {
	private String postDescription;
	
	public String getPostDescription() {
		return postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	private int postID;

	public int getPostID() {
		return postID;
	}

	public Post(String postDescription, int postID) {
		this.postDescription = postDescription;
		this.postID = postID;
	}

}
