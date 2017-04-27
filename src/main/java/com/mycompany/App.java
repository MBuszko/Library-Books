package com.mycompany;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Library myLibrary = new Library();

        myLibrary.addBook("Cloud Atlas", "Mitchell");
        myLibrary.shelf[0].showDetails();


        myLibrary.addBook("Tomcio Paluch", "A bo ja wiem...");
        myLibrary.shelf[1].showDetails();

        myLibrary.borrowBook(1);
        myLibrary.shelf[1].showDetails();
        myLibrary.returnBook(1);
        myLibrary.shelf[1].showDetails();

        System.out.println();

        myLibrary.howManyBooks();
       // System.out.println("Borrowed books: " + myLibrary.borrowedBooks());

    }
}
