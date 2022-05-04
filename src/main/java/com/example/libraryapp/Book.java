package com.example.libraryapp;

public class Book {
    private int ISBN;
    private String titel;
    private String author;

    public int getISBN(){
        return this.ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



}
