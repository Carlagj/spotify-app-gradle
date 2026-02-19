package edu.iesam.features.songs.presentation;

impot edu.iesam.features.songs.data.SongDataRepository;
impot edu.iesam.features.songs.domain.GetSongsUseCase;
impot edu.iesam.features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository());
        ArrayList<Song> songsList = getSongsUseCase.execute();


        System.out.println(songsList);


    }

}
