import java.util.HashSet;
import java.util.Set;

import com.beans.Book;

public class BookSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Book> books = new HashSet<>();
   //books.add(new Book());
   books.add(new Book(1,"Core Java","aditya","lasya",18.6d));
   books.add(new Book(1,"Core Java","aditya","lasya",18.6d));
   System.out.println("size:"+books.size());
	}

}
