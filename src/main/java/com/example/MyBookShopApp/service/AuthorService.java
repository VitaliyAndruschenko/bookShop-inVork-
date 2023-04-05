package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;
@Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> authors(Integer id) {
    return authorRepository.findAuthorByAuthorId(id);
    }

    public Author getAuthorsFindId(Integer id) {
    List<Author> sortAuthors = authorRepository.findAll();
    return sortAuthors.get(id);
    }
    public Map<String,List<Author>> getAuthorsData() {
    List<Author> authors = authorRepository.findAll();
       return authors.stream().collect(Collectors.groupingBy((Author a) -> {return a.getLastName().substring(0,1);}));
    }
}
