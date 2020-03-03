package comm.example;

import comm.example.entity.Album;
import comm.example.entity.Image;

public class DaoImpl implements Dao{
@Override
public Album createAlbum(Album album)
{
	Album tempAlbum=new Album("Personal");
	Image tempImage=new Image("//jdsskij");
	tempAlbum.setImage(tempImage);
return tempAlbum;
}
@Override
public int findById(int id)
{
	return 0;
}
}
