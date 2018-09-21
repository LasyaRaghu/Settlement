package com.exceptions;

import java.util.Scanner;

public class ExcerciseExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = new int[3];
     Scanner sc = new Scanner(System.in);
     ExceptionHandling e1[] = new ExceptionHandling[3];
     for(int i=0;i<3;i++)
     {
    	
    	int rollNo=sc.nextInt(); 
    	String name=sc.next();
    	int age=sc.nextInt();
    	try {
    	if(rollNo<0||name.length()<4||age>18)
    	{
    		
				throw new ExceptionHandling();
    	}
    	else {
        	e1[i]=new ExceptionHandling(rollNo,name,age);
        	}
			} catch (ExceptionHandling e) {
				// TODO Auto-generated catch block
				e.display();
				//e.printStackTrace();
			}
    	}
    	 
    	
     
     try {
     for(int i=0;i<4;i++)
     {
    	 if(i>arr.length-1)
    	 {
    		throw new ExceptionHandling(); 
    	 }
    	 else
    	 {
    	 arr[i]=sc.nextInt();
    	 }
    	 
     }
     }
     catch(ExceptionHandling e) {
    	 e.display();
     }
     
     
	}
}


