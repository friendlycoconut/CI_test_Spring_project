package nure.ua.springFinal.demoPr.dao;

import nure.ua.springFinal.demoPr.domain.Author;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao{

    NamedParameterJdbcOperations namedParameterJdbcOperations;

    public AuthorDaoImpl(NamedParameterJdbcOperations namedParameterJdbcOperations) {
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }

    @Override
    public List<Author> findAll() {
        return namedParameterJdbcOperations.query("select * from author", new AuthorRowMapper());
    }

    @Override
    public void insert(Author author) {

    }

    @Override
    public Author findByID(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateAuthor(Author emp) {

    }

    @Override
    public void executeUpdateAuthor(Author emp) {

    }
}
