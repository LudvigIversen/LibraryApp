package com.example.libraryapp;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.sql.SQLException;
import java.util.ArrayList;


public class ManagerTests {


    @Test
    void checkIfUserCanLendTest1() throws SQLException {
        LibraryStore str = mock(LibraryStore.class);
        LibraryManager cut = new LibraryManager(str);

        when(str.getUser(5555)).thenReturn(
                new User(5555, "aaa", "bbb", "010101-5555", 1, 0, false)
        );

        ArrayList<Book> books = new ArrayList<Book>();
        Book one = new Book(1, 123456, "aaa","bbb" );
        Book two = new Book(2, 123456, "aaa","bbb" );

        books.add(one);
        books.add(two);

        when(str.getUserBooks(5555)).thenReturn(books);

        assertEquals(true, cut.checkIfUserCanLend(5555));


    }

    @Test
    void checkIfUserCanLendTest2() throws SQLException {
        LibraryStore str = mock(LibraryStore.class);
        LibraryManager cut = new LibraryManager(str);

        when(str.getUser(5555)).thenReturn(
                new User(5555, "aaa", "bbb", "010101-5555", 1, 0, false)
        );

        ArrayList<Book> books = new ArrayList<Book>();
        Book one = new Book(1, 123456, "aaa","bbb" );
        Book two = new Book(2, 123456, "aaa","bbb" );
        Book three = new Book(2, 123456, "aaa","bbb" );

        books.add(one);
        books.add(two);
        books.add(three);

        when(str.getUserBooks(5555)).thenReturn(books);

        assertEquals(false, cut.checkIfUserCanLend(5555));


    }

}
