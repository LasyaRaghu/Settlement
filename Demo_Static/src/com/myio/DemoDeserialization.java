package com.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.Person;

public class DemoDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi;
		ObjectInputStream oi;
		try {
			fi = new FileInputStream("person.txt");
			oi = new ObjectInputStream(fi);
			Object o = oi.readObject();
			
			Person p =(Person)o;
			System.out.println(p.perId+"\t"+p.personAddress+"\t"+p.personAge+"\t"+p.personName);
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

}
}
