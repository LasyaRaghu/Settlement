package com.myio;
import com.pojo.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demoserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fo;
		 ObjectOutputStream oo;
		try {
			fo = new FileOutputStream("person.txt");
			oo = new ObjectOutputStream(fo);
			oo.writeObject(new Person(13,"ABCD","Pune",30));
			oo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        
	}

}
