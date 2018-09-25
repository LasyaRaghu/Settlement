package com.dao;

import java.util.List;

import com.beans.Book;

public interface BookDAO {
	
	int addBook(Book book);
	boolean updateBook(int ISBN,Book book);
	List<Book> findAllBooksByPrice(float price);
	Book findBookByISBN (int ISBN);
	List<Book> findAllBooks();
	int deleteBook(int ISBN);
	
}
