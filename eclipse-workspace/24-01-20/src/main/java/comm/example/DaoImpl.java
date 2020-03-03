package comm.example;

import java.time.LocalDate;

import comm.example.hibernate.Commitment;
import comm.example.hibernate.Post;
public class DaoImpl implements Dao{
	public Post createPost(Post post)
	{
		Post tempPost=new Post("c", "cvb.in",LocalDate.now());
		Commitment tempCommitment=new Commitment("a", "abc.com",LocalDate.now(),"b",LocalDate.now());
		tempPost.setCommitment(tempCommitment);
	return tempPost;
	}
	public int findById(int id)
	{
		return 0;
	}
}
