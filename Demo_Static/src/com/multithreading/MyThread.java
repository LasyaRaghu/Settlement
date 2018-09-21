package com.multithreading;

public class MyThread extends Thread {

	@Override
	
	public void run()
	{
		System.out.println("running:"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ended:"+Thread.currentThread().getName());
	}
}
