package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter writer =response.getWriter();
		//writer.println("Lasya");
		int isbn =Integer.parseInt(request.getParameter("isbn"));
		
		//writer.println("Lasya");
		float price =Float.parseFloat(request.getParameter("price"));
		Book book= new Book();
		book.setPrice(price);
		BookDAO dao=new BookDAOImpl();
		boolean updated=dao.updateBook(isbn, book);
		if(updated)
		{
			
			//writer.println("Lasya");
			Book book2 =dao.findBookByISBN(isbn);
			List<Book> books =new ArrayList<>();
			books.add(book2);
			request.setAttribute("books",books);
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("show_jstl.jsp");
			dispatcher1.forward(request, response);
			
		}
		else
		{
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("fetch");
			dispatcher1.forward(request, response);
		}
		
	}

}
