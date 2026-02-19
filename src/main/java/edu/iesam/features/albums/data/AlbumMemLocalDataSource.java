package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {
    public ArrayList<Album> Storage = new ArrayList<>();

   private   AlbumMemLocalDataSource() {
        initData();
    }


    public  void initData(){
        Album album1 = new Album("1","callaita","2022");
        Storage.add(album1);

        Album album2 = new Album("2","macarena","2004");
        Storage.add(album2);
    }

    public ArrayList<Album> findAll(){
        return  Storage;
    }

    public void save(Album album){
        Storage.add(album);
    }


public static  AlbumMemLocalDataSource newInstance(){
       AlbumMemLocalDataSource albumMemLocalDataSource= new AlbumMemLocalDataSource();

       return  albumMemLocalDataSource;

}


}
