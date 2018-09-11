package com.beans;

import java.io.Serializable;

public class Book implements Serializable{
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
}
