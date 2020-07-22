package nure.ua.springFinal.demoPr.dao;

import nure.ua.springFinal.demoPr.domain.Author;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRowMapper implements RowMapper<Author> {



    @Override
    public Author mapRow(ResultSet resultSet, int i) throws SQLException {
        Author author = new Author();
        author.setId(resultSet.getInt("Id"));
        author.setName(resultSet.getString("name"));

        return author;
    }
}
