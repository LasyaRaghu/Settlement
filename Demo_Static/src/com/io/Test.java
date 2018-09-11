package com.io;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.beans.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Book b[]=new Book[2];
    Book b1;
    BookPersistence bp = new BookPersistenceImpl();
    BookOperations bo= new BookOperationsImpl();
    for(int i=0;i<2;i++)
    {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	try {
    		System.out.println("enter ISBN");
			int ISBN = Integer.parseInt(br.readLine());
			System.out.println("enter bookname");
			String bookName = br.readLine();
			System.out.println("enter bookpublication");
			String bookPublication = br.readLine();
			System.out.println("enter author");
			String author = br.readLine();
			System.out.println("enter price");
			double price = Double.parseDouble(br.readLine());
			b[i]=new Book(ISBN,bookName,bookPublication,author,price);
			
			
			} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    boolean value=bp.writeBooks(b);
    System.out.println("1.show all the books 2.find book by ISBN 3.find book by name 4.find book by author");
    Scanner sc = new Scanner(System.in);
    int input=sc.nextInt();
    switch(input)
    {
    case 1:
    	b=bo.findAllBooks();
    	break;
    case 2:
    	System.out.println("enter book ISBN");
    	int bookSBN=sc.nextInt();
    	b1=bo.findBookByISBN(bookSBN);
    	break;
    case 3:
    	System.out.println("enter bookname");
    	String bookName=sc.nextLine() ;
    	b1=bo.findBookByName(bookName);
    	break;
    case 4:
    	System.out.println("enter authorname");
    	String authorName=sc.nextLine() ;
    	b=bo.findBookByAuthor(authorName);
    	break;
    }
	}

}
