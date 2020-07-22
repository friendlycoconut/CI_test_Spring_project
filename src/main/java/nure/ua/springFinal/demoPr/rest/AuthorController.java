package nure.ua.springFinal.demoPr.rest;

import nure.ua.springFinal.demoPr.domain.Author;
import nure.ua.springFinal.demoPr.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthorController {
     private final AuthorRepository repo;

     @Autowired
    public AuthorController(AuthorRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String listPage(Model model){
        List<Author> authors = repo.findAll();
        model.addAttribute("authors",authors);
        return "list";
    }

    @GetMapping("/add")
    public String addUserPage (Model model, Author author){

        return "add";

    }

    @PostMapping ("/add")
    public String addUser(Model model, Author author){
        repo.save(author);

        model.addAttribute("authors", repo.findAll());
        return "redirect:/";

    }


    @GetMapping("/edit")
    public String editPage(@RequestParam("id") int id, Model model){
        Author author = repo.findById(id).orElseThrow(NotFoundException::new);
        model.addAttribute("author",author);
        return "edit";
    }

    @PostMapping("/edit")
    public String editsPage(@RequestParam("id") int id, Author user,
                            BindingResult result, Model model){
        if (result.hasErrors()) {
            user.setId(id);
            return "edit";
        }
        repo.save(user);
        model.addAttribute("author", repo.findAll());
        return "redirect:/";
    }


    @GetMapping("/delete")
    public String deletePage(@RequestParam("id") int id){
         repo.deleteById(id);
         return "redirect:/";
    }
}
