package com.example.libraryapp;

public class LibraryManager implements ILibraryManager{
    @Override
    public boolean checkIfUserCanLend(int userID) {
        return false;
    }

    @Override
    public boolean checkIfAnyLentBooksAreLate(int userID) {
        return false;
    }

    @Override
    public void lendBook(int bookID) {

    }

    @Override
    public boolean checkIfUserIsSupended(int userID) {
        return false;
    }

    @Override
    public void registerUser(int userID, String firstName, String lastName, String personalNumber, int level) {

    }

    @Override
    public int checkUserLastSuspension(int userID) {
        return 0;
    }
}
