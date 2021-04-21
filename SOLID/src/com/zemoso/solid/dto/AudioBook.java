package com.zemoso.solid.dto;

public class AudioBook {
    private boolean isBought = false;
    private String title;
    private String author;

    public void setBought(boolean bought) {
        isBought = bought;
    }

    public boolean getBought() {
        return isBought;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
