package com.example.libraryapp;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class TestFörDatabasConnection {
    public static void main(String[] args) throws SQLException {
        // Läser in drivrutinen
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver did not load");
        }

        // Gör uppkoppling mot databasen
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {
            System.out.println("Connected");
            System.out.println(" ");
        }
        LibraryStore store = new LibraryStore();


        System.out.println("Alla böcker available som är lasten");

        ArrayList<Book> bookss = store.getBookWithTitle("Lasten");

        for (int i = 0; i < bookss.size(); i++) {
            System.out.println(bookss.get(i).toString());
        }


        /*

        User user = store.getUser(1234);

        System.out.println(user.toString());

        ArrayList<Integer> IDs = store.getAllUserID();

        for (int i = 0; i < IDs.size(); i++) {
            System.out.println(IDs.get(i).intValue());
        }


         */

        System.out.println("Mina lånade böcker");
        ArrayList<Book> books = store.getUserBooks(1234);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }

        System.out.println(books.size());



        /*

        ArrayList<String> numbers = store.getUserPersonalNumbers();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

         */

        store.returnBook(10);

        System.out.println("Mina lånade böcker efter return");
        ArrayList<Book> book = store.getUserBooks(1234);

        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i).toString());
        }

        System.out.println(book.size());

        System.out.println("Alla böcker available som är lasten efter retur");

        ArrayList<Book> ookss = store.getBookWithTitle("Lasten");

        for (int i = 0; i < ookss.size(); i++) {
            System.out.println(ookss.get(i).toString());
        }


    }
}
