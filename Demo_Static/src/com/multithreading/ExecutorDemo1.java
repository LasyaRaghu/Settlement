package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyApp implements Runnable {
	public void run() {
		perform();
	}


public void perform() {
	System.out.println(Thread.currentThread().getName());
}
}
public class ExecutorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExecutorService exec = Executors.newFixedThreadPool(3);
      for(int i=0;i<3;i++)
      {
    	  exec.execute(new MyApp());
      }
      System.out.println("after submitting tasks");
      System.out.println("after for loop");
      exec.execute(new MyApp());
      exec.shutdown();
      System.out.println("done");
	}

}
