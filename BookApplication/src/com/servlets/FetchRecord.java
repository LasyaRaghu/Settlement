package com.servlets;

import java.io.IOException;
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
 * Servlet implementation class FetchRecord
 */
@WebServlet("/fetch")
public class FetchRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		BookDAO dao= new BookDAOImpl();
		List<Book> list = dao.findAllBooks();
		request.setAttribute("books",list);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("update.jsp");
		dispatcher1.forward(request, response);
	}

}
