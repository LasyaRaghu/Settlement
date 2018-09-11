package com.myio;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader =new FileReader("data.txt");
		/*	byte b=0;
			do {
				int data=reader.read();
				System.out.println((char)data);
				b=(byte)data;
			}while(b!=-1);*/
			int data=reader.read();
			System.out.println(data);
			System.out.println(Integer.toString(data));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
