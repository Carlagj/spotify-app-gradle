package edu.iesam.features.authors.data;

impot edu.iesam.features.authors.domain.Author;
impot edu.iesam.features.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return null;
    }
}
