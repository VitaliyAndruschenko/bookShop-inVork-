package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.SearchIdDto;
import com.example.MyBookShopApp.data.SearchWordDto;
import com.example.MyBookShopApp.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@Api(description = "authors data")
public class AuthorsController {

    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/books/author")
    public String authorsPage(Model model, @PathVariable(value = "id", required = false) Integer id){
        id = 5;
        model.addAttribute("Author", authorService.getAuthorsData());
        model.addAttribute("id", authorService.getAuthorsData().get(id));
        return "authors/index";
    }

    @GetMapping("/authors/slug.html{id}")
    public String getSlugPage(Model model, @PathVariable(value = "id", required = false) Integer id) {
        id = 5;
        model.addAttribute("id", authorService.getAuthorsFindId(id));
        model.addAttribute("AuthorList", authorService.authors(id));
        return "authors/slug.html";
    }

    @ApiOperation("method to get map of authors")
    @GetMapping("/api/authors")
    @ResponseBody
    public Map<String,List<Author>> authorsMap(){
        return authorService.getAuthorsData();
    }
}
