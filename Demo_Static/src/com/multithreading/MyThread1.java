package com.multithreading;

public class MyThread1 extends Thread {
	private int num;
	MyThread1()
	{
		num=10;
	}
    MyThread1(int num)
    {
    	this.num= num;
    }
    @Override
    public void run()
    {
    	System.out.println("Thread running:"+Thread.currentThread().getName());
    	if(num%2==0)
    	{
    		System.out.println("num is divisible by 2");
    	}
    	else
    		System.out.println("not divisible by 2");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread t1 = new MyThread1(100);
     Thread t2 = new MyThread1(105);
     Thread t3= new MyThread1();
     t1.start();
     t3.start();
     t2.start();
     System.out.println("Thread running:"+Thread.currentThread().getName());
	}

}
