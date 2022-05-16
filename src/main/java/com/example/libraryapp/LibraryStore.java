package com.example.libraryapp;

import java.sql.*;
import java.util.ArrayList;

public class LibraryStore implements ILibraryStore{
    @Override
    public ArrayList<Book> getBookWithTitle(String atitle) throws SQLException {
        ArrayList<Book> books = new ArrayList<Book>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM books where title='" + atitle + "'" );

            while (set.next()) { //använd alltid en "while" när ResultSet ska hanteras
                Book book = new Book();
                book.setID(set.getInt("ID"));
                book.setISBN(set.getInt("ISBN"));
                book.setTitle(set.getString("Title"));
                book.setAuthor(set.getString("Author"));
                books.add(book);
            }

        }

        return books;
    }

    @Override
    public ArrayList<Book> getBookWithISBN(int ISBN) throws SQLException {
        ArrayList<Book> books = new ArrayList<Book>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM books where ISBN='" + ISBN + "'" );

            while (set.next()) {
                Book book = new Book();
                book.setID(set.getInt("ID"));
                book.setISBN(set.getInt("ISBN"));
                book.setTitle(set.getString("Title"));
                book.setAuthor(set.getString("Author"));
                books.add(book);
            }

        }

        return books;
    }

    @Override
    public ArrayList<String> getBooksAndAvailability() {
        return new ArrayList<String>();
    }

    @Override
    public User getUser(int userID) throws SQLException {
        User user = null;
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM users  where ID='" + userID + "'" );

            while(set.next()) {
                user = new User(set.getInt("ID"), set.getString("FirstName"),
                        set.getString("LastName"), set.getString("PersonalNumber"), set.getInt("Level"),
                        set.getInt("Suscounter"), set.getBoolean("Suspended"));
            }
            return user;
        }


    }

    @Override
    public ArrayList<Integer> getAllUserID() throws SQLException{
        ArrayList<Integer> IDs = new ArrayList<Integer>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT ID FROM users");

            while (set.next()) {
                Integer integer = set.getInt(1);
                IDs.add(integer);
            }

        }

        return IDs;
    }

    @Override
    public ArrayList<Book> getUserBooks(int userID) throws SQLException { // kanske behöver hämta timestamp, kan också vara en lösning att hämta oldestBook typ
        ArrayList<Book> books = new ArrayList<Book>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

            Statement statement = conn.createStatement();
            ResultSet set = statement.executeQuery("select books.ID, books.ISBN, books.Title, books.Author from users, books, userbooks where users.ID = userbooks.UserID and books.ID = userbooks.BookID and UserID =" + userID);

            while (set.next()) {
                Book book = new Book();
                book.setID(set.getInt("ID"));
                book.setISBN(set.getInt("ISBN"));
                book.setTitle(set.getString("Title"));
                book.setAuthor(set.getString("Author"));
                books.add(book);
            }

        }

        return books;
    }

    @Override
    public ArrayList<String> getUserPersonalNumbers() {
        return new ArrayList<String>();
    }

    @Override
    public ArrayList<String> getBannedUsersPersonalNumber() {
        return new ArrayList<String>();
    }

    @Override
    public void returnBook(int bookID) {

    }

    @Override
    public void storeLendBook(int bookID) {

    }

    @Override
    public void createUser(int userID, String firstName, String lastName, String personalNumber, int level) {

    }

    @Override
    public void deleteUser(int userID) {

    }

    @Override
    public void banUser(int userID) {

    }

    @Override
    public void suspendUser(int userID) {

    }

    @Override
    public void unsuspendUser(int userID) {

    }
}
