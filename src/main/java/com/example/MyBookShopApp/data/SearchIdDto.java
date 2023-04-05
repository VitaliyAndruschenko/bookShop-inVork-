package com.example.MyBookShopApp.data;

public class SearchIdDto {
    private int exampleId;

    public SearchIdDto(Integer exampleId) {
        this.exampleId = exampleId;
    }
    public SearchIdDto() {
    }

    public int getExampleId() {
        return exampleId;
    }

    public void setExampleId(int exampleId) {
        this.exampleId = exampleId;
    }
}
