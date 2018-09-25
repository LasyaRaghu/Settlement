package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connections.MyConnection;
import com.dao.BookDAO;


public class BookDAOImpl implements BookDAO {

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		int rowsAdded=0;
		String ADDBOOK = "insert into book values(?,?,?,?,?)";
		
		Connection con=MyConnection.openConnection();
		try {
			PreparedStatement ps=con.prepareStatement(ADDBOOK);
			ps.setString(2, book.getBookName());
			ps.setInt(1, book.getISBN());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublication());
			ps.setFloat(5, (float) book.getPrice());
			
			rowsAdded = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public boolean updateBook(int ISBN, Book book) {
		// TODO Auto-generated method stub
		
		boolean isUpdated= false;
		String UPDATE_BOOK="update book set price=? where ISBN=?";
		try(Connection con =MyConnection.openConnection();)
		{	
			PreparedStatement ps= con.prepareStatement(UPDATE_BOOK);
			ps.setDouble(1, book.getPrice());
			ps.setInt(2, ISBN);
			int rows=ps.executeUpdate();
			if(rows>0)
			{
				isUpdated=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isUpdated;
	}


	@Override
	public List<Book> findAllBooksByPrice(float price) {
		// TODO Auto-generated method stub
		List<Book> books= new ArrayList<>();
		
		String FIND_BY_PRICE = "select * from book where price=?";
		try(Connection con =MyConnection.openConnection();) {
			PreparedStatement ps= con.prepareStatement(FIND_BY_PRICE);
			ps.setFloat(1, (float) price);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int ISBN = set.getInt(1);
				String bookName=set.getString("bookName");
				String author = set.getString("author");
				String publication = set.getString("bookPublication");
				float price1 = set.getFloat("price");
				Book book = new Book(bookName,ISBN,author,publication,price1);
				books.add(book);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public Book findBookByISBN(int ISBN) {
		// TODO Auto-generated method stub
		Book book = new Book();
		String FIND_BY_ISBN = "select * from book where ISBN=?";
		try(Connection con =MyConnection.openConnection();) {
			PreparedStatement ps= con.prepareStatement(FIND_BY_ISBN);
			ps.setInt(1, (int) ISBN);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int ISBN1 = set.getInt(1);
				String bookName=set.getString("bookName");
				String author = set.getString("author");
				String publication = set.getString("bookPublication");
				float price1 = set.getFloat("price");
				book = new Book(bookName,ISBN1,author,publication,price1);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return book;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
          List<Book> books= new ArrayList<>();
		
		String FIND_ALL = "select * from book";
		try(Connection con =MyConnection.openConnection();) {
			PreparedStatement ps= con.prepareStatement(FIND_ALL);
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int ISBN = set.getInt(1);
				String bookName=set.getString("bookName");
				String author = set.getString("author");
				String publication = set.getString("bookPublication");
				float price1 = set.getFloat("price");
				Book book = new Book(bookName,ISBN,author,publication,price1);
				books.add(book);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	@Override
	public int deleteBook(int isbn) {
		// TODO Auto-generated method stub
		String DELETE ="delete from Book where ISBN=?";
		int rows=0;
		try(Connection con =MyConnection.openConnection();) {
			PreparedStatement ps= con.prepareStatement(DELETE);
			ps.setInt(1, isbn);
			 rows = ps.executeUpdate();
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return rows;
	}

	
	}

