package comm.example;

import comm.example.entity.Album;

public interface Dao {
public Album createAlbum(Album album);
public int findById(int id);
}
