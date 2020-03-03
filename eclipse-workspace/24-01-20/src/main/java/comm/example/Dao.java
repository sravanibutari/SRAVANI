package comm.example;

import comm.example.hibernate.Post;



public interface Dao {
	public Post createPost(Post post);
	public  int findById(int id);
}
