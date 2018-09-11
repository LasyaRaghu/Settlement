package com.io;

import com.beans.Book;

public class BookOperationsImpl implements BookOperations {

	@Override
	public Book[] findAllBooks() {
		// TODO Auto-generated method stub
		BookPersistence bp = new BookPersistenceImpl();
		Book[] b=bp.readBooks();
		return b;
	}

	@Override
	public Book findBookByName(String bookName) {
		// TODO Auto-generated method stub
		BookPersistence bp = new BookPersistenceImpl();
		Book[] b=bp.readBooks();
		for(int i=0;i<2;i++)
		{
			if(b[i].bookName==bookName)
			{
				return b[i];
			}
		}
		return null;
	}

	@Override
	public Book findBookByISBN(int bookSBN) {
		// TODO Auto-generated method stub
		BookPersistence bp = new BookPersistenceImpl();
		Book[] b=bp.readBooks();
		for(int i=0;i<2;i++)
		{
			if(b[i].ISBN==bookSBN)
			{
				return b[i];
			}
		}
		return null;
	}

	@Override
	public Book[] findBookByAuthor(String authorName) {
		// TODO Auto-generated method stub
		BookPersistence bp = new BookPersistenceImpl();
		Book[] b=bp.readBooks();
		Book[] b1= null;
		for(int i=0;i<2;i++)
		{
			if(b[i].author==authorName)
			{
		      b1[i]=b[i];	
		}
		}
		return b1;
		
	}

}
