package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.GenreEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Book, Integer> {
    Page<Book> findAllByGenreId(Integer genreId, Pageable nextPage);
}
