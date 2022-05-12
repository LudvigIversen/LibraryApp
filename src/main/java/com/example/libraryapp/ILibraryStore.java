package com.example.libraryapp;

public interface ILibraryStore {

    Book[] getBookWithTitle(String title);
    /*
    Används för att hämta en specifik bok, som är tillgänglig, med hjälp av bokens title
    Den hämtar en array då det kan finnas flera böcker av samma sort som är tillgängliga
    Den kommer användas i huvudsak av användaren
     */

    Book[] getBookWithISBN(int ISBN);
    /*
    Används för att hämta en specifik bok, som är tillgänglig med hjälp av bokens ISBN
    Den hämtar en array då det kan finnas flera böcker av samma sort som är tillgängliga
    Denna kommer användas i huvudsak av bibliotekarien
     */

    String[][] getBooksAndAvailability();
    /*
    Används för att hämta alla böcker och hur många exemplar som finns tillgängliga
    kommer använda något liknande denna query;
    select title, count(title) from books
    where available = true
    group by title;
    Vi är osäkra på vad denna ska returna, tanken med att den är en 2D-string-array är att
    den hämtar både namnet på boken, plus countet av dens availability
     */

    User getUser(int userID);
    /*
    Denna metod används för att hämta en användare med hjälp av användar-ID
     */

    int[] getAllUserID();
    /*
    hämtar alla nuvarande existerande användarID, har med createUser funktionen att göra
     */

    Book[] getUserBooks(int userID);
    /*
    Hämtar från kopplingstabellen de böcker, samt antalet (går att se genom längden på arrayen),
    som användaren har utlånade
     */

    String[] getUserPersonalNumbers();
    /*
    Hämtar alla personnummer som finns i databasen, används för funktionen createUser
     */

    String[] getBannedUsersPersonalNumber();
    /*
    Hämtar de personnummer på före detta användare som numera är bannade och inte får registrera sig igen
     */

    void returnBook(int bookID);
    /*
    Används när en bok ska lämnas tillbaka, genom dess ID
    Kommer fungera genom att ta bort "raden" från kopplingstabellen,
    samt att ändra "availability" attributet till true.
     */

    void storeLendBook(int bookID);
    /*
    Används när en bok ska lånas, genom dess ID
    fungerar på motsatt sätt till returnBook, alltså;
    lägg till i kopplingstabellen
    ändra bokens "availability" till false
     */

    void createUser(int userID, String firstName, String lastName, String personalNumber, int level);
   /*
   Används för att skapa en ny användare
    */

    void deleteUser(int userID);
    /*
    Används för att ta bort en användare
    bör fungera på så sätt att den ta bort den användare som har matchande ID som inputen
     */

    void suspendUser(int userID);
    /*
    Används för att suspenda en användare
    bör sätta deras "suspended" attribut till true
    även öka deras "suscounter" +1
    suspension funktionerna kommer vi nog ta som det sista
    lämna tillbaka alla böcker som användaren har lånat (med returnbooks)
    lägg till user i suspended-tabellen
     */

    void unsuspendUser(int userID);
    /*
    används när användare ska sluta vara suspended, gör motsatsen till ovanstående metod
    skillnaden är att suscounter inte minskar
     */






}
