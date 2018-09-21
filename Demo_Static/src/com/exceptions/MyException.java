package com.exceptions;


public class MyException extends Exception {
	private String message;
	public MyException() {
		message="you got an exception";
		
	}
	public MyException(String message)
	{
		super(message);
		this.message=message;
	}
	public void display()
	{
		System.out.println("cause of failure:-"+getMessage());
	}
	

}
