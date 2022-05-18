package com.example.libraryapp;

import java.sql.SQLException;

public interface ILibraryManager {

    boolean checkIfUserCanLend(int userID) throws SQLException;
    /*
    Kommer att använda sig av funktionen getUserBooks från LibraryStore
    Den arrayen som denna funktionen returnar kommer längden att kollas och jämföras
    ifall användaren får låna flera
     */

    boolean checkIfAnyLentBooksAreLate(int userID) throws SQLException, UnusableException;
    /*
    Kommer kolla om några av de böcker som en användare har lånat är försenade
     */

    boolean lendBook(int bookID, int userID) throws SQLException;
    /*
    Lånar böcker åt user
    Kommer använda sig av checkIfUserCanLend för att kolla möjligheterna
    för användaren att låna
     */




    int registerUser(int userID, String firstName, String lastName, String personalNumber, int level) throws SQLException, UnusableException;
    /*
    Denna metod anvädns när en user ska skapas
    Denna metoden kommer även kolla och checka så att anvädaren får skapas
    denna check kommer genomföras med hjälp av metoderna
    getUserPersonalNumbers
    getBannedUserPersonalNumbers
    getAllUserID
     */


}
