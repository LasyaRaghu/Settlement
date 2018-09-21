package com.lambda;

public class MyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyInterface m=()->{System.out.println("hello");};  //this is same as MyDemo logic-This happens only for functional interface
       //In functional Interface only single method so, only that method is overridden.
       m.greeting();
	}

}
