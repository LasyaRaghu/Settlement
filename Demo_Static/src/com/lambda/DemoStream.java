package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.beans.Book;

public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(3, "Book1", "aditya", "Lasya", 20));
		books.add(new Book(4, "Book2", "aditya1", "Lasya1", 10));
		books.add(new Book(4, "Book2", "aditya1", "Lasya1", 60));
		books.add(new Book(4, "Book2", "aditya1", "Lasya1", 70));
		books.forEach(System.out::println);
        books.forEach((b)->{System.out.println(b.getPrice());});
        //to get stream out of a collection
        Stream<Book> stream = books.stream();
        Stream s1= stream.filter((b)->{
        	return b.getPrice()>10;
        });
        
        s1.forEach(System.out::println);
      //another method
        List<Book> bs= books.stream().filter((b)->{return b.getPrice()>10;}).collect(Collectors.toList());
        System.out.println(bs);
        //instead of collectors
        books.stream().filter((b)->{return b.getPrice()>10;}).forEach(System.out::println);;
        //sorting based on prices
        List<Book> bs1= books.stream().filter((b)->{return b.getPrice()>10;}).sorted((b1,b2)->{return (int)(b1.getPrice()-b2.getPrice());}).collect(Collectors.toList());
        System.out.println(bs1);
	}

}
