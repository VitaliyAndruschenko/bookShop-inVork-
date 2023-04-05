package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.Author;
import com.example.MyBookShopApp.data.SearchIdDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findAuthorByAuthorId(Integer id);
}

