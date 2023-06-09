package com.example.MyBookShopApp.service;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TagService {
    private TagRepository tagRepository;
    @Autowired
    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Page<Book> getPageOfTagResultBooks(Integer searchTag, Integer offset, Integer limit){
        Pageable nextPage = PageRequest.of(offset,limit);
        return tagRepository.findAllByTagId(searchTag, nextPage);
    }

}
