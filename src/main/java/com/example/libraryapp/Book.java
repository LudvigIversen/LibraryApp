package com.example.libraryapp;

public class Book {
    public int bookID;
    public int ISBN;
    public String title;
    public String author;

    public Book() {

    }

    public Book(int bookID, int ISBN, String title, String author){
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getID() {
        return this.bookID;
    }

    public void setID(int ID) {
        this.bookID = ID;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
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
