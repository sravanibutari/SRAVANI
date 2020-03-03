package comm.example;

import comm.example.entity.Album;

public class ServiceImpl implements Service{
	Dao dao;
	@Override
	public Album createAlbum(Album album)
	{
		return dao.createAlbum(album);
	}
@Override
public int findById(int id)
{
	return 0;
}
}
