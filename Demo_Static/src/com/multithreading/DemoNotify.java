package com.multithreading;

public class DemoNotify extends Thread {
	public int sum=0;
	public void run()
	{
		System.out.println("thread t1 started");
		for(int i=0;i<10;i++)
		{
			sum=sum+i;
		}
		synchronized(this){
			Thread.currentThread().notify();
		}
		System.out.println("thread t1 ended");
	}
	

}
