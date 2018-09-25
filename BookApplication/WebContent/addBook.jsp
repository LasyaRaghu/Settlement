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
String message= (String)request.getAttribute("mymessage");
out.println(message+"<br>");

%>
PLEASE FILL UP THE BOOK DETAILS:
<br>
<form action="AddMe" method="get">
ISBN:<input type="text" name="isbn"><br>
NAME OF THE BOOK: <input type="text" name="bookname"><br>
BOOK PRICE: <input type="text" name="price"><br>
NAME OF THE AUTHOR:<input type="text" name="author"><br>
NAME OF THE PUBLICATION:<input type="text" name="publication"><br><br>
<input type="submit" value="ADD NEW BOOK">
</form>
</body>
</html>