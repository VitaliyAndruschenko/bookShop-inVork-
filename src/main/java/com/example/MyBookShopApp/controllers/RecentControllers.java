package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.book.SortingDate;
import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.service.BookService;
import com.example.MyBookShopApp.data.BooksPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class RecentControllers {
    @Autowired
    BookService service;

    @ModelAttribute("sortingDate")
    public SortingDate sortingDate() {
        return new SortingDate();
    }

    @ModelAttribute("recentBooks")
    public List<Book> getAllEmployees(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "9") Integer pageSize,
            @RequestParam(value = "from", defaultValue = "01.01.2012")@DateTimeFormat (pattern = "dd.MM.yyyy")Date from,
            @RequestParam(value = "to" , defaultValue = "01.01.2017")@DateTimeFormat(pattern = "dd.MM.yyyy") Date to) {
        List<Book> list = service.getAllEmployees(from, to, pageNo, pageSize);
        return list;
    }
    @GetMapping("/recent")
    public String getRecentPage() {
        return "books/recent";
    }

    @GetMapping("/recent{from}/{to}")
        public String recentAddPage(@RequestParam(value = "from", defaultValue = "01.01.2012", required = false)@DateTimeFormat (pattern = "dd.MM.yyyy")Date from,
                                    @RequestParam(value = "to", defaultValue = "01.01.2017", required = false)@DateTimeFormat(pattern = "dd.MM.yyyy") Date to,
                                    @RequestParam(defaultValue = "0") Integer pageNo,
                                    @RequestParam(defaultValue = "6") Integer pageSize,
                                    Model model)
    {
        model.addAttribute(service.getAllEmployees(from, to, pageNo, pageSize));
            return "books/recent";
        }

    @GetMapping("books/recent")
    @ResponseBody
    public BooksPageDto getNextRecentPage(@RequestParam("offset") Integer offset,
                                          @RequestParam("limit") Integer limit,
                                          @RequestParam(value = "from", required = false)@DateTimeFormat (pattern = "dd.MM.yyyy")Date from,
                                          @RequestParam(value = "to", required = false)@DateTimeFormat(pattern = "dd.MM.yyyy") Date to)
    {
        return new BooksPageDto(service.getPageOfRecentResultBooks(from, to, offset, limit).getContent());
    }
}
