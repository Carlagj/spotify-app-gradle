package edu.iesam.features.authors.presentation;

import edu.iesam.features.authors.data.AuthorApiLocalDataSource;
import edu.iesam.features.authors.data.AuthorDataRepository;
import edu.iesam.features.authors.data.AuthorMemLocalDataSource;
import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AuthorView {
    public static void  printAuthors(){
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(new AuthorDataRepository(new AuthorMemLocalDataSource(new AuthorApiLocalDataSource())));

        ArrayList<Author> AuthorList = getAuthorsUseCase.execute();

        System.out.println(AuthorList);


    }
}
