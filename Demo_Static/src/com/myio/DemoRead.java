package com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead {
public static void main(String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please enter the name");
	try {
	String name= br.readLine();
	System.out.println(name);
	}
	catch (IOException e) {
		e.printStackTrace();
		
		// TODO: handle exception
	}
		
	
}
}
