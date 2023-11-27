package com.telran.org.homeworkfifteen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookShelByLambdaApp {
    public static void main(String[] args) {
        Author author1 = new Author("Jack", "Brown", 1971);
        Author author2 = new Author("Dave", "Smith", 1962);
        Author author3 = new Author("Dereck", "Lam", 1953);
        Author author4 = new Author("Sam", "Green", 1944);
        Author author5 = new Author("Gerbert", "Linch", 1935);
        Author author6 = new Author("John", "Dou", 1926);

        Publisher publisher1 = new Publisher("Silver Bullet", 1891);
        Publisher publisher2 = new Publisher("Dagon", 1952);
        Publisher publisher3 = new Publisher("Far Away", 1963);

        Book book1 = new Book("Autobiography", 221, 1991, author1, publisher1);
        Book book2 = new Book("Imagination", 232, 1982, author2, publisher2);
        Book book3 = new Book("Mystery Files", 243, 2003, author3, publisher3);
        Book book4 = new Book("Grand Tour", 354, 2004, author4, publisher1);
        Book book5 = new Book("Big Story", 455, 1975, author5, publisher2);
        Book book6 = new Book("Love Simphony", 166, 1966, author6, publisher3);
        Book book7 = new Book("True Story", 377, 2007, author1, publisher1);

        List<Book> bookList = Arrays.asList(book1, book2, book3, book4, book5, book6, book7);

        System.out.println("Select a sorting option :");
        System.out.println("1 - sort by author");
        System.out.println("2 - sort by year of publishing");
        System.out.println("3 - sort by publisher");
        Scanner scanner = new Scanner(System.in);
        int sortBy = scanner.nextInt();

        switch (sortBy){
            case 1:
                bookList.sort(Comparator.comparing(bookA -> bookA.getAuthor().getSurname()));
                System.out.println("Sorted book list:");
                for (Book bookSort1 : bookList) {
                    System.out.println(bookSort1);
                }
                break;

            case 2:
                bookList.sort(Comparator.comparingInt(Book::getYearOfPublishing));
                System.out.println("Sorted book list:");
                for (Book bookSort2 : bookList) {
                    System.out.println(bookSort2);
                }
                break;

            case 3:

                bookList.sort(Comparator.comparing(bookA -> bookA.getPublisher().getPublisherName()));
                System.out.println("Sorted book list:");
                for (Book bookSort3 : bookList) {
                    System.out.println(bookSort3);
                }
                break;

            default:
                System.out.println("Invalid sorting option");
        }
    }
}
