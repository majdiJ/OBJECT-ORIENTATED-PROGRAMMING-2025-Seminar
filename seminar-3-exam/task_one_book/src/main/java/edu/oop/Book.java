package edu.oop; // Do not remove

// Implement your solution here
class Book {
    private static String title;
    private static String author;
    private static int pages;

    public Book(String title, String author, int pages) {
        Book.title = title;
        Book.author = author;
        Book.pages = pages;
    }

    public String getTitle() {
        return Book.title;
    }

    public String getAuthor() {
        return Book.author;
    }

    public int getPages() {
        return Book.pages;
    }

    public void displayDetails() {
        System.out.println("Title: " + Book.title);
        System.out.println("Author: " + Book.author);
        System.out.println("Pages: " + Book.pages);
    }

    public static void main(String[] args) {

    }
}