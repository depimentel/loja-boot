package br.com.caelum.fj27.controller;

import br.com.caelum.fj27.domain.Author;
import br.com.caelum.fj27.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by nando on 13/07/17.
 */
@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository repository;

    @GetMapping("/form")
    public ModelAndView form(Author author){
        return new ModelAndView("authors/form");
    }

    @GetMapping
    @Cacheable("allAuthors")
    public ModelAndView list(){

        ModelAndView view = new ModelAndView("authors/list");

        view.addObject("authors", repository.findAll());

        return view;
    }

    @PostMapping
    @CacheEvict(value = "allAuthors", allEntries = true)
    public ModelAndView save(@Valid Author author, BindingResult result){

        if (result.hasErrors()) return form(author);

        repository.save(author);

        return new ModelAndView("redirect:/authors");
    }

}
