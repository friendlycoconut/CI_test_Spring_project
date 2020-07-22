package nure.ua.springFinal.demoPr.repository;

import nure.ua.springFinal.demoPr.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AuthorRepository extends CrudRepository<Author, Integer> {

    List<Author> findAll();
}
