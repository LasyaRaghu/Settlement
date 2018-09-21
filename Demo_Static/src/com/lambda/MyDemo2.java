package com.lambda;

import com.beans.Book;

public class MyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface1 m1 =(x,y)->{System.out.println(x+y);};
	    MyInterface2 m2 =(obj)->{
	                            System.out.println(obj.getPrice());
	    };
       m1.add(2, 3);
       m2.showBook(new Book(2, "Book1", "aditya", "Lasya", 20));
	}
	

}
