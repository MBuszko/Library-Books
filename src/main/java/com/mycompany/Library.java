package com.mycompany;

import java.util.ArrayList;

/**
 * Created by korne on 26.04.2017.
 */
public class Library {
    Book [] shelf = new Book[5];
    private int bookIndex = 0;

    //adding book
    void addBook (String title, String author)
    {
        Book newBook = new Book (title, author);
        shelf[bookIndex] = newBook;
        bookIndex++;
    }



    //borrow book, set books parameter isBorrowed to true
    public void borrowBook (int bookNumber) {
        for (int i = 0; i < shelf.length; i++) {
            if (i == bookNumber)
                shelf[i].isBorrowed = true;
        }
    }

    public void returnBook(int bookNumber)
    {
        for (int i = 0; i < shelf.length; i++) {
            if (i == bookNumber)
                shelf[i].isBorrowed = false;
        }
    }

    public void howManyBooks()
    {
        System.out.println("Books at library: " + bookIndex);
    }


    //not finished
   /* public int borrowedBooks()
    {
        int borrowedBooks = 0;

        for (int i = 0; i < shelf.length; i++) {

        }
        return borrowedBooks;
    }*/
}
