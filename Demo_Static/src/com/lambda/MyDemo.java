package com.lambda;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyInterface m = new MyInterface() {

			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("welcome to inner classes");
			}
        	
        };
        m.greeting();
	}

}
