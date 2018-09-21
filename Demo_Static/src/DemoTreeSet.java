import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Set<Book> books = new TreeSet<>(new BookComparator());
   //books.add(new Book());
   books.add(new Book(1,"Core Java","aditya","lasya",18.6d));
   books.add(new Book(1,"Core Java","aditya","lasya",18.6d));
   System.out.println("size:"+books.size());
   System.out.println(books);
	}
}
