package com.example.libraryapp;

public class LibraryManager implements ILibraryManager{
    LibraryStore store = null;

    public LibraryManager(LibraryStore str){
        this.store = str;
    }
    @Override
    public boolean checkIfUserCanLend(int userID) {
         /*
         Hämta anvädaren --> vi vill se storleken på möjliga böcker
         Hämta listan på deras lånade böcker
         om listan är mindre än anvädarens "books", return true
         Om listan är lika stor, return false
          */
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


}
