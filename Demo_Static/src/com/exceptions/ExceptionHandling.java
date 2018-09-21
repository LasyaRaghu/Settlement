package com.exceptions;

public class ExceptionHandling extends Exception {
	private String message;
	private int rollNo;
	private String name;
	private int age;
 public ExceptionHandling() {
	 message="array index is out of bounds";
 }
 public ExceptionHandling(int rollno, String name, int age) {
	 this.rollNo=rollno;
	 this.name=name;
	 this.age=age;
 }
 public void display()
 {
	 System.out.println("array index is out of bounds");
 }
}
