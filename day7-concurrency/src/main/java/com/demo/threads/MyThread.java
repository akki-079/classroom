package com.demo.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread started...."+name+" "+Thread.currentThread().getPriority());

		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread running...."+name);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		super.run();
		System.out.println("Thread ended...."+name);

	}
}
