package com.multithreading;

public class DemoWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("thread main started");
       DemoNotify t1 = new DemoNotify();
       t1.start();
       synchronized(t1) {
    	   try {
			t1.wait();
			 System.out.println(t1.sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       System.out.println("thread main ended");
      
	}

}
