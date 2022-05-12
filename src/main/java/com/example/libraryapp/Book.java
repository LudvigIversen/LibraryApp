package com.example.libraryapp;

public class Book {
    private int bookID;
    private int ISBN;
    private String title;
    private String author;

    public Book(int bookID, int ISBN, String title, String author){
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public int getID() {
        return bookID;
    }

    public void setID(int ID) {
        this.bookID = ID;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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
