package com.beans;


//import java.io.Serializable;

public class Book  {
	
	private String bookName,author,publication;
	private int ISBN;
	private float price;
	
	public Book() {
		
	}

	public Book(String bookName, int ISBN,String author,String publication, float price) {
		super();
		this.ISBN = ISBN;
		this.bookName = bookName;
		this.author = author;
		this.publication = publication;
		this.price =  price;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price =  price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", publication=" + publication + ", ISBN=" + ISBN
				+ ", price=" + price + "]";
	}

	
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Book b = (Book) obj;
//		return (this.ISBN==b.ISBN);
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return bookName.length();
//	}
//
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Book b = (Book) o;
////		return (int)(this.price-b.price);
//		return this.bookName.compareToIgnoreCase(b.bookName);
//	}

}
