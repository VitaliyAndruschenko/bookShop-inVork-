package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.GenreEntity;
import com.example.MyBookShopApp.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

    GenreRepository genreRepository;
    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Page<Book> getPageOfGenreResultBooks(Integer idGenre, Integer offset, Integer limit){
        Pageable nextPage = PageRequest.of(offset,limit);
        return genreRepository.findAllByGenreId(idGenre, nextPage);
    }
}
