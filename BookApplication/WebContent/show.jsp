<%@page import="com.beans.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List <Book> list =(List<Book>)request.getAttribute("books");
%>
<table border="1">
<%
for(Book b:list)
{
%>
<tr>
 <td><% out.println(b.getBookName()); %></td>
 <td><% out.println(b.getAuthor()); %></td>
 <td><% out.println(b.getISBN()); %></td>
 <td><% out.println(b.getPrice()); %></td>
 <td><% out.println(b.getPublication()); %></td>
 </tr>
 <% }%>
 </table>
</body>
</html>