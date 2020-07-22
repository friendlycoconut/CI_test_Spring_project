package nure.ua.springFinal.demoPr.dao;

import nure.ua.springFinal.demoPr.domain.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> findAll();
    void insert(Author author);
    Author findByID(int id);
    void deleteById(int id);

    void updateAuthor(Author emp);
    void executeUpdateAuthor(Author emp);
}
