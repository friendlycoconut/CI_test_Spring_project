package nure.ua.springFinal.demoPr;

import nure.ua.springFinal.demoPr.domain.Author;
import nure.ua.springFinal.demoPr.repository.AuthorRepository;
import nure.ua.springFinal.demoPr.rest.AuthorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoPrApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPrApplication.class, args);
	}

	@Autowired
	private AuthorRepository repository;

	@PostConstruct
	public void init() {
		repository.save(new Author("Pushkin"));
		repository.save(new Author("Lermontov"));
	}

}
