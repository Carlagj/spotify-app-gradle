package edu.iesam.features.albums.data;

impot edu.iesam.features.albums.domain.Album;
impot edu.iesam.features.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {



    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }


    @Override
    public ArrayList<Album> getAlbums() {

        return albumMemLocalDataSource.findAll();
    }
}
