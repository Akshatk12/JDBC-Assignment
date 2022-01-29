package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import persistance.Book;
import service.*;

public class BookStoreApp {
	public static void main(String[] args) {
		BookService bookservice = new BookServiceImp();

		System.out.println("Adding book records");
		bookservice.addBook(new Book("1234", "Java", "Akshat", Date.valueOf("2022-01-29"), 453.44));
		bookservice.addBook(new Book("5674", "Python", "Mayank", Date.valueOf("2022-01-29"), 785.44));
		bookservice.addBook(new Book("9123", "C++", "Karan", Date.valueOf("2022-01-29"), 567.44));

		printBooks(bookservice);

		System.out.println("Updating book record");
		bookservice.updateBook(new Book("1234", "JAVA", "Avee", Date.valueOf("2022-01-30"), 634.55));
		System.out.println(bookservice.getBookById(1));

		System.out.println("Deleting book record");
		bookservice.removeBook(1);
		printBooks(bookservice);

	}

	private static void printBooks(BookService bookservice) {
		System.out.println("Printing all book records");
		List<Book> books = new ArrayList<>();
		books = bookservice.getAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}