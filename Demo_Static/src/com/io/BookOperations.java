package com.io;

import com.beans.Book;

public interface BookOperations {
Book[] findAllBooks();
Book findBookByName(String bookName);
Book findBookByISBN(int bookSBN);
Book[] findBookByAuthor(String authorName);
}
