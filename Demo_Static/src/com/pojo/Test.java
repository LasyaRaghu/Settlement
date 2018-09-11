package com.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Person[] p =new Person[3];
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   
   for(int i=0;i<p.length;i++)
   {
	  System.out.println("enter personId");
	
	try {
		int perId = Integer.parseInt(br.readLine());
		System.out.println("enter personName");
		  String personName=br.readLine(); 
		  System.out.println("enter personAddress");
		  String personAddress=br.readLine(); 
		  System.out.println("enter personAge");
		  int personAge=Integer.parseInt(br.readLine()); 
		  p[i]=new Person(perId,personName,personAddress,personAge);
	} catch (NumberFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	  
	  }
   
   FileWriter writer=null;
   File myFile = new File("data1.txt");

   try {
   	myFile.createNewFile();
   	System.out.println("file created successfully");
   	writer=new FileWriter("data1.txt");
   	for(int i=0;i<p.length;i++)
   	{
   	writer.write(Integer.toString(p[i].perId));
   	writer.write(p[i].personName);
   	writer.write(p[i].personAddress);
   	writer.write(Integer.toString(p[i].personAge));
   	}
   } catch (IOException e) {
   	// TODO Auto-generated catch block
   	e.printStackTrace();
   }
   finally {
	   try {
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

	}

}
