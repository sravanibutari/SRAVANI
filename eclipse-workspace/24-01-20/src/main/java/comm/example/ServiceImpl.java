package comm.example;


import comm.example.hibernate.Post;

public class ServiceImpl implements Service{
	Dao dao;
	@Override
	public Post createPost(Post post)
	{
		return dao.createPost(post);
	}
@Override
public int findById(int id)
{
	return 0;
}
}
