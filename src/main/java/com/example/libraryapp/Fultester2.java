package com.example.libraryapp;

import java.sql.*;
import java.util.Date;

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
        //   store.storeLendBook(10,5555);
        //Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        //Timestamp timeOfSus = store.getUserSuspensionDate(5555);
        //System.out.println(currentTime);
        //System.out.println(timeOfSus);
        //long time = currentTime.getTime();
        //long timeSus = timeOfSus.getTime();
        //System.out.println(time);
        //System.out.println(timeSus);
        //Timestamp loanTime = store.getUserOldestBook(5555);
        //long timeLoan = loanTime.getTime();
        //   System.out.println(timeLoan);

        //   long diff = time - timeSus;


        //   System.out.println(diff);

        }
    }
}
