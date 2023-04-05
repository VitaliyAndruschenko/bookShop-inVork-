package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BooksPageDto;
import com.example.MyBookShopApp.service.PopularsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PopularsController {

    PopularsService popularsService;

    public PopularsController(PopularsService popularsService) {
        this.popularsService = popularsService;
    }

    @ModelAttribute("popularBook")
    public List<Book> getAllPopularBook(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize) {
        List<Book> list = popularsService.getPageQueryTest(pageNo, pageSize);
        return list;
    }

    @GetMapping("/popular")
    public String getStartPopularPage() {
        return "books/popular";
    }

    @GetMapping("/books/popular")
    @ResponseBody
    public BooksPageDto getPopularPage(@RequestParam("offset") Integer offset,
                                       @RequestParam("limit") Integer limit) {
        return new BooksPageDto(popularsService.getPageQueryTest(1, limit));
    }

}
