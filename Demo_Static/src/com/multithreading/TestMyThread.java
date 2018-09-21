package com.multithreading;

public class TestMyThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.out.println("start inside main"+Thread.currentThread().getName());
     //System.out.println(Thread.currentThread().getPriority());
     Thread t= new MyThread();
     //t.setPriority(10);
     t.start();
     t.join();
     Thread t1= new MyThread();
     t1.start();
     t1.join();
     //int p =t.getPriority();
     //System.out.println(p);
     System.out.println("end: inside main"+Thread.currentThread().getName());
	}

}
