package com.myio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.pojo.Person;

public class DemoThrows {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo;
		 ObjectOutputStream oo;
		
			fo = new FileOutputStream("person.txt");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(new Person(13,"ABCD","Pune",30));
			oo.close();
			fo.close();
		
      
        
	}
}
