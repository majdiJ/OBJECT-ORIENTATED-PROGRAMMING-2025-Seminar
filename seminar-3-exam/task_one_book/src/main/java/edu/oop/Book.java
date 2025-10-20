package edu.oop; // Do not remove

// Implement your solution here
class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
    }

    public static void main(String[] args) {

    }
}