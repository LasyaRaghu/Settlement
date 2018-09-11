package com.myio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer=null;
		try {
			System.out.println("enter your name:");
			String name=br.readLine();
			System.out.println("enter your address");
			String address = br.readLine();
			
			System.out.println("enter atleast two hobbies: no of hobbies u want to input");
			int number=Integer.parseInt(br.readLine());
			String hobbies[]= new String[number];
			for(int i=0;i<number;i++)
			{
				hobbies[i]=br.readLine();
			}
			
		       
				writer=new FileWriter("data.txt",true);
				writer.write(name+"\n");
				writer.write(address+"\n");
				for(int i=0;i<number;i++)
					writer.write(hobbies[i]+"\n");
				
				System.out.println("file written successfully");
		       
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


