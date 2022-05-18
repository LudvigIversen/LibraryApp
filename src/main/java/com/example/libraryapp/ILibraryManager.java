package com.example.libraryapp;

public interface ILibraryManager {

    boolean checkIfUserCanLend(int userID);
    /*
    Kommer att använda sig av funktionen getUserBooks från LibraryStore
    Den arrayen som denna funktionen returnar kommer längden att kollas och jämföras
    ifall användaren får låna flera
     */

    boolean checkIfAnyLentBooksAreLate(int userID);
    /*
    Kommer kolla om några av de böcker som en användare har lånat är försenade
     */

    void lendBook(int bookID);
    /*
    Lånar böcker åt user
    Kommer använda sig av checkIfUserCanLend för att kolla möjligheterna
    för användaren att låna
     */

    boolean checkIfUserIsSupended(int userID);
    /*
    Kollar ifall en användare är suspended, använder sig av getUser funktionen i librarystore
     */


    void registerUser(int userID, String firstName, String lastName, String personalNumber, int level);
    /*
    Denna metod anvädns när en user ska skapas
    Denna metoden kommer även kolla och checka så att anvädaren får skapas
    denna check kommer genomföras med hjälp av metoderna
    getUserPersonalNumbers
    getBannedUserPersonalNumbers
    getAllUserID
     */


}
