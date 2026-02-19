package edu.iesam.features.authors.presentation;

impot edu.iesam.features.authors.data.AuthorApiLocalDataSource;
impot edu.iesam.features.authors.data.AuthorDataRepository;
impot edu.iesam.features.authors.data.AuthorMemLocalDataSource;
impot edu.iesam.features.authors.domain.Author;
impot edu.iesam.features.authors.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AuthorView {
    public static void  printAuthors(){
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(new AuthorDataRepository(new AuthorMemLocalDataSource(new AuthorApiLocalDataSource())));

        ArrayList<Author> AuthorList = getAuthorsUseCase.execute();

        System.out.println(AuthorList);


    }
}
