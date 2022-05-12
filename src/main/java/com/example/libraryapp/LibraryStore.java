package com.example.libraryapp;

public class LibraryStore implements ILibraryStore{
    @Override
    public Book[] getBookWithTitle(String title) {
        return new Book[0];
    }

    @Override
    public Book[] getBookWithISBN(int ISBN) {
        return new Book[0];
    }

    @Override
    public String[][] getBooksAndAvailability() {
        return new String[0][];
    }

    @Override
    public User getUser(int userID) {
        return null;
    }

    @Override
    public int[] getAllUserID() {
        return new int[0];
    }

    @Override
    public Book[] getUserBooks(int userID) {
        return new Book[0];
    }

    @Override
    public String[] getUserPersonalNumbers() {
        return new String[0];
    }

    @Override
    public String[] getBannedUsersPersonalNumber() {
        return new String[0];
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
    public void suspendUser(int userID) {

    }

    @Override
    public void unsuspendUser(int userID) {

    }
}
