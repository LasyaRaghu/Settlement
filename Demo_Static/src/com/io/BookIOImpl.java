package com.io;

import com.beans.Book;

public class BookIOImpl implements BookIO {

	@Override
	public Book getBookDetails() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void printBookDetails(Book book) {
		// TODO Auto-generated method stub
		System.out.println(book.author+"\t"+book.bookName+"\t"+book.bookPublication+"\t"+book.ISBN+"\t"+book.price);

	}

}
