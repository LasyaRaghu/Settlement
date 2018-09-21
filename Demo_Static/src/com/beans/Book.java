package com.beans;

import java.io.Serializable;

public class Book implements Serializable,Comparable{
	public int ISBN;
	public String bookName;
	public String bookPublication;
	public String author;
	public double price;
	public Book(int ISBN, String bookName, String bookPublication, String author, double price)
	{
		this.ISBN=ISBN;
		this.bookName=bookName;
		this.bookPublication=bookPublication;
		this.author=author;
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object arg0) {
		Book b= (Book)arg0;
		return (this.ISBN==b.ISBN);
	}
	@Override
	public int hashCode() {
		return 10;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Book b =(Book)arg0;
		return (int)(this.price-b.price);
	}
}
