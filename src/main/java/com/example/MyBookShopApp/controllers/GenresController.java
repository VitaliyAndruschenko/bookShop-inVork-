package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenresController {
    private GenreService genreService;
    @Autowired
    public GenresController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/genres")
    private String getPageGenres() {
        return "/genres/index";
    }

   @GetMapping("/genres/slugOne")
   private String getGenrePageOne(
           @RequestParam(defaultValue = "0") Integer pageNo,
           @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
       model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(1, pageNo, pageSize).getContent());
       return "/genres/slug";
   }

    @GetMapping("/genres/slugTwo")
    private String getGenrePageTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(2, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThree")
    private String getGenrePageThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(3, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFour")
    private String getGenrePageFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(4, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFive")
    private String getGenrePageFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(5, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugSix")
    private String getGenrePageSix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(6, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugSeven")
    private String getGenrePageSeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(7, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugEight")
    private String getGenrePageEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(8, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugNine")
    private String getGenrePageNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(9, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTen")
    private String getGenrePageTen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(10, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugEleven")
    private String getGenrePageEleven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(11, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwelve")
    private String getGenrePageTwelve(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(12, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirteen")
    private String getGenrePageThirteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(13, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFourteen")
    private String getGenrePageFourteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(14, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFifteen")
    private String getGenrePageFifteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(15, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugSixteen")
    private String getGenrePageSixteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(16, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugSeventeen")
    private String getGenrePageSeventeen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(17, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugEighteen")
    private String getGenrePageEighteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(18, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugNineteen")
    private String getGenrePageNineteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(19, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwenty")
    private String getGenrePageTwenty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(20, pageNo, pageSize).getContent());
        return "/genres/slug";
    }
    @GetMapping("/genres/slugTwentyOne")
    private String getGenrePageTwentyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(21, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyTwo")
    private String getGenrePageTwentyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(22, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyThree")
    private String getGenrePageTwentyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(23, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyFour")
    private String getGenrePageTwentyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(24, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyFive")
    private String getGenrePageTwentyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(25, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentySix")
    private String getGenrePageTwentySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(26, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentySeven")
    private String getGenrePageTwentySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(27, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyEight")
    private String getGenrePageTwentyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(28, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugTwentyNine")
    private String getGenrePageTwentyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(29, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirty")
    private String getGenrePageThirty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(30, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyOne")
    private String getGenrePageThirtyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(31, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyTwo")
    private String getGenrePageThirtyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(32, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyThree")
    private String getGenrePageThirtyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(33, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyFour")
    private String getGenrePageThirtyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(34, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyFive")
    private String getGenrePageThirtyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(35, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtySix")
    private String getGenrePageThirtySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(36, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtySeven")
    private String getGenrePageThirtySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(37, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyEight")
    private String getGenrePageThirtyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(38, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugThirtyNine")
    private String getGenrePageThirtyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(39, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugForty")
    private String getGenrePageForty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(40, pageNo, pageSize).getContent());
        return "/genres/slug";
    }
    @GetMapping("/genres/slugFortyOne")
    private String getGenrePageFortyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(41, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyTwo")
    private String getGenrePageFortyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(42, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyThree")
    private String getGenrePageFortyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(43, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyFour")
    private String getGenrePageFortyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(44, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyFive")
    private String getGenrePageFortyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(45, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortySix")
    private String getGenrePageFortySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(46, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortySeven")
    private String getGenrePageFortySevenSeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(47, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyEight")
    private String getGenrePageFortyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(48, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFortyNine")
    private String getGenrePageFortyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(49, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFifty")
    private String getGenrePageFifty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(50, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyOne")
    private String getGenrePageFiftyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(51, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyTwo")
    private String getGenrePageFiftyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(52, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyThree")
    private String getGenrePageFiftyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(53, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyFour")
    private String getGenrePageFiftyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(54, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyFive")
    private String getGenrePageFifteenFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(55, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftySix")
    private String getGenrePageFiftySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(56, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftySeven")
    private String getGenrePageFiftySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(57, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyEight")
    private String getGenrePageFiftyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(58, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugFiftyNine")
    private String getGenrePageFiftyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(59, pageNo, pageSize).getContent());
        return "/genres/slug";
    }

    @GetMapping("/genres/slugSixty")
    private String getGenrePageSixty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "4") Integer pageSize, Model model) {
        model.addAttribute("TagGenre", genreService.getPageOfGenreResultBooks(60, pageNo, pageSize).getContent());
        return "/genres/slug";
    }
}
