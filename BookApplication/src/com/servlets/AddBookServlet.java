package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddMe")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String author = request.getParameter("author");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String bookname = request.getParameter("bookname");
		float price = Float.parseFloat(request.getParameter("price"));
		String publication = request.getParameter("publication");
		Book book =new Book(bookname,isbn,author,publication,price);
		BookDAO dao = new BookDAOImpl();
		int rows = dao.addBook(book);
		PrintWriter writer =response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		if(rows>0)
		{
			writer.println("rows added successfully");
		//RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
		//dispatcher.forward(request, response);
		}
		else
		{
			String message = "please enter correct details";
			request.setAttribute("mymessage", message);
			//writer.println(message);
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("addBook.jsp");
			dispatcher1.forward(request, response);
		}
		writer.println("</body>");	
		writer.println("</html>");
		    
	}

}
