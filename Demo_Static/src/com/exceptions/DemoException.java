package com.exceptions;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int min_bal=900;
       try {
       if(min_bal<1000)
       {
    	   //System.out.println("balance is less than 1000");
			throw new MyException("balance is less than 1000");
		} 
       else
       {
    	   System.out.println("your balance is within limit");
       }}catch (MyException e) {
			// TODO Auto-generated catch block
			e.display();
			//e.printStackTrace();
		}
       }
       
	}


