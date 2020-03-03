package comm.example;

import comm.example.hibernate.Post;

public interface Service {
	public Post createPost(Post post);
	public  int findById(int id);
}
