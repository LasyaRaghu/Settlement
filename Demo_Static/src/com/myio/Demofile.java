package com.myio;

import java.io.File;
import java.io.IOException;

public class Demofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File myFile = new File("data.txt");
       try {
		myFile.createNewFile();
		System.out.println("file created successfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}

}
