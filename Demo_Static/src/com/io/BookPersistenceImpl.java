package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.beans.Book;
import com.pojo.Person;

public class BookPersistenceImpl implements BookPersistence {

	@Override
	public boolean writeBooks(Book[] books) {
		FileOutputStream fo;
		 ObjectOutputStream oo;
		try {
			fo = new FileOutputStream("books.txt");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(books);
			oo.close();
			fo.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book[] readBooks() {
		FileInputStream fi;
		ObjectInputStream oi;
		Object[] o = null ;
		Book[] b =null;
		try {
			fi = new FileInputStream("books.txt");
			oi = new ObjectInputStream(fi);
			
			b = (Book[])o;
			for(int i=0;i<2;i++)
				{
				o[i]= oi.readObject();
				System.out.println(b[i].author+"\t"+b[i].bookName+"\t"+b[i].bookPublication+"\t"+b[i].ISBN+"\t"+b[i].price);
				}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return b;
	}

}
