package com.example.libraryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Fultester2 {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1/LibraryApp?useSSL=false",
                "root", "Luddeiversen1234")) {

        LibraryStore store = new LibraryStore();
        //store.returnBook(10);
        //store.createUser(5555,"bbb", "aaa", "220526-1212", 1);
        //store.banUser(5555);
        store.suspendUser(5555);
        //store.unsuspendUser(5555);



        }
    }
}
