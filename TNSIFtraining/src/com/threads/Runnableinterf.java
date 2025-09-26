package com.threads;

public class Runnableinterf implements Runnable {
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			try {
				System.out.println("hello");
				Thread.sleep(2000);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("thresds"+Thread.currentThread());
	}

}
