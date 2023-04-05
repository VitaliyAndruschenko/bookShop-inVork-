package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TagController {

    TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/tags")
    private String getTagsPage() {
        return "tags/index";
    }

    @GetMapping("/tags/tagOne")
    private String getTagsPageOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(1, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwo")
    private String getTagsPageTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(2, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThree")
    private String getTagsPageThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(3, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFour")
    private String getTagsPageFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(4, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFive")
    private String getTagsPageFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(5, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagSix")
    private String getTagsPageSix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(6, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagSeven")
    private String getTagsPageSeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(7, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagEight")
    private String getTagsPageEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(8, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagNine")
    private String getTagsPageNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(9, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTen")
    private String getTagsPageTen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(10, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagEleven")
    private String getTagsPageEleven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(11, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwelve")
    private String getTagsPageTwelve(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(12, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirteen")
    private String getTagsPageThirteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(13, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFourteen")
    private String getTagsPageFourteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(14, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFifteen")
    private String getTagsPageFifteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(15, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagSixteen")
    private String getTagsPageSixteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(16, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagSeventeen")
    private String getTagsPageSeventeen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(17, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagEighteen")
    private String getTagsPageEighteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(18, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagNineteen")
    private String getTagsPageNineteen(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(19, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwenty")
    private String getTagsPageTwenty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(20, pageNo, pageSize).getContent());
        return  "tags/index";
    }
    @GetMapping("/tags/tagTwentyOne")
    private String getTagsPageTwentyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(21, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyTwo")
    private String getTagsPageTwentyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(22, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyThree")
    private String getTagsPageTwentyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(23, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyFour")
    private String getTagsPageTwentyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(24, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyFive")
    private String getTagsPageTwentyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(25, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentySix")
    private String getTagsPageTwentySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(26, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentySeven")
    private String getTagsPageTwentySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(27, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyEight")
    private String getTagsPageTwentyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(28, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagTwentyNine")
    private String getTagsPageTwentyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(29, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirty")
    private String getTagsPageThirty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(30, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyOne")
    private String getTagsPageThirtyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(31, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyTwo")
    private String getTagsPageThirtyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(32, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyThree")
    private String getTagsPageThirtyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(33, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyFour")
    private String getTagsPageThirtyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(34, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyFive")
    private String getTagsPageThirtyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(35, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtySix")
    private String getTagsPageThirtySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(36, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtySeven")
    private String getTagsPageThirtySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(37, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyEight")
    private String getTagsPageThirtyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(38, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagThirtyNine")
    private String getTagsPageThirtyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(39, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagForty")
    private String getTagsPageForty(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(40, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyOne")
    private String getTagsPageFortyOne(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(41, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyTwo")
    private String getTagsPageFortyTwo(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(42, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyThree")
    private String getTagsPageFortyThree(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(43, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyFour")
    private String getTagsPageFortyFour(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(44, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyFive")
    private String getTagsPageFortyFive(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(45, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortySix")
    private String getTagsPageFortySix(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(46, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortySeven")
    private String getTagsPageFortySeven(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(47, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyEight")
    private String getTagsPageFortyEight(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(48, pageNo, pageSize).getContent());
        return  "tags/index";
    }

    @GetMapping("/tags/tagFortyNine")
    private String getTagsPageFortyNine(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "6") Integer pageSize, Model model) {
        model.addAttribute("Tag", tagService.getPageOfTagResultBooks(49, pageNo, pageSize).getContent());
        return  "tags/index";
    }


}
