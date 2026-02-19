package edu.iesam.features.albums.presentation;

impot edu.iesam.features.albums.data.AlbumDataRepository;
impot edu.iesam.features.albums.data.AlbumMemLocalDataSource;
impot edu.iesam.features.albums.domain.Album;
impot edu.iesam.features.albums.domain.GetAlbumsUseCase;

import java.util.ArrayList;

public class AlbumView {

    public static void  printAlbum(){

        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(new AlbumMemLocalDataSource())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);


    }
}
