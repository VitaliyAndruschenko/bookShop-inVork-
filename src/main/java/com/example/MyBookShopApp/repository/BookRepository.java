package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findBooksByAuthor_FirstName(String name);

    @Query("from Book")
    List<Book> customFindAllBooks();

    //NEW BOOK REST REPOSITORY COMMANDS

    List<Book> findBooksByAuthorFirstNameContaining(String authorFirstName);

    List<Book> findBooksByTitleContaining(String bookTitle);

    List<Book> findBooksByPriceOldBetween(Integer min, Integer max);

    List<Book> findBooksByPriceOldIs(Integer price);

    @Query("from Book where isBestseller=1")
    List<Book> getBestsellers();

    @Query(value = "SELECT * FROM books WHERE discount = (SELECT MAX(discount) FROM books)", nativeQuery = true)
    List<Book> getBooksWithMaxDiscount();
    @Query(value = "SELECT *, (crate + (0.7 * bought) + (0.4 * postponed)) AS summ FROM books ORDER BY summ DESC", nativeQuery = true)
    List<Book> getFormula(Pageable pageable);
    List<Book> findBookByIdBetween(Integer atId, Integer toId, Pageable pageable);
    Page<Book> findBookByTitleContaining(String bookTitle, Pageable nextPage);

    Page<Book> findBookByPubDateBetween(Date start, Date to, Pageable nextPage);


}
