package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularsService {

    private BookRepository bookRepository;
    @Autowired
    public PopularsService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public List<Book> getPageQueryTest(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        return bookRepository.getFormula(paging);
    }
}
