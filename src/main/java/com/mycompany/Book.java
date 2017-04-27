package com.mycompany;

/**
 * Created by korne on 26.04.2017.
 */
public class Book {
    private String title;
    private String author;
    boolean isBorrowed = false;


    static int numberOfbooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    void showDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title );
        System.out.println("Am I at library?: " + isBorrowed + "\n");
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
