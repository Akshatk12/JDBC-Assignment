package service;

import java.util.ArrayList;
import java.util.List;

import model.exceptions.*;
import persistance.*;




public class BookServiceImp implements BookService{

	private BookDao bookDao = null;
	
	public BookServiceImp() {
		bookDao = new BookDaoImp();
	}

	@Override
	public List<Book> getAllBooks() throws DataAccessException {
		List<Book> books = new ArrayList<>();
		books = bookDao.getAllBooks();
		return books;
	}

	@Override
	public Book getBookById(int bookId) throws BookNotFoundException, DataAccessException {
		Book book = null;
		book = bookDao.getBookById(bookId);
		return book;
	}

	@Override
	public void addBook(Book book) throws DataAccessException {
		bookDao.addBook(book);
	}

	@Override
	public void updateBook(Book book) throws DataAccessException {
		bookDao.updateBook(book);
	}

	@Override
	public void removeBook(int bookId) throws DataAccessException {
		bookDao.removeBook(bookId);
	}

}