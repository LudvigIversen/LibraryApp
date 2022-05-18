package com.example.libraryapp;

import java.sql.SQLException;
import java.util.ArrayList;

public class LibraryManager implements ILibraryManager{
    LibraryStore store = null;

    public LibraryManager(LibraryStore str){
        this.store = str;
    }
    @Override
    public boolean checkIfUserCanLend(int userID) throws SQLException {
         /*
         Hämta anvädaren//getUser från store --> vi vill se storleken på möjliga böcker
         Hämta listan på deras lånade böcker// getUserBooks från store
         om listan är mindre än anvädarens "books", return true
         Om listan är lika stor, return false
          */
        User user = store.getUser(userID);
        ArrayList<Book> books = store.getUserBooks(userID);

        if (books.size() < user.getBooks()) {
            return true;
        } else  {
            return false;
        }

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


}
